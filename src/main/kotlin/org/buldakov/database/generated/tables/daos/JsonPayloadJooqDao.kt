/*
 * This file is generated by jOOQ.
 */
package org.buldakov.database.generated.tables.daos


import kotlin.collections.List

import org.buldakov.database.generated.tables.JsonPayloadTable
import org.buldakov.database.generated.tables.pojos.JsonPayloadPojo
import org.buldakov.database.generated.tables.records.JsonPayloadRecord
import org.jooq.Configuration
import org.jooq.JSON
import org.jooq.impl.DAOImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonPayloadJooqDao(configuration: Configuration?) : DAOImpl<JsonPayloadRecord, JsonPayloadPojo, String>(JsonPayloadTable.JSONPAYLOAD, JsonPayloadPojo::class.java, configuration) {

    /**
     * Create a new JsonPayloadJooqDao without any configuration
     */
    constructor(): this(null)

    override fun getId(o: JsonPayloadPojo): String? = o.name

    /**
     * Fetch records that have <code>name BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfName(lowerInclusive: String?, upperInclusive: String?): List<JsonPayloadPojo> = fetchRange(JsonPayloadTable.JSONPAYLOAD.NAME, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>name IN (values)</code>
     */
    fun fetchByName(vararg values: String): List<JsonPayloadPojo> = fetch(JsonPayloadTable.JSONPAYLOAD.NAME, *values)

    /**
     * Fetch a unique record that has <code>name = value</code>
     */
    fun fetchOneByName(value: String): JsonPayloadPojo? = fetchOne(JsonPayloadTable.JSONPAYLOAD.NAME, value)

    /**
     * Fetch records that have <code>rules BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfRules(lowerInclusive: JSON?, upperInclusive: JSON?): List<JsonPayloadPojo> = fetchRange(JsonPayloadTable.JSONPAYLOAD.RULES, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>rules IN (values)</code>
     */
    fun fetchByRules(vararg values: JSON): List<JsonPayloadPojo> = fetch(JsonPayloadTable.JSONPAYLOAD.RULES, *values)

    /**
     * Fetch records that have <code>defaultValue BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    fun fetchRangeOfDefaultvalue(lowerInclusive: Byte?, upperInclusive: Byte?): List<JsonPayloadPojo> = fetchRange(JsonPayloadTable.JSONPAYLOAD.DEFAULTVALUE, lowerInclusive, upperInclusive)

    /**
     * Fetch records that have <code>defaultValue IN (values)</code>
     */
    fun fetchByDefaultvalue(vararg values: Byte): List<JsonPayloadPojo> = fetch(JsonPayloadTable.JSONPAYLOAD.DEFAULTVALUE, *values.toTypedArray())
}
