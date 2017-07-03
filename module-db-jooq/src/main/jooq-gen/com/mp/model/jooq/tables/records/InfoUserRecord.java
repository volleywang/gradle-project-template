/*
 * This file is generated by jOOQ.
*/
package com.mp.model.jooq.tables.records;


import com.mp.model.jooq.tables.InfoUser;

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
public class InfoUserRecord extends UpdatableRecordImpl<InfoUserRecord> implements Record7<Integer, String, String, String, String, String, String> {

    private static final long serialVersionUID = -212356545;

    /**
     * Setter for <code>testdb.info_user.user_id</code>.
     */
    public void setUserId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>testdb.info_user.user_id</code>.
     */
    public Integer getUserId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>testdb.info_user.user_name</code>.
     */
    public void setUserName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>testdb.info_user.user_name</code>.
     */
    public String getUserName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>testdb.info_user.nick_name</code>.
     */
    public void setNickName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>testdb.info_user.nick_name</code>.
     */
    public String getNickName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>testdb.info_user.first_name</code>.
     */
    public void setFirstName(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>testdb.info_user.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(3);
    }

    /**
     * Setter for <code>testdb.info_user.last_name</code>.
     */
    public void setLastName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>testdb.info_user.last_name</code>.
     */
    public String getLastName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>testdb.info_user.email</code>.
     */
    public void setEmail(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>testdb.info_user.email</code>.
     */
    public String getEmail() {
        return (String) get(5);
    }

    /**
     * Setter for <code>testdb.info_user.mobile_number</code>.
     */
    public void setMobileNumber(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>testdb.info_user.mobile_number</code>.
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
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Integer, String, String, String, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return InfoUser.INFO_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InfoUser.INFO_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return InfoUser.INFO_USER.NICK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InfoUser.INFO_USER.FIRST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InfoUser.INFO_USER.LAST_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InfoUser.INFO_USER.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InfoUser.INFO_USER.MOBILE_NUMBER;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
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
    public InfoUserRecord value1(Integer value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value2(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value3(String value) {
        setNickName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value4(String value) {
        setFirstName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value5(String value) {
        setLastName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value6(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord value7(String value) {
        setMobileNumber(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InfoUserRecord values(Integer value1, String value2, String value3, String value4, String value5, String value6, String value7) {
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
     * Create a detached InfoUserRecord
     */
    public InfoUserRecord() {
        super(InfoUser.INFO_USER);
    }

    /**
     * Create a detached, initialised InfoUserRecord
     */
    public InfoUserRecord(Integer userId, String userName, String nickName, String firstName, String lastName, String email, String mobileNumber) {
        super(InfoUser.INFO_USER);

        set(0, userId);
        set(1, userName);
        set(2, nickName);
        set(3, firstName);
        set(4, lastName);
        set(5, email);
        set(6, mobileNumber);
    }
}
