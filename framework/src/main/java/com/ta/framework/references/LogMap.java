package com.ta.framework.references;

import java.util.HashMap;
import java.util.Map;

import com.ta.framework.result.MyResult;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class LogMap {
	
	private static int key=0;
	
	private static Map<Integer,MyResult> logMap=new HashMap<>();
	
	public static Map<Integer,MyResult> getLogMap(){
		return logMap;
	}
	
	
	public static MyResult putResult(MyResult value) {
		key=key+1;
		return logMap.put(key, value);
	}
	
	public static MyResult removeResult(Integer key) {
		return logMap.remove(key);
	}
	
	public static MyResult replaceResult(Integer key,MyResult value) {
		return logMap.replace(key, value);
	}
	
	
	public static void clearLogMap() {
		logMap.clear();
		logMap=new HashMap<>();
		key=0;
	}
	

}
