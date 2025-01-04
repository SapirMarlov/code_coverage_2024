package code_coverage_4.code_coverage_4;


public class Triangle_classification  {

	    enum Triangle_Types {
	        EQUILATERAL,
	        ISOSCELES,
	        SCALENE,
	        NOT_TRIANGLE
	    }

	    public static String classifyTriangle(int a, int b, int c) {

	        Triangle_Types triangle;

	        // Nested conditions to check if the sides form a valid triangle
	        if (c < a + b) { 
	            // Check if side `b` is less than the sum of `a` and `c`
	            if (b < a + c) {
	                // Check if side `a` is less than the sum of `b` and `c`
	                if (a < b + c) {
	                    // All conditions for a valid triangle are satisfied; classify the triangle
	                    
	                    // Check if the triangle is equilateral
	                    if (a == b) {
	                        if (b == c) {
	                            triangle = Triangle_Types.EQUILATERAL; // All three sides are equal
	                        } else {
	                            triangle = Triangle_Types.ISOSCELES; // Only two sides are equal
	                        }
	                    } 
	                    // Check if the triangle is isosceles
	                    else if (b == c || a == c) {
	                        triangle = Triangle_Types.ISOSCELES; // Only two sides are equal
	                    } 
	                    // If no sides are equal, the triangle is scalene
	                    else {
	                        triangle = Triangle_Types.SCALENE; // All sides are different
	                    }
	                } 
	                // If `a` is not less than the sum of `b` and `c`, it is not a triangle
	                else {
	                    triangle = Triangle_Types.NOT_TRIANGLE; 
	                }
	            } 
	            // If `b` is not less than the sum of `a` and `c`, it is not a triangle
	            else {
	                triangle = Triangle_Types.NOT_TRIANGLE; 
	            }
	        } 
	        // If `c` is not less than the sum of `a` and `b`, it is not a triangle
	        else {
	            triangle = Triangle_Types.NOT_TRIANGLE; 
	        }

	        return triangle.toString(); // Return the triangle type as a string
	    }

		@Override
		public String toString() {
			return "Triangle_classification [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	    
}
