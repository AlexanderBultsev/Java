import java.util.Arrays;

public class MergeSort {
    public static Comparable[] sort(Comparable[] source) {
        if (source.length < 2)
            return source;

        Comparable[] first = new Comparable[source.length / 2];
        System.arraycopy(source, 0, first, 0, source.length / 2);

        Comparable[] second = new Comparable[source.length - source.length / 2];
        System.arraycopy(source, source.length / 2, second, 0, source.length - source.length / 2);

        first = sort(first);
        second = sort(second);
        return merge(first, second);
    }

    public static Comparable[] merge(Comparable[] first, Comparable[] second) {
        Comparable[] result = new Comparable[first.length + second.length];
        int firstIndex = 0;
        int secondIndex = 0;
        for (int i = 0; i < result.length; i++) {
            if (firstIndex == first.length) {
                result[i] = second[secondIndex];
                secondIndex++;
            }
            else if (secondIndex == second.length) {
                result[i] = first[firstIndex];
                firstIndex++;
            }
            else if (first[firstIndex].compareTo(second[secondIndex]) < 0) {
                result[i] = first[firstIndex];
                firstIndex++;
            }
            else {
                result[i] = second[secondIndex];
                secondIndex++;
            }
        }
        return result;
    }

    public static Comparable[] mergeAndSort(Comparable[] first, Comparable[] second) {
        return merge(sort(first), sort(second));
    }

    public static void main(String[] args) {
        Comparable[] studentsFirst = {
                new ComplicatedStudent("Иванов", 42125, 23),
                new ComplicatedStudent("Петров", 1265, 99),
                new ComplicatedStudent("Сидоов", 346, 1)};

        Comparable[] studentsSecond = {
                new ComplicatedStudent("Соболев", 422, 12),
                new ComplicatedStudent("Егоров", 6222, 74)};

        Comparable[] studentsMerged = new Comparable[studentsFirst.length + studentsSecond.length];
        studentsMerged = mergeAndSort(studentsFirst, studentsSecond);
        System.out.println(Arrays.toString(studentsMerged));
    }
}
