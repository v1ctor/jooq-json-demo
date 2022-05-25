/*
 * This file is generated by jOOQ.
 */
package org.buldakov.database.generated.tables.records


import org.buldakov.database.generated.tables.JsonPayloadTable
import org.buldakov.database.generated.tables.pojos.JsonPayloadPojo
import org.jooq.Field
import org.jooq.JSON
import org.jooq.Record1
import org.jooq.Record3
import org.jooq.Row3
import org.jooq.impl.UpdatableRecordImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class JsonPayloadRecord() : UpdatableRecordImpl<JsonPayloadRecord>(JsonPayloadTable.JSONPAYLOAD), Record3<String?, JSON?, Byte?> {

    var name: String?
        set(value): Unit = set(0, value)
        get(): String? = get(0) as String?

    var rules: JSON?
        set(value): Unit = set(1, value)
        get(): JSON? = get(1) as JSON?

    var defaultvalue: Byte?
        set(value): Unit = set(2, value)
        get(): Byte? = get(2) as Byte?

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    override fun key(): Record1<String?> = super.key() as Record1<String?>

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    override fun fieldsRow(): Row3<String?, JSON?, Byte?> = super.fieldsRow() as Row3<String?, JSON?, Byte?>
    override fun valuesRow(): Row3<String?, JSON?, Byte?> = super.valuesRow() as Row3<String?, JSON?, Byte?>
    override fun field1(): Field<String?> = JsonPayloadTable.JSONPAYLOAD.NAME
    override fun field2(): Field<JSON?> = JsonPayloadTable.JSONPAYLOAD.RULES
    override fun field3(): Field<Byte?> = JsonPayloadTable.JSONPAYLOAD.DEFAULTVALUE
    override fun component1(): String? = name
    override fun component2(): JSON? = rules
    override fun component3(): Byte? = defaultvalue
    override fun value1(): String? = name
    override fun value2(): JSON? = rules
    override fun value3(): Byte? = defaultvalue

    override fun value1(value: String?): JsonPayloadRecord {
        this.name = value
        return this
    }

    override fun value2(value: JSON?): JsonPayloadRecord {
        this.rules = value
        return this
    }

    override fun value3(value: Byte?): JsonPayloadRecord {
        this.defaultvalue = value
        return this
    }

    override fun values(value1: String?, value2: JSON?, value3: Byte?): JsonPayloadRecord {
        this.value1(value1)
        this.value2(value2)
        this.value3(value3)
        return this
    }

    /**
     * Create a detached, initialised JsonPayloadRecord
     */
    constructor(name: String? = null, rules: JSON? = null, defaultvalue: Byte? = null): this() {
        this.name = name
        this.rules = rules
        this.defaultvalue = defaultvalue
    }

    /**
     * Create a detached, initialised JsonPayloadRecord
     */
    constructor(value: JsonPayloadPojo?): this() {
        if (value != null) {
            this.name = value.name
            this.rules = value.rules
            this.defaultvalue = value.defaultvalue
        }
    }
}
