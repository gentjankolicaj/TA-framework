package WebApplication.TestCases;

import java.util.Arrays;
import java.util.List;

import com.ta.framework.utils.TestCaseUtils;
/**
 * 
 * @author gentjan kolicaj
 *
 */
public class TestCaseRunner {

   
    public static final int TEST_TRY=8;


    public static void main(String [ ]args){
    	
    	 List<Class> list=Arrays.asList(Test_001.class,Test_002.class,Test_003.class);
    	
        TestCaseUtils.runTestCases(TEST_TRY, list);
    }
    
}
