/**
 * Project Name:service-rest-jersey
 * File Name:DemoController.java
 * Package Name:com.mp.iam.rest.controller
 * Date:2017年6月11日下午10:54:28
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.iam.rest.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
public class DemoController {
	// @Autowired
	// private DemoService demoService;

	// @Autowired
	// private DemoUserService demoCommonService;

	@RequestMapping("/demo")
	public Map<String, String> index() {
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("status", "success");
		// resultMap.put("content", demoService.getString());
		return resultMap;
	}

	@RequestMapping(value = "/mobile/{mobile:.+}", method = RequestMethod.GET)
	public Object getSingleLoanItem(@PathVariable("mobile") String mobile) {
		Map<String, String> resultMap = new HashMap<String, String>();
		resultMap.put("status", "success");
		// resultMap.put("content", demoCommonService.getUserByMobile(mobile));
		return resultMap;
	}
}
