/**
 * Anaolabs R&D 
 *
 * Copyright (c) Anaolabs
 */

package org.anaolabs.jpa.daos;

import java.util.List;

import junit.framework.Assert;

import org.anaolabs.jpa.daos.impl.DomainJpaDao;
import org.anaolabs.jpa.entities.Domain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * DomainJpaDaoTest.java
 *
 * (Add your comments here...)
 *
 * @author Akamanouche
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/applicationContext.xml" })
public class DomainJpaDaoTest {

	@Autowired
	@Qualifier("domainDao")
	DomainJpaDao domainDao;
	
	@Test
	public void findAll() {
		System.out.println("in test : findAll()");
		List<Domain> domains = domainDao.findAll();
		
		Assert.assertEquals("SHOULD BE 3 records", 3, domains.size());
	}

}
