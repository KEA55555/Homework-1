public class Triangle {

    printTriangleHalfMeter(double p);
    printTriangleArea(3.0, 4.0, 5.0);

    // формула полупериметра p
    private static double triangleHalfMeter(double a, double b, double c) {
        return ((a + b + c) / 2);
    }

    // формула Герона (квадратный корень)
    private static double triangleAreaHeron(double a, double b, double c) {
        return Math.sqrt(p(p - a) (p - b) (p - c));
    }

    private static void printTriangleArea(double a, double b, double c) {
        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + "и" + c + " = " + triangleArea(a, b, c));
    }

    private static double triangleArea(double a, double b, double c) {
        return a * b * c;
    }
}
