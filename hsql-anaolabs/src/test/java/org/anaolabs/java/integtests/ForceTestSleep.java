package org.anaolabs.java.integtests;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class ForceTestSleep extends IntegTest {

	@Test
	@Category(org.anaolabs.java.integtests.IntegTest.class)
	public void test() throws InterruptedException {
		System.out.println("In test()");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Pause, i = "+i);
			Thread.sleep(1000);
		}
	}

}
