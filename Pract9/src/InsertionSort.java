import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(Comparable[] list) {
        for (int i = 1; i < list.length; i++) {
            Comparable t = list[i];
            int j = i - 1;
            while (j >= 0 && list[j].compareTo(t) > 0) {
                list[j+1] = list[j];
                j--;
            }
            list[j + 1] = t;
        }
    }ыфв

    public static void main(String[] args) {
        Comparable[] students = {
                new Student("Иванов", 42125),
                new Student("Петров", 1265),
                new Student("Сидоов", 346)};
        insertionSort(students);
        System.out.println(Arrays.toString(students));
    }
}
