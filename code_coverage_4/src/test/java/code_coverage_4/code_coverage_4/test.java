package code_coverage_4.code_coverage_4;
import static org.junit.Assert.assertEquals;

import org.junit.Test;



public class test {
	Triangle_classification tester = new Triangle_classification (); // object class test
    /**
     * Rigorous Test :-)
     */
	
	    @Test
	    public void Test_1 () {
	    	String ExpectedResult = "NOT_TRIANGLE"; 
	    	int a = 10;
	    	int b = 3;
	    	int c = 3;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    public void Test_2 () {
	    	String ExpectedResult = "NOT_TRIANGLE"; 
	    	int a = 2;
	    	int b = 5;
	    	int c = 2;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    public void Test_3 () {
	    	String ExpectedResult = "NOT_TRIANGLE"; 
	    	int a = 5;
	    	int b = 5;
	    	int c = 15;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    public void Test_4 () {
	    	String ExpectedResult = "EQUILATERAL"; 
	    	int a = 5;
	    	int b = 5;
	    	int c = 5;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	
	    @Test
	    public void Test_5 () {
	    	String ExpectedResult = "ISOSCELES"; 
	    	int a = 7;
	    	int b = 7;
	    	int c = 10;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    public void Test_6 () {
	    	String ExpectedResult = "ISOSCELES"; 
	    	int a = 10;
	    	int b = 7;
	    	int c = 7;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	    @Test
	    public void Test_7 () {
	    	String ExpectedResult = "SCALENE"; 
	    	int a = 6;
	    	int b = 7;
	    	int c = 8;
	    	String ActualResult = tester.classifyTriangle(a, b, c); 
	    	assertEquals(ExpectedResult,ActualResult); 
	    }
	

}
