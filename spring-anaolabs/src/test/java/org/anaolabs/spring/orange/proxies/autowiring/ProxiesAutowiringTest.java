package org.anaolabs.spring.orange.proxies.autowiring;

import org.anaolabs.spring.orange.proxies.MySimpleObjectAutowired;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/proxies/autowiring/applicationContext-withAutowiring.xml" })
public class ProxiesAutowiringTest {

	@Autowired
	@Qualifier("mySimpleObjectAutowired")
	MySimpleObjectAutowired mySimpleObjectAutowired;
	
	
	@Test
	public void testOnSimpleBean() {
		
//		ApplicationContext ctx = new ClassPathXmlApplicationContext("org/anaolabs/spring/orange/proxies/autowiring/applicationContext-withAutowiring.xml");
//		MySimpleObjectAutowired mySimpleObjectAutowired = (MySimpleObjectAutowired) ctx.getBean("mySimpleObjectAutowired");
		
		System.out.println("****** "+mySimpleObjectAutowired.getName());
		System.out.println("****** "+mySimpleObjectAutowired.getClass().getCanonicalName());
		System.out.println("==> PAS de PROXY ici");

	}

}
