/**
 * TODO
 *
 * Date:2017-07-07 21:59:30
 * Copyright (c) 2017, All Rights Reserved.
 */
package com.mp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mp.model.jooq.tables.daos.InfUserDao;

/**
 * TODO
 *
 * Reason: TODO <br/>
 * Date: 2017-07-07 21:59:30 <br/>
 *
 * @author lien
 * @version
 * @since
 */
@Configuration
public class DaoConfiguration {

	@Bean
	@Autowired
	public InfUserDao getUserDao(org.jooq.Configuration configuration) {
		System.out.println("JOOQ CONFIGURATION:" + configuration);
		return new InfUserDao(configuration);
	}
}
