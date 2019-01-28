package com.ta.framework.log;

import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import com.ta.framework.configuration.GlobalConfigs;
import com.ta.framework.references.LogMap;
import com.ta.framework.result.MyResult;
import com.ta.framework.result.StepResult;

/**
 * 
 * @author gentjan kolicaj
 *
 */
public class MyLogger {

	private static Logger myLogger = Logger.getLogger(MyLogger.class.getName());

	private MyLogger() {

	}

	public static void log(String string) {
		if (GlobalConfigs.showLogs) {
			if (GlobalConfigs.LOGGER.equals(MyLogType.CONSOLE_LOGGER)) {
				console(string);

			} else if (GlobalConfigs.LOGGER.equals(MyLogType.JAVA_LOGGER)) {
				logger(string);
			}

		}

	}

	public static void log(Object object) {
		if (GlobalConfigs.showLogs) {
			if (GlobalConfigs.LOGGER.equals(MyLogType.CONSOLE_LOGGER)) {
				console(object);

			} else if (GlobalConfigs.LOGGER.equals(MyLogType.JAVA_LOGGER)) {
				logger(object);
			}

		}
	}

	public static void log(MyResult result) {
		if (GlobalConfigs.showLogs) {
			if (GlobalConfigs.LOGGER.equals(MyLogType.CONSOLE_LOGGER)) {
				console(result);

			} else if (GlobalConfigs.LOGGER.equals(MyLogType.JAVA_LOGGER)) {
				logger(result);
			}

		}
	}

	public static void log(List<Object> list) {
		if (GlobalConfigs.showLogs) {
			if (GlobalConfigs.LOGGER.equals(MyLogType.CONSOLE_LOGGER)) {
				console(list);

			} else if (GlobalConfigs.LOGGER.equals(MyLogType.JAVA_LOGGER)) {
				logger(list);
			}

		}
	}

	public static void log(Map<Object, Object> map) {
		if (GlobalConfigs.showLogs) {
			if (GlobalConfigs.LOGGER.equals(MyLogType.CONSOLE_LOGGER)) {
				console(map);

			} else if (GlobalConfigs.LOGGER.equals(MyLogType.JAVA_LOGGER)) {
				logger(map);
			}

		}
	}

	// ============================================================================
	// ======================CONSOLE LOGGER methods================================
	private static void console(String string) {
		System.out.println(string);
		if (GlobalConfigs.storeLogs)
			LogMap.putResult(new StepResult("", string));
	}

	private static void console(Object object) {
		if (object != null) {
			System.out.println(object);
			if (GlobalConfigs.storeLogs)
				LogMap.putResult(new StepResult("", object.toString()));
		}
	}

	private static void console(MyResult result) {
		if (result != null) {
			System.out.println(result.toString());
			if (GlobalConfigs.storeLogs)
				LogMap.putResult(result);
		}
	}

	private static void console(List<Object> list) {
		if (list != null && list.size() != 0) {
			for (Object object : list) {
				System.out.println(object.toString());
				if (GlobalConfigs.storeLogs) {
					if (object instanceof MyResult) {
						MyResult tmp = (MyResult) object;
						LogMap.putResult(tmp);
					} else {
						LogMap.putResult(new StepResult("", object.toString()));
					}

				}

			}
		}
	}

	private static void console(Map<Object, Object> map) {
		if (map != null && !map.isEmpty()) {
			for (Map.Entry<Object, Object> element : map.entrySet()) {
				System.out.println("" + element.getKey() + ":" + element.getValue());
				if (GlobalConfigs.storeLogs) {
					if (element.getValue() instanceof MyResult) {
						MyResult tmp = (MyResult) element.getValue();
						LogMap.putResult(tmp);
					} else {
						LogMap.putResult(new StepResult("" + element.getKey(), "" + element.getValue()));
					}

				}

			}
		}

	}

	// ===============================================================================
	// =======================JAVA_LOGGER methods=====================================
	private static void logger(String string) {
		myLogger.info(string);
		if (GlobalConfigs.storeLogs)
			LogMap.putResult(new StepResult("", string));
	}

	private static void logger(Object object) {
		if (object != null) {
			myLogger.info(object.toString());
			if (GlobalConfigs.storeLogs)
				LogMap.putResult(new StepResult("", object.toString()));

		}
	}

	private static void logger(MyResult result) {
		if (result != null) {
			myLogger.info(result.toString());
			if (GlobalConfigs.storeLogs)
				LogMap.putResult(result);

		}

	}

	private static void logger(List<Object> list) {
		if (list != null && list.size() != 0) {
			for (Object object : list) {
				myLogger.info(object.toString());
				if (GlobalConfigs.storeLogs) {
					if (object instanceof MyResult) {
						MyResult tmp = (MyResult) object;
						LogMap.putResult(tmp);
					} else {
						LogMap.putResult(new StepResult("", object.toString()));
					}
				}
			}
		}
	}

	private static void logger(Map<Object, Object> map) {
		if (map != null && !map.isEmpty()) {
			for (Map.Entry<Object, Object> element : map.entrySet()) {
				myLogger.info("" + element.getKey() + ":" + element.getValue());
				if (GlobalConfigs.storeLogs) {
					if (element.getValue() instanceof MyResult) {
						MyResult tmp = (MyResult) element.getValue();
						LogMap.putResult(tmp);
					} else {
						LogMap.putResult(new StepResult("" + element.getKey(), "" + element.getValue()));
					}
				}
			}
		}

	}
	
	

}
