package com.ta.framework.host;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class OSUserProperties {
	
	private String name;
	private String workDir;
	private String homeDir;
	private String country;
	private String language;
	private String timeZone;
	
	public OSUserProperties() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OSUserProperties(String name, String workDir, String homeDir, String country, String language,
			String timeZone) {
		super();
		this.name = name;
		this.workDir = workDir;
		this.homeDir = homeDir;
		this.country = country;
		this.language = language;
		this.timeZone = timeZone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWorkDir() {
		return workDir;
	}

	public void setWorkDir(String workDir) {
		this.workDir = workDir;
	}

	public String getHomeDir() {
		return homeDir;
	}

	public void setHomeDir(String homeDir) {
		this.homeDir = homeDir;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	@Override
	public String toString() {
		return "OSUserProperties [name=" + name + ", workDir=" + workDir + ", homeDir=" + homeDir + ", country="
				+ country + ", language=" + language + ", timeZone=" + timeZone + "]";
	}

	
	
}
