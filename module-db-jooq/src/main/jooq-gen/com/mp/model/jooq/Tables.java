/*
 * This file is generated by jOOQ.
*/
package com.mp.model.jooq;


import com.mp.model.jooq.tables.InfUser;
import com.mp.model.jooq.tables.SysAuthentication;

import javax.annotation.Generated;


/**
 * Convenience access to all tables in testdb
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>testdb.inf_user</code>.
     */
    public static final InfUser INF_USER = com.mp.model.jooq.tables.InfUser.INF_USER;

    /**
     * The table <code>testdb.sys_authentication</code>.
     */
    public static final SysAuthentication SYS_AUTHENTICATION = com.mp.model.jooq.tables.SysAuthentication.SYS_AUTHENTICATION;
}
