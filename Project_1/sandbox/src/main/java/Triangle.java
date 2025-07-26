public class Triangle {

    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;
    

        System.out.println("Периметр треугольника со сторонами " + a + " и " + b + " и " + c + " = " + trianglePerimeter(a, b, c));
//        System.out.println(p(a, b, c));
    }


    private static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    private static double p(double a, double b, double c) {
        double p = ((a + b + c) / 2);
        return p;
    }

    private static double S(double a, double b, double c, double p){
        double S = (p * (p - a) * (p - b) * (p - c));
        return S;
    }

    private static double triangleArea(double S){
       double triangleArea = Math.sqrt(S);
        return triangleArea;
    }

    static void triangleArea1(double S){
        System.out.println("Площадь треугольника " + triangleArea(S));
    }
}

//    private static void printTriangleArea(double a, double b, double c) {
//        System.out.println("Площадь треугольника со сторонами " + a + " и " + b + "и" + c + " = " + triangleArea(a, b, c));
//    }
//
//    private static double triangleArea(double a, double b, double c) {
//        return a * b * c;
//    }
//}
// return Math.sqrt(p(p - a) (p - b) (p - c));