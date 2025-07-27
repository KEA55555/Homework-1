public class Triangle {

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println("Периметр треугольника со сторонами " + a + " и " + b + " и " + c + " = " + trianglePerimeter(a, b, c));
        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + " и " + c + " = " + triangleArea(a, b, c));
    }

    public static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double triangleArea(double a, double b, double c) {
        double p = ((a + b + c) / 2);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}