import java.util.Arrays;

public class QuickSort {
    public static void quickSort(Comparable[] source, int begin, int end) {
        int left = begin;
        int right = end;
        Comparable pivot = source[(left + right) / 2];
        while (left <= right) {
            while (source[left].compareTo(pivot) > 0) {
                left++;
            }
            while (source[right].compareTo(pivot) < 0) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    Comparable t = source[left];
                    source[left] = source[right];
                    source[right] = t;
                }
                left++;
                right--;
            }
        }
        if (left < end) {
            quickSort(source, left, end);
        }
        if (right > begin) {
            quickSort(source, begin, right);
        }
    }

    public static void main(String[] args) {
        Comparable[] students = {
                new ComplicatedStudent("Иванов", 42125, 23),
                new ComplicatedStudent("Петров", 1265, 99),
                new ComplicatedStudent("Сидоов", 346, 1),
                new ComplicatedStudent("Соболев", 422, 12),
                new ComplicatedStudent("Егоров", 6222, 74)};
        quickSort(students, 0, students.length - 1);
        System.out.println(Arrays.toString(students));
    }
}
