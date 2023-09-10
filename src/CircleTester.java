public class CircleTester {
    public static void main(String[] args) {
        Circle testCircle = new Circle();
        System.out.println(testCircle);
        testCircle = new Circle(1, 2, 3);
        System.out.println(testCircle);
        testCircle.setCenter(5, 5);
        testCircle.setRadius(10);
        System.out.println(testCircle);
        System.out.printf("Длина окружности = %.3f\n", testCircle.length());
        System.out.printf("Площадь круга = %.3f\n", testCircle.square());
        Circle equalCircle = new Circle(3, 3, 10);
        System.out.println(testCircle.equals(equalCircle));
    }
}
