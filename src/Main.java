public class Main {
    public static void main(String[] args) {
        //task 1
        Author testAutor = new Author("Bob", "bob@gmail.com", 'm');
        System.out.println(testAutor);
        testAutor.setEmail("bob2@yandex.com");
        System.out.println(testAutor);

        //task 2
        Ball testBall = new Ball();
        System.out.println(testBall);
        testBall = new Ball(123, 456);
        System.out.println(testBall);
        testBall.setX(99);
        testBall.setY(77);
        System.out.println(testBall);
        testBall.setXY(55, 55);
        System.out.println(testBall);

        //task 3
        Circle testCircle = new Circle(11, 22, 33);
        System.out.println(testCircle);
    }
}