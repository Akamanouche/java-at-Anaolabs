package org.anaolabs.java.integtests.active;

import org.junit.Test;

public class ITForceSleep {

	@Test
	public void test() throws InterruptedException {
		System.out.println("[ITForceSleep] / In test()");
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Pause, i = "+i);
			Thread.sleep(1000);
		}
	}

}
