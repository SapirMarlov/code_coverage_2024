package code_coverage_4.code_coverage_4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TriangleClassificationTest {
	
	

	@Test
	public void testConstructor() {
		TriangleClassification triangle = new TriangleClassification();
		assertNotNull(triangle);}

    @Test
    public void Test_1() {
        String expectedResult = "NOT_TRIANGLE";
        int a = 10;
        int b = 3;
        int c = 3;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_2() {
        String expectedResult = "NOT_TRIANGLE";
        int a = 2;
        int b = 5;
        int c = 2;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_3() {
        String expectedResult = "NOT_TRIANGLE";
        int a = 5;
        int b = 5;
        int c = 15;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_4() {
        String expectedResult = "EQUILATERAL";
        int a = 5;
        int b = 5;
        int c = 5;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_5() {
        String expectedResult = "ISOSCELES";
        int a = 7;
        int b = 7;
        int c = 10;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_6() {
        String expectedResult = "ISOSCELES";
        int a = 10;
        int b = 7;
        int c = 7;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_7() {
        String expectedResult = "ISOSCELES";
        int a = 10;
        int b = 15;
        int c = 10;
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void Test_8() {
        String expectedResult = "SCALENE";
        int a = 6;
        int b = 7;
        int c = 8; 
        String actualResult = TriangleClassification.classifyTriangle(a, b, c);
        assertEquals(expectedResult, actualResult);
    }
    
    
    @Test
    public void testToString() {
        TriangleClassification triangle = new TriangleClassification();
        String result = triangle.toString();
        assertTrue(result.contains("TriangleClassification"));
        assertTrue(result.contains("getClass()"));
        assertTrue(result.contains("hashCode()"));
    }
}
