package org.anaolabs.spring.orange.proxies;

public class MySimpleObject {

	private String location;
	
	
	public MySimpleObject() {
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
