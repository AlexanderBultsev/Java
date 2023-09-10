import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    Point center = new Point();
    double radius = 0.0;

    public Circle(double x, double y, double radius) {
        this.center.setX(x);
        this.center.setY(y);
        this.radius = radius;
    }

    public Circle() {
        this.center.setX(0);
        this.center.setY(0);
        this.radius = 0;
    }

    public void setCenter(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double length() {
        return 2 * PI * this.radius;
    }

    public double square() {
        return PI * pow(this.radius, 2);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(radius, circle.radius) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
