/**
 * TODO
 *
 * Date:2017-07-07 13:01:37
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.mp.model.jooq.tables.daos.InfUserDao;
import com.mp.model.jooq.tables.pojos.InfUser;

/**
 * TODO
 *
 * Reason: TODO <br/>
 * Date: 2017-07-07 13:01:37 <br/>
 *
 * @author lien
 * @version
 * @since
 */
public class UserResource {
	
	private String userId;
	
	private InfUserDao dao;
	
	/**
	 * 
	 * Creates a new instance of UserResource.
	 *
	 * @param userId
	 */
	public UserResource(String userId, InfUserDao dao) {
		this.userId = userId;
		this.dao = dao;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public InfUser getUser() {
		InfUser user = dao.fetchOneByUserId(this.userId);

		if (null == user) {
			throw new NotFoundException("userid " + userId + "does not exist!");
		}

		return user;
	}
}
