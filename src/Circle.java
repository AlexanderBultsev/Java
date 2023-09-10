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

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
