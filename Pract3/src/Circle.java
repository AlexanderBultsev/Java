public class Circle {
    Point center;
    int radius;

    public Circle(int x, int y, int radius) {
        this.center = new Point(x, y);
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(int x, int y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isSmallerThen(Circle circle) {
        return this.radius < circle.radius;
    }

    public boolean isBiggerThen(Circle circle) {
        return  this.radius > circle.radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle circle)) return false;

        return radius == circle.radius;
    }

    @Override
    public int hashCode() {
        return radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
