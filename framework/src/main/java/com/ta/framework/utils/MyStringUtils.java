package com.ta.framework.utils;

import com.ta.framework.exceptions.ContentException;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class MyStringUtils {

	private MyStringUtils() {
	}

	public static boolean containsLowerCase(String resource, String content) {
		if (resource.toLowerCase().contains(content.toLowerCase()))
			return true;
		else
			return false;
	}

	public static boolean containsUpperCase(String resource, String content) {
		if (resource.toUpperCase().contains(content.toUpperCase()))
			return true;
		else
			return false;
	}

	public static String assertContainsLowerCase(String resource, String content) throws Exception {
		if (resource.toLowerCase().contains(content.toLowerCase()))
			return resource;
		else
			throw new ContentException(resource.toLowerCase() + " does not contain " + content.toLowerCase());

	}

	public static String assertContainsUpperCase(String resource, String content) throws Exception {
		if (resource.toUpperCase().contains(content.toUpperCase()))
			return resource;
		else
			throw new ContentException(resource.toUpperCase() + " does not contain " + content.toUpperCase());
	}

	public static boolean contains(String resource, String content) {
		if (resource.contains(content))
			return true;
		else
			return false;
	}

	public static boolean checkContent(String resource, String content, boolean caseSensitive) {
		if (caseSensitive)
			return contains(resource, content);
		else
			return containsLowerCase(resource, content);
	}

	public static String assertContains(String resource, String content) throws Exception {
		if (resource.contains(content))
			return content;
		else
			throw new ContentException(resource + " does not contain " + content);

	}

	public static String assertContains(String resource, String content, boolean caseSensitive) throws Exception {
		if (caseSensitive)
			return assertContains(resource, content);

		else
			return assertContainsLowerCase(resource, content);

	}

}
