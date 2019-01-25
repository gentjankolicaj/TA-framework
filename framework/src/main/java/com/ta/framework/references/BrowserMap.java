package com.ta.framework.references;

import java.util.HashMap;
import java.util.Map;

import com.ta.framework.browsers.Browser;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class BrowserMap {
	
		private static Map<Integer, Browser> browserReferences = new HashMap<>();

		public static Map<Integer, Browser> getBrowserReferences() {
			return browserReferences;
		}

		public static Browser putBrowser(Integer key, Browser value) {
			return browserReferences.put(key, value);
		}

		public static Browser removeBrowser(Integer key) {
			return browserReferences.remove(key);
		}

		public static Browser replaceWebBrowser(Integer key, Browser value) {
			return browserReferences.replace(key, value);
		}

		public static void clearMap() {
			browserReferences.clear();
			browserReferences = new HashMap<>();
		}


}
