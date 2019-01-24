package com.ta.framework.host;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class JavaProperties {
	
	private String home;
	private String version;
	private String vendor;
	private String sunJnuEncoding;
	private String javaClassPath;
	private String javaClassVersion;
	
	
	private String vmName;
	private String vmVersion;
	private String vmInfo;

	
	private String runtimeName;
	private String runtimeVersion;
	
	
	public JavaProperties() {
		super();
		// TODO Auto-generated constructor stub
	}


	public JavaProperties(String home, String version, String vendor, String sunJnuEncoding, String javaClassPath,
			String javaClassVersion, String vmName, String vmVersion, String vmInfo, String runtimeName,
			String runtimeVersion) {
		super();
		this.home = home;
		this.version = version;
		this.vendor = vendor;
		this.sunJnuEncoding = sunJnuEncoding;
		this.javaClassPath = javaClassPath;
		this.javaClassVersion = javaClassVersion;
		this.vmName = vmName;
		this.vmVersion = vmVersion;
		this.vmInfo = vmInfo;
		this.runtimeName = runtimeName;
		this.runtimeVersion = runtimeVersion;
	}


	public String getHome() {
		return home;
	}


	public void setHome(String home) {
		this.home = home;
	}


	public String getVersion() {
		return version;
	}


	public void setVersion(String version) {
		this.version = version;
	}


	public String getVendor() {
		return vendor;
	}


	public void setVendor(String vendor) {
		this.vendor = vendor;
	}


	public String getSunJnuEncoding() {
		return sunJnuEncoding;
	}


	public void setSunJnuEncoding(String sunJnuEncoding) {
		this.sunJnuEncoding = sunJnuEncoding;
	}


	public String getJavaClassPath() {
		return javaClassPath;
	}


	public void setJavaClassPath(String javaClassPath) {
		this.javaClassPath = javaClassPath;
	}


	public String getJavaClassVersion() {
		return javaClassVersion;
	}


	public void setJavaClassVersion(String javaClassVersion) {
		this.javaClassVersion = javaClassVersion;
	}


	public String getVmName() {
		return vmName;
	}


	public void setVmName(String vmName) {
		this.vmName = vmName;
	}


	public String getVmVersion() {
		return vmVersion;
	}


	public void setVmVersion(String vmVersion) {
		this.vmVersion = vmVersion;
	}


	public String getVmInfo() {
		return vmInfo;
	}


	public void setVmInfo(String vmInfo) {
		this.vmInfo = vmInfo;
	}


	public String getRuntimeName() {
		return runtimeName;
	}


	public void setRuntimeName(String runtimeName) {
		this.runtimeName = runtimeName;
	}


	public String getRuntimeVersion() {
		return runtimeVersion;
	}


	public void setRuntimeVersion(String runtimeVersion) {
		this.runtimeVersion = runtimeVersion;
	}


	@Override
	public String toString() {
		return "JavaProperties [home=" + home + ", version=" + version + ", vendor=" + vendor + ", sunJnuEncoding="
				+ sunJnuEncoding + ", javaClassPath=" + javaClassPath + ", javaClassVersion=" + javaClassVersion
				+ ", vmName=" + vmName + ", vmVersion=" + vmVersion + ", vmInfo=" + vmInfo + ", runtimeName="
				+ runtimeName + ", runtimeVersion=" + runtimeVersion + "]";
	}

	
}
