package org.anaolabs.spring.orange.factories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath*:spring-config/applicationContext.xml" })
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/factories/applicationContextFactory.xml" })
public class ServiceFactoryTestStandAlone {
	
	@Autowired
	ServiceFactory factory;

	@Test
	public void test() {
		Assert.assertNotNull(this);
		Assert.assertEquals("ContractService", factory.getContractService().getName());
		Assert.assertEquals("UserService", factory.getUserService().getName());
	}

}
