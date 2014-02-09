package org.anaolabs.spring.orange.proxies;

import org.springframework.stereotype.Component;

@Component("mySimpleObjectAutowired")
public class MySimpleObjectAutowired {

	private String location;
	
	
	public MySimpleObjectAutowired() {
		super();
	}
	
	
	public String getName() {
		return this.getClass().getSimpleName();
	}
	
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
