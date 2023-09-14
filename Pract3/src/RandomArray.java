import java.util.ArrayList;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        ArrayList<Double> array1 = new ArrayList<Double>();
        Random random = new Random();
        ArrayList<Double> array2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            array1.add(random.nextDouble(10));
            array2.add(Math.random()*10);
        }
        System.out.println(array1);
        System.out.println(array2);
    }
}
