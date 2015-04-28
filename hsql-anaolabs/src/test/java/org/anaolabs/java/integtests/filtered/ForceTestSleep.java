package org.anaolabs.java.integtests.filtered;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class ForceTestSleep implements IntegTest {

	@Test
	@Category(org.anaolabs.java.integtests.filtered.IntegTest.class)
	public void test() throws InterruptedException {
		System.out.println("[ForceTestSleep] / In test()");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Pause, i = "+i);
			Thread.sleep(1000);
		}
	}

}
