import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        var pr = new Triangle(8.0, 2.0, 3.0);
        double result = pr.perimeter();
        Assertions.assertEquals(13, result);
    }

    @Test
    void canCalculateArea() {
        var s = new Triangle(5.0, 5.0, 6.0);
        double result = s.area();
        Assertions.assertEquals(12, result);
    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5.0, 5.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //ok
        }
    }

    @Test
    void cannotCreateTriangleWithViolationOfInequality() {
        try {
            new Triangle(1.0, 2.0, 6.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
        }
    }

    @Test
    void testEquality() {
        var t1 = new Triangle(3, 4, 5);
        var t2 = new Triangle(3, 4, 5);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality2() {
        var t1 = new Triangle(3, 4, 5);
        var t2 = new Triangle(4, 5, 3);
        Assertions.assertEquals(t1, t2);
    }

    @Test
    void testEquality3(){
        var a = 2;
        var b = 3;
        var c = 4;
        var triangle = new Triangle(a, b, c);
        var triangle1 = new Triangle(a, c, b);
        Assertions.assertEquals(triangle, triangle1);
    }
}