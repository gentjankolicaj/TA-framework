package com.ta.framework.utils;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.ta.framework.test.TestCase;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class TestCaseUtils {
	
	private TestCaseUtils() {}
	

	public static void runTestCases(int rerunTestCases, List<Class> testCaseList) {
		int runAttempt = 0;

		while (runAttempt <= rerunTestCases) {

			for (int i = 0; i < testCaseList.size(); i++) {
				long startTime = System.currentTimeMillis();

				printInfo(testCaseList.get(i));

				Result result = JUnitCore.runClasses(testCaseList.get(i));

				printResults(testCaseList.get(i), runAttempt, result, startTime);
			}
			runAttempt++;
		}

	}

	public static void runTestCases(int rerunTestCases, Class... testCaseArray) {
		int runAttempt = 0;

		while (runAttempt <= rerunTestCases) {

			for (int i = 0; i < testCaseArray.length; i++) {
				long startTime = System.currentTimeMillis();

				printInfo(testCaseArray[i]);

				Result result = JUnitCore.runClasses(testCaseArray[i]);

				printResults(testCaseArray[i], runAttempt, result, startTime);
			}
			runAttempt++;
		}

	}

	private static void printResults(Class tcClass, int runAttempt, Result result, long startTime) {
		long runTime = (System.currentTimeMillis() - startTime) / 1000;
		for (Failure fail : result.getFailures()) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println(fail.getMessage());
			System.out.println("-> Test case name : " + tcClass.getName());
			System.out.println("-> Test case failed after " + runTime + " seconds.");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();
		}

		if (result.wasSuccessful()) {
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println("-> Test case name : " + tcClass.getName());
			System.out.println("-> Test run : " + runAttempt);
			System.out.println("-> Test case finished successfuly after " + runTime + " seconds.");
			System.out.println("-----------------------------------------------------------------------------");
			System.out.println();

		}

	}

	private static void printInfo(Class tcClass) {
		System.out.println();
		System.out.println("-----------------------------------------------------------------------------");
		System.out.println("-> Test case name : " + tcClass.getName());
		System.out.println("-> Run started.");
		System.out.println("-----------------------------------------------------------------------------");

	}

}
