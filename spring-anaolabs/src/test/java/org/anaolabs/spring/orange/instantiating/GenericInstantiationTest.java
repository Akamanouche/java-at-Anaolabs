package org.anaolabs.spring.orange.instantiating;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = { "classpath*:spring-config/applicationContext.xml" })
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/instantiating/applicationContextInstantiating.xml" })
public class GenericInstantiationTest {

	@Autowired
	@Qualifier("pommeEater")
	PommeEater pommeEater;
	
	@Autowired
	@Qualifier("orangeEater")
	OrangeEater orangeEater;
	
	@Test
	public void test() {
		
		// Load pommes
		List<Pomme> pommes = new ArrayList<Pomme>();
		pommes.add(new Pomme("j"));
		pommes.add(new Pomme("jj"));
		pommes.add(new Pomme("jjj"));
		pommes.add(new Pomme("jjjj"));
		pommeEater.load(pommes);

		// Load oranges
		List<Orange> oranges = new ArrayList<Orange>();
		oranges.add(new Orange("espagne"));
		oranges.add(new Orange("maroc"));
		oranges.add(new Orange("bresil"));
		orangeEater.load(oranges);
		
		/**
		 * ICI, on prouve que le cache (de la classe g�n�rique) est bien instanci�
		 * 2 fois :
		 * - un cache pour PommeEater
		 * - un cache pour OrangeEater
		 * 
		 * - OK: CQFD -
		 *  
		 */
		Assert.assertEquals(4, pommeEater.cache.size());
		Assert.assertEquals(3, orangeEater.cache.size());
	}

}
