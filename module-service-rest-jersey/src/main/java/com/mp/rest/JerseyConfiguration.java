/**
 * 
 *
 * Date:2017-07-05 13:00:11
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.rest;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

import com.mp.rest.resource.DemoResource;
import com.mp.rest.resource.UserResource;
import com.mp.rest.resource.UsersResource;

/**
 * 
 *
 * Reason:  <br/>
 * Date: 2017-07-05 13:00:11 <br/>
 *
 * @author lien
 * @version
 * @since
 */
@Configuration
@ApplicationPath("/rest")
public class JerseyConfiguration extends ResourceConfig {
	
	/**
	 * 注册REST服务类
	 * Creates a new instance of JerseyConfig.
	 */
	public JerseyConfiguration() {
		register(DemoResource.class);
		register(UsersResource.class);
		register(UserResource.class);
	}
}
