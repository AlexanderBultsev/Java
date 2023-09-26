import java.util.Objects;
import java.util.Scanner;

public class Main {

    /*
    Определите, сколько раз в этой последовательности встречается число 1.
     */
    public static int countOfOne() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = Integer.parseInt(s);
        if (Objects.equals(s, "00")) {
            return 0;
        }
        if (n == 1) {
            return 1 + countOfOne();
        }
        return countOfOne();
    }

    /*
    Выведите все нечетные числа из этой последовательности, сохраняя их порядок.
     */
    public static void oddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println("-> " + n);
        }
        oddNumbers();
    }

    /*
    Задание Вывести члены последовательности с нечетными номерами.
     */
    public static void oddIndex() {
        Scanner scanner = new Scanner(System.in);
        int n;
        for (int i = 0; i < 2; i++) {
            n = scanner.nextInt();
            if (n == 0) {
                return;
            }
            if (i % 2 == 0) {
                System.out.println("-> " + n);
            }
        }
        oddIndex();
    }

    public static void main(String[] args) {
        System.out.println("Количество единиц в последовательности");
        System.out.println("-> " + countOfOne());

        System.out.println("Только нечетные числа последовательности");
        oddNumbers();

        System.out.println("Только числа с нечетными номерами");
        oddIndex();
    }
}