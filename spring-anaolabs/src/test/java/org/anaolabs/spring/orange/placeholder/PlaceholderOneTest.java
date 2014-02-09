package org.anaolabs.spring.orange.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/placeholder/one/applicationContextPlaceholder.xml" })
public class PlaceholderOneTest  {

	@Autowired
	@Qualifier("propsHolder")
	ExternalPropertiesHolder propsHolder;
	
	@Test
	public void testPlaceholder() {
		propsHolder.displayProperties();
	}

}
