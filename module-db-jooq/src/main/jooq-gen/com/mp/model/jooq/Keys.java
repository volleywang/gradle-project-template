/*
 * This file is generated by jOOQ.
*/
package com.mp.model.jooq;


import com.mp.model.jooq.tables.InfUser;
import com.mp.model.jooq.tables.SysAuthentication;
import com.mp.model.jooq.tables.records.InfUserRecord;
import com.mp.model.jooq.tables.records.SysAuthenticationRecord;

import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;


/**
 * A class modelling foreign key relationships between tables of the <code>testdb</code> 
 * schema
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<InfUserRecord> KEY_INF_USER_PRIMARY = UniqueKeys0.KEY_INF_USER_PRIMARY;
    public static final UniqueKey<SysAuthenticationRecord> KEY_SYS_AUTHENTICATION_PRIMARY = UniqueKeys0.KEY_SYS_AUTHENTICATION_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<InfUserRecord> KEY_INF_USER_PRIMARY = createUniqueKey(InfUser.INF_USER, "KEY_inf_user_PRIMARY", InfUser.INF_USER.USER_ID);
        public static final UniqueKey<SysAuthenticationRecord> KEY_SYS_AUTHENTICATION_PRIMARY = createUniqueKey(SysAuthentication.SYS_AUTHENTICATION, "KEY_sys_authentication_PRIMARY", SysAuthentication.SYS_AUTHENTICATION.AUTH_ID);
    }
}
