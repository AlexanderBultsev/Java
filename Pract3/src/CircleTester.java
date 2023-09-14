import java.util.ArrayList;
import java.util.Random;

public class CircleTester {
    public static Circle smallest(ArrayList<Circle> circles) {
        Circle smallest = circles.get(0);
        for (Circle circle : circles) {
            if (circle.isSmallerThen(smallest)) {
                smallest = circle;
            }
        }
        return smallest;
    }

    public static Circle biggest(ArrayList<Circle> circles) {
        Circle biggest = circles.get(0);
        for (Circle circle : circles) {
            if (circle.isBiggerThen(biggest)) {
                biggest = circle;
            }
        }
        return biggest;
    }

    public static void sort(ArrayList<Circle> circles) {
        for (int i = 0; i < circles.size(); i++) {
            for (int j = 0; j < circles.size() - 1; j++) {
                if (circles.get(j).isBiggerThen(circles.get(j + 1))) {
                    Circle tCircle = circles.get(j);
                    circles.set(j, circles.get(j + 1));
                    circles.set(j + 1, tCircle);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Circle> circles = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < random.nextInt(1, 10); i++) {
            circles.add(new Circle(random.nextInt(100), random.nextInt(100), random.nextInt(100)));
        }

        System.out.println(circles);
        System.out.println("Smallest: " + smallest(circles));
        System.out.println("Biggest " + biggest(circles));
        sort(circles);
        System.out.println(circles);
    }
}
