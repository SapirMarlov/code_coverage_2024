package code_coverage_4.code_coverage_4;

public class TriangleClassification {

    enum TriangleTypes {
        EQUILATERAL,
        ISOSCELES,
        SCALENE,
        NOT_TRIANGLE
    }

    public static String classifyTriangle(int a, int b, int c) {

        TriangleTypes triangle = null;

        // Check if the sides form a valid triangle
        if (a < b + c) {
            if (b < a + c) {
                if (c < a + b) {
                    // Valid triangle, proceed to classification
                    if (a == b) {
                        if (b == c) {
                            triangle = TriangleTypes.EQUILATERAL;
                        } else {
                            triangle = TriangleTypes.ISOSCELES;
                        }
                    } else if (b == c) {
                        triangle = TriangleTypes.ISOSCELES;
                    } else if (a == c) {
                        triangle = TriangleTypes.ISOSCELES;
                    } else {
                        triangle = TriangleTypes.SCALENE;
                    }
                } else {
                    triangle = TriangleTypes.NOT_TRIANGLE;
                }
            } else {
                triangle = TriangleTypes.NOT_TRIANGLE;
            }
        } else {
            triangle = TriangleTypes.NOT_TRIANGLE;
        }

        return triangle.toString();
    }

    @Override
    public String toString() {
        return "TriangleClassification [getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
    }
}
