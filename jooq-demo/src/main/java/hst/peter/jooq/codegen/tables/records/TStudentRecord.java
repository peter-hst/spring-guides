/*
 * This file is generated by jOOQ.
 */
package hst.peter.jooq.codegen.tables.records;


import hst.peter.jooq.codegen.tables.TStudent;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TStudentRecord extends UpdatableRecordImpl<TStudentRecord> implements Record3<Integer, String, Integer> {

    private static final long serialVersionUID = 2103242667;

    /**
     * Setter for <code>demodb.t_student.id</code>.
     */
    public void setId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>demodb.t_student.id</code>.
     */
    public Integer getId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>demodb.t_student.name</code>.
     */
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>demodb.t_student.name</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>demodb.t_student.age</code>.
     */
    public void setAge(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>demodb.t_student.age</code>.
     */
    public Integer getAge() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Integer, String, Integer> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Integer, String, Integer> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return TStudent.T_STUDENT.ID;
    }

    @Override
    public Field<String> field2() {
        return TStudent.T_STUDENT.NAME;
    }

    @Override
    public Field<Integer> field3() {
        return TStudent.T_STUDENT.AGE;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getName();
    }

    @Override
    public Integer component3() {
        return getAge();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getName();
    }

    @Override
    public Integer value3() {
        return getAge();
    }

    @Override
    public TStudentRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public TStudentRecord value2(String value) {
        setName(value);
        return this;
    }

    @Override
    public TStudentRecord value3(Integer value) {
        setAge(value);
        return this;
    }

    @Override
    public TStudentRecord values(Integer value1, String value2, Integer value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TStudentRecord
     */
    public TStudentRecord() {
        super(TStudent.T_STUDENT);
    }

    /**
     * Create a detached, initialised TStudentRecord
     */
    public TStudentRecord(Integer id, String name, Integer age) {
        super(TStudent.T_STUDENT);

        set(0, id);
        set(1, name);
        set(2, age);
    }
}