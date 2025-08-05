import java.awt.*;

public record Triangle(

        double a,
        double b,
        double c
) {
    public Triangle {
        if (a < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }

        if (a + b < c) {
            throw new IllegalArgumentException("The triangle inequality must not be violated");
        }

    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }

    public double area() {
        double p = ((a + b + c) / 2);
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.c) == 0 && Double.compare(this.c, triangle.b) == 0)
                || (Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.a) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0 && Double.compare(this.c, triangle.a) == 0)
                || (Double.compare(this.a, triangle.c) == 0 && Double.compare(this.b, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0)
                || (Double.compare(this.a, triangle.c) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.a) == 0);
    }
    @Override
    public int hashCode() {
        return 1;
    }
}