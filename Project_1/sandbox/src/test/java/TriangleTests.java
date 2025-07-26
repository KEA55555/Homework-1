import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter(){
    double result = Triangle.trianglePerimeter(8.0, 2.0, 3.0);
        Assertions.assertEquals(13, result);
    }

    @Test
    void canCalculateArea(){
        double result = Triangle.triangleArea(5.0, 5.0, 6.0);
        Assertions.assertEquals(12, result);
    }
}