package com.ta.framework.host;
/**
 * 
 * @author gentjan koli�aj
 *
 */
public class PropertiesDetector {
	
	private static PropertiesDetector instance;
	
	//OS related members
	private static String  osName;
	private static String osVersion;
	private static String osArchitecture;
	private static String osFileSeparator;
	
	//User related members
	private static String userName;
	private static String userWorkDir;
	private static String userHomeDir;
	private static String userCountry;
	private static String userLanguage;
	private static String userTimeZone;
	
	//Java related members
	private static String javaHome;
	private static String javaVersion;
	private static String javaVendor;
	private static String sunJnuEncoding;
	private static String javaClassPath;
	private static String javaClassVersion;
	
	private static String vmName;
	private static String vmVersion;
	private static String vmInfo;
	
	private static String runtimeName;
	private static String runtimeVersion;
	
	static {
		// OS properties
		osName = System.getProperty("os.name");
		osVersion = System.getProperty("os.version");
		osArchitecture = System.getProperty("os.arch");
		osFileSeparator=System.getProperty("file.separator");

		// OS user properties
		userWorkDir = System.getProperty("user.dir");
		userHomeDir = System.getProperty("user.home");
		userName = System.getProperty("user.name");
		userCountry = System.getProperty("user.country");
		userLanguage = System.getProperty("user.language");
		userTimeZone = System.getProperty("user.timezone");

		// JAVA properties
		javaHome = System.getProperty("java.home");
		javaVersion = System.getProperty("java.version");
		javaVendor = System.getProperty("java.vendor");
		sunJnuEncoding = System.getProperty("sun.jnu.encoding");
		javaClassPath = System.getProperty("java.class.path");
		javaClassVersion = System.getProperty("java.class.version");

		vmName = System.getProperty("java.vm.name");
		vmVersion = System.getProperty("java.vm.version");
		vmInfo = System.getProperty("java.vm.info");

		runtimeName = System.getProperty("java.runtime.name");
		runtimeVersion = System.getProperty("java.runtime.version");   

		
	}
	
	private PropertiesDetector() {
		
	}
	
	
	
	public static JavaProperties getJavaProperties() {
		return new JavaProperties(javaHome, javaVersion, javaVendor, sunJnuEncoding, javaClassPath,javaClassVersion, vmName, vmVersion, vmInfo,runtimeName,runtimeVersion);
	}
	
	public static  OSUserProperties getOSUserProperties() {
		return new OSUserProperties(userName,userWorkDir,userHomeDir, userCountry,userLanguage, userTimeZone);
	}
	
	
	public static OSProperties getOSProperties() {
		return new OSProperties(osName,osVersion,osArchitecture,osFileSeparator);
	}
	

}
