/**
 * TODO
 *
 * Date:2017-07-07 19:11:29
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.rest.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.mp.model.jooq.tables.daos.InfUserDao;
import com.mp.model.jooq.tables.pojos.InfUser;

/**
 * TODO
 *
 * Reason: TODO <br/>
 * Date: 2017-07-07 19:11:29 <br/>
 *
 * @author lien
 * @version
 * @since
 */
@RestController
@Path("/users")
public class UsersResource {
	@Context
	private UriInfo uriInfo;

	@Autowired
	private InfUserDao dao;

	@Path("/{userid}")
	public UserResource getUser(@PathParam("userid") String userId) {
		return new UserResource(userId, dao);
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<InfUser> getUsers() {
		// for (InfUser user : getUsers()) {
		// UriBuilder ub = uriInfo.getAbsolutePathBuilder();
		// URI userUri = ub.path(user.getUserId()).build();
		// uriArray.put(userUri.toASCIIString());
		// }
		System.out.println("GET USERS:" + uriInfo);

		return dao.findAll();
	}
}
