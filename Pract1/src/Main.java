import java.util.Scanner;

public class Main {
    public static int fact(int base) {
        int fact = 1;
        for (int num = 1; num < base + 1; num++) {
            fact *= num;
        }
        return fact;
    }

    public static void main(String[] args) {
        //task 1
        System.out.println("\ntask 1");
        int[] arr1 = {12, 2, 53, 34, 35, 12};
        int sum1 = 0;
        System.out.print("Array:");
        for (int el : arr1) {
            sum1 += el;
            System.out.print(" " + el);
        }
        System.out.println("\nSumma = " + sum1);
        double avg1 = (double)sum1 / arr1.length;
        System.out.println("Average = " + avg1);

        //task 2
        System.out.println("\ntask 2");
        System.out.println("Enter array of 6 el");
        int[] arr2 = new int[6];
        int sum2 = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            arr2[i] = scanner.nextInt();
            sum2 += arr2[i];
        }
        System.out.println("Summa = " + sum2);
        int j = 1, min2 = arr2[0], max2 = arr2[0];
        while (j < arr2.length) {
            if (arr2[j] < min2) {
                min2 = arr2[j];
            }
            if (arr2[j] > max2) {
                max2 = arr2[j];
            }
            j++;
        }
        System.out.println("Min = " + min2 + "; Max = " + max2);

        // task 3
        System.out.println("\ntask 3");
        System.out.println(args.length);
        for (String arg : args) {
            System.out.println(arg);
        }

        // task 4
        System.out.println("\ntask 4");
        System.out.print("Harmonic series: ");
        for(int i = 1; i < 11; i++) {
            System.out.printf("%4.2f ", (float)1 / i);
        }
        System.out.println();

        // task 5
        System.out.println("\ntask 5");
        System.out.print("Enter fact base: ");
        int fb = scanner.nextInt();
        System.out.println("Fact: " + fact(fb));
    }
}
