package org.anaolabs.spring.orange.proxies.noautowiring;

import org.anaolabs.spring.orange.proxies.MySimpleObject;
import org.anaolabs.spring.orange.service.ContractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/proxies/noautowiring/applicationContext-noAutowiring.xml" })
public class ProxiesNoAutowiringTest {

	@Test
	public void testOnSimpleBean() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/anaolabs/spring/orange/proxies/noautowiring/applicationContext-noAutowiring.xml");
		MySimpleObject mySimpleObject = (MySimpleObject) ctx.getBean("mySimpleObject");
		
		System.out.println("****** "+mySimpleObject.getName());
		System.out.println("****** "+mySimpleObject.getClass().getCanonicalName());
		System.out.println("==> PAS de PROXY ici");

	}

	@Test
	public void testOnImplBean() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/anaolabs/spring/orange/proxies/noautowiring/applicationContext-noAutowiring.xml");
		ContractService contractService = (ContractService) ctx.getBean("contractService");
		
		System.out.println("****** "+contractService.getName());
		System.out.println("****** "+contractService.getClass().getCanonicalName());
		System.out.println("==> PAS de PROXY ici");
	}

}
