package org.anaolabs.spring.orange.placeholder;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:org/anaolabs/spring/orange/placeholder/adressproperty/applicationContextPlaceholder.xml" })
public class PlaceholderAdressPropertyTest  {

	@Value("${java.io.tmpdir}")
	private String tmpDir;

	@Value("${writer.party.directory}")
	String partyOutputDirectory;

	@Value("${writer.party.directory.temporary.from.system}")
	String tmpDirAsProperty;

	@Value("${writer.party.directory.mytemporary}")
	String myDirWithTmpDirAsProperty;
	
		
	@Test
	public void testAdressDirectlySystemProperty() {
		System.out.println("tempDir en direct: "+tmpDir);
	}
	
	@Test
	public void testAdressSystemPropertyAsProperty() {
		System.out.println("tempDir via property: "+tmpDirAsProperty);
		System.out.println("myDir based on tempDir via property: "+myDirWithTmpDirAsProperty);
	}
	
	@Test
	public void testAdressSimpleExternalProperty() {
		System.out.println("extracted property: "+partyOutputDirectory);
	}

}

