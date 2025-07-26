public class Triangle {

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
        double p = ((a + b + c) / 2);
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Периметр треугольника со сторонами " + a + " и " + b + " и " + c + " = " + trianglePerimeter(a, b, c));
        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + " и " + c + " = " + triangleArea(area));
    }

    public static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double triangleArea(double area) {
        return  area;
    }
}