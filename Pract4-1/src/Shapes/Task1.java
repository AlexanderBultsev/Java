package Shapes;

public class Task1 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "RED", false);
        // Все методы будут вызываться от объекта класса Circle, т.к его экземпляр и был создан
        // Но т.к. объект s1 имеет тип Shape, то для него будет доступен только функционал класса Shape
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // В Shape не определен метод getRadius
        // System.out.println(s1.getRadius());

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Нельзя создать экземпляр абстрактного класса
        // Shape s2 = new Shape();
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // В Shape не определен метод getLength
        // System.out.println(s3.getLength());

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // В Shape не определен метод getSide
        // System.out.println(s4.getSide());

        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2); System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // В Rectangle не определен метод getSide
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());

        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
