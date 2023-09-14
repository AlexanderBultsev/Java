import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NArray {
    public static boolean isIncreasing(ArrayList<Integer> array) {
        for (int i = 1; i < array.size(); i++) {
            if (array.get(i) < array.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // 3
        Random random = new Random();

        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            array.add(random.nextInt(10, 100));
        }

        System.out.println(array);
        System.out.println("Возрастающий: " + isIncreasing(array));

        // 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите натуральное число: ");
        int n = scanner.nextInt();
        while (n < 1) {
            System.out.println("Некорректный ввод. Повторите ввод.");
            System.out.print("Введите натуральное число: ");
            n = scanner.nextInt();
        }


        ArrayList<Integer> array1 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            array1.add(random.nextInt(n + 1));
        }
        System.out.println(array1);

        ArrayList<Integer> array2 = new ArrayList<>();
        for (int i = 1; i < array1.size(); i += 2) {
            array2.add(array1.get(i));
        }
        System.out.println(array2);
    }
}
