/**
 * Project Name:service-rest-jersey
 * File Name:DemoController.java
 * Package Name:com.mp.iam.rest.controller
 * Date:2017年6月11日下午10:54:28
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.rest.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: DemoController <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年6月11日 下午10:54:28 <br/>
 *
 * @author lien
 * @version
 * @since
 */
@RestController
@Path("/hello")
public class DemoResource {
	// @Autowired
	// private DemoService demoService;

	// @Autowired
	// private DemoUserService demoCommonService;

	// @RequestMapping("/demo")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String message() {
		return "Hello world";
	}
}
