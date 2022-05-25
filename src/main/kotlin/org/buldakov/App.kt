package org.buldakov

import org.buldakov.database.generated.tables.references.JSONPAYLOAD
import org.jooq.SQLDialect
import org.jooq.conf.Settings
import org.jooq.impl.DSL
import java.sql.DriverManager

fun main() {

    data class RuleTest(val name: String, val test: Boolean)

    data class Rule(val name: String, val test: Boolean, val rule: RuleTest)

    data class JsonPayload(val name: String, val rules: List<Rule>, val defaultValue: Boolean)


    val ds = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "user", "password")
    val settings = Settings()
    val dsl = DSL.using(ds, SQLDialect.MYSQL, settings)


    dsl.insertInto(JSONPAYLOAD)
        .set(dsl.newRecord(
            JSONPAYLOAD,
            JsonPayload(
                "Test",
                listOf(Rule("rule1", false, RuleTest("rule1", false)),
                    Rule("rule2", true, RuleTest("rule1", false))),
                true
            )
        ))
        .execute()


    val payload = dsl.selectFrom(JSONPAYLOAD).fetch().into(JsonPayload::class.java)

    println(payload)

}