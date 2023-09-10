public class BallTester {
    public static void main(String[] args) {
        Ball testBall = new Ball();
        System.out.println(testBall);
        testBall = new Ball(123, 456);
        System.out.println(testBall);
        testBall.setX(99);
        testBall.setY(77);
        System.out.println(testBall);
        testBall.setXY(55, 55);
        System.out.println(testBall);
    }
}
