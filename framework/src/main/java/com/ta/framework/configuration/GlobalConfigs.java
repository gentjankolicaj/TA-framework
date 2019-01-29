package com.ta.framework.configuration;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import com.ta.framework.browsers.MyBrowserType;
import com.ta.framework.log.MyLogType;
import com.ta.framework.report.ReportFileType;
import com.ta.framework.report.SnapshotFileType;

public class GlobalConfigs {
	
	public static final String driversDirectoryName="web-drivers";
	public static final String homeDirectory=System.getProperty("user.home");
	public static final String fileSeparator=System.getProperty("file.separator");
	
	
	
	public static final MyLogType LOGGER=MyLogType.CONSOLE_LOGGER;
	public static boolean showLogs=true;
	public static boolean storeLogs=true;
	public static ReportFileType logFileType=ReportFileType.XLS;
	
	
	public static final String reportDirectoryName="test-reports";
	public static ReportFileType reportFileType=ReportFileType.XLS; 
	
	
	
	public static final String snapshotDirectoryName="snapshots";
	public static SnapshotFileType snapshotFileType=SnapshotFileType.JPG;
	
	
	
	public static Dimension browserDimensions=null; //if dimension is null then browser dimensions are set to max
	
	
	
	public static Map<MyBrowserType,Integer> timeouts=new HashMap<>();
	public static TimeUnit timeUnit=TimeUnit.SECONDS;
	

	
	static {
		timeouts.put(MyBrowserType.CHROME,5000);
		timeouts.put(MyBrowserType.FIREFOX, 5000);
		timeouts.put(MyBrowserType.EDGE, 5000);
		timeouts.put(MyBrowserType.OPERA, 5000);
		timeouts.put(MyBrowserType.HTML_UNIT, 5000);
	}

}
