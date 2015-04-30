/**
 * 
 */
package org.anaolabs.spring.orange.placeholder;

/**
 * @author SDSB3717
 *
 */
public class ExternalPropertiesHolder {

	public String directory;
	public String userDir;
	public String fileSeparator;
	
	public void displayProperties() {
		System.out.println("directory (from file): "+directory);
		System.out.println("userDir (from System): "+userDir);
		System.out.println("fileSeparator (from System): "+fileSeparator);
	}

	public void setDirectory(String directory) {
		this.directory = directory;
	}

	public String getUserDir() {
		return userDir;
	}

	public void setUserDir(String userDir) {
		this.userDir = userDir;
	}

	public String getDirectory() {
		return directory;
	}

	public String getFileSeparator() {
		return fileSeparator;
	}

	public void setFileSeparator(String fileSeparator) {
		this.fileSeparator = fileSeparator;
	}
	
}
