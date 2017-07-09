/*
 * This file is generated by jOOQ.
*/
package com.mp.model.jooq.tables.records;


import com.mp.model.jooq.tables.InfUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class InfUserRecord extends UpdatableRecordImpl<InfUserRecord> implements Record7<String, String, String, String, String, String, String> {

    private static final long serialVersionUID = 594897964;

    /**
     * Setter for <code>testdb.inf_user.user_id</code>.
     */
    public void setUserId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>testdb.inf_user.user_id</code>.
     */
    public String getUserId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>testdb.inf_user.user_name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>testdb.inf_user.user_name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>testdb.inf_user.nick_name</code>.
     */
    public void setNickName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>testdb.inf_user.nick_name</code>.
     */
    public String getNickName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>testdb.inf_user.first_name</code>.
     */
    public void setFirstName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>testdb.inf_user.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>testdb.inf_user.last_name</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>testdb.inf_user.last_name</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>testdb.inf_user.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>testdb.inf_user.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>testdb.inf_user.mobile_number</code>.
     */
    public void setMobileNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>testdb.inf_user.mobile_number</code>.
     */
    public String getMobileNumber() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return InfUser.INF_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InfUser.INF_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InfUser.INF_USER.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InfUser.INF_USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InfUser.INF_USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InfUser.INF_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InfUser.INF_USER.MOBILE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNickName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getFirstName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getLastName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getMobileNumber();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value1(String value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value3(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value4(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value5(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord value7(String value) {
        setMobileNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfUserRecord values(String value1, String value2, String value3, String value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InfUserRecord
     */
    public InfUserRecord() {
        super(InfUser.INF_USER);
    }

    /**
     * Create a detached, initialised InfUserRecord
     */
    public InfUserRecord(String userId, String userName, String nickName, String firstName, String lastName, String email, String mobileNumber) {
        super(InfUser.INF_USER);

        set(0, userId);
        set(1, userName);
        set(2, nickName);
        set(3, firstName);
        set(4, lastName);
        set(5, email);
        set(6, mobileNumber);
    }
}
