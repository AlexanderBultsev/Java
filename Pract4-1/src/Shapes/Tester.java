package Shapes;

public class Tester {
    public static void main(String[] args) {
        Circle circle = new Circle(12, "red", true);
        System.out.println("Area="+ circle.getArea() + " Perimeter=" + circle.getPerimeter());
        System.out.println(circle + "\n");

        Rectangle rect = new Rectangle(34, 56, "blue", false);
        System.out.println("Area="+ rect.getArea() + " Perimeter=" + rect.getPerimeter());
        System.out.println(rect + "\n");

        Square square = new Square(78, "grey", true);
        System.out.println("Area="+ square.getArea() + " Perimeter=" + square.getPerimeter());
        System.out.println(square + "\n");
    }
}
