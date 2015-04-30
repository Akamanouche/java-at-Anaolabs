package org.anaolabs.spring.orange.profiles.sample1;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Ici, on teste le switch de "profile" Spring
 * @author SDSB3717
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/profiles/sample1/applicationContext-Profiles.xml" })
//@ActiveProfiles(profiles="runtime")
@ActiveProfiles(profiles="test")
public class ProfilesTest {

	@Autowired
	@Qualifier("partyGzipProcess")
	IProcess partyGzipProcess;
	
	@Test
	public void test() {
		
		partyGzipProcess.doProcess();
	}

}
