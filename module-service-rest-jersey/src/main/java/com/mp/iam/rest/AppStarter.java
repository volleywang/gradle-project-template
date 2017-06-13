/**
 * 
 * Date:2017年6月11日下午5:32:51
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.iam.rest;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Reason: TODO ADD REASON(可选). <br/>
 * Date: 2017年6月11日 下午5:32:51 <br/>
 *
 * @author lien
 * @version
 * @since
 */

@SpringBootApplication
public class AppStarter {

	/**
	 * main:(这里用一句话描述这个方法的作用). <br/>
	 *
	 * @author lien
	 * @param args
	 * @since
	 */
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(AppStarter.class, args);

		System.out.println("通过SpringBoot来注入依赖:");

		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		for (String beanName : beanNames) {
			System.out.println(beanName);
		}
	}

}
