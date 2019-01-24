package com.ta.framework.host;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class OSProperties {
	
	private String name;
	private String version;
	private String architecture;
	private String fileSeparator;
	
	public OSProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OSProperties(String name, String version, String architecture, String fileSeparator) {
		super();
		this.name = name;
		this.version = version;
		this.architecture = architecture;
		this.fileSeparator = fileSeparator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getArchitecture() {
		return architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
	}

	public String getFileSeparator() {
		return fileSeparator;
	}

	public void setFileSeparator(String fileSeparator) {
		this.fileSeparator = fileSeparator;
	}

	@Override
	public String toString() {
		return "OSProperties [name=" + name + ", version=" + version + ", architecture=" + architecture
				+ ", fileSeparator=" + fileSeparator + "]";
	}

	
	

}
