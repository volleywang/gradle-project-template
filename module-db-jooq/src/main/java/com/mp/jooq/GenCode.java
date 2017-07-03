/**
 * TODO
 *
 * Date:2017-07-03 22:08:53
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.jooq;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

/**
 * TODO
 *
 * Reason: TODO <br/>
 * Date: 2017-07-03 22:08:53 <br/>
 *
 * @author lien
 * @version
 * @since
 */
public class GenCode {

	/**
	 *
	 * @author lien
	 * @param args
	 * @since
	 */
	public static void main(String[] args) {
		Connection conn = null;

		String userName = "root";
		String password = "rootadmin";
		String url = "jdbc:mysql://192.168.0.122:3306/guestbook";

		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			conn = DriverManager.getConnection(url, userName, password);

			DSLContext create = DSL.using(conn, SQLDialect.MYSQL);

//			// delete table content
//			create.delete(POSTS).execute();
//
//			// insert
//			for (int i = 0; i < 10; i++) {
//				create.insertInto(POSTS, POSTS.ID, POSTS.TITLE, POSTS.BODY, POSTS.TIMESTAMP).values(new Long(i),
//						"TITLE " + i, "BODY " + i, new java.sql.Timestamp(System.currentTimeMillis())).execute();
//			}
//
//			// select
//			Result<Record> result = create.select().from(POSTS).fetch();
//			for (Record r : result) {
//				Long id = r.getValue(POSTS.ID);
//				String title = r.getValue(POSTS.TITLE);
//				String description = r.getValue(POSTS.BODY);
//				System.out.println("ID: " + id + " title: " + title + " desciption: " + description);
//			}
//
//			// delete
//			create.delete(POSTS).where(POSTS.ID.equal(new Long(9))).execute();
//
//			// update
//			create.update(POSTS).set(POSTS.TITLE, "===title===").set(POSTS.BODY, "===body===")
//					.where(POSTS.ID.equal(new Long(1))).execute();
//
//			String sql = create.update(POSTS).set(POSTS.TITLE, "===title===").set(POSTS.BODY, "===body===")
//					.where(POSTS.ID.equal(new Long(1))).getSQL();

			System.out.println(sql);

		} catch (Exception e) {
			// For the sake of this tutorial, let's keep exception handling
			// simple
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ignore) {
				}
			}
		}
	}

}
