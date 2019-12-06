/*
 * This file is generated by jOOQ.
 */
package hst.peter.jooq.codegen.tables;


import hst.peter.jooq.codegen.Demodb;
import hst.peter.jooq.codegen.tables.records.T1Record;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row2;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class T1 extends TableImpl<T1Record> {

    private static final long serialVersionUID = -1139804375;

    /**
     * The reference instance of <code>demodb.t1</code>
     */
    public static final T1 T1 = new T1();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<T1Record> getRecordType() {
        return T1Record.class;
    }

    /**
     * The column <code>demodb.t1.id</code>.
     */
    public final TableField<T1Record, Integer> ID = createField(DSL.name("id"), org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>demodb.t1.name</code>.
     */
    public final TableField<T1Record, String> NAME = createField(DSL.name("name"), org.jooq.impl.SQLDataType.VARCHAR(64), this, "");

    /**
     * Create a <code>demodb.t1</code> table reference
     */
    public T1() {
        this(DSL.name("t1"), null);
    }

    /**
     * Create an aliased <code>demodb.t1</code> table reference
     */
    public T1(String alias) {
        this(DSL.name(alias), T1);
    }

    /**
     * Create an aliased <code>demodb.t1</code> table reference
     */
    public T1(Name alias) {
        this(alias, T1);
    }

    private T1(Name alias, Table<T1Record> aliased) {
        this(alias, aliased, null);
    }

    private T1(Name alias, Table<T1Record> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""));
    }

    public <O extends Record> T1(Table<O> child, ForeignKey<O, T1Record> key) {
        super(child, key, T1);
    }

    @Override
    public Schema getSchema() {
        return Demodb.DEMODB;
    }

    @Override
    public T1 as(String alias) {
        return new T1(DSL.name(alias), this);
    }

    @Override
    public T1 as(Name alias) {
        return new T1(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public T1 rename(String name) {
        return new T1(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public T1 rename(Name name) {
        return new T1(name, null);
    }

    // -------------------------------------------------------------------------
    // Row2 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row2<Integer, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }
}
