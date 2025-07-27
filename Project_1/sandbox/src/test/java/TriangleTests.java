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
}