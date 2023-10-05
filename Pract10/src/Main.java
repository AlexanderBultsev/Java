import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student[] students1 = {
                new Student("Иванов", 42125, 23),
                new Student("Петров", 1265, 99),
                new Student("Сидоов", 346, 1),
                new Student("Соболев", 422, 12),
                new Student("Егоров", 6222, 74)};
        Sort.quickSort(students1, 0, students1.length - 1);
        System.out.println(Arrays.toString(students1));

        Student[] students2 = {
                new Student("Иванов", 42125, 23),
                new Student("Петров", 1265, 99),
                new Student("Сидоов", 346, 1),
                new Student("Соболев", 422, 12),
                new Student("Егоров", 6222, 74)};
        Student[] sortedStudents2 = Sort.mergeSort(students2);
        System.out.println(Arrays.toString(sortedStudents2));

        Student[] studentsFirst = {
                new Student("Иванов", 42125, 23),
                new Student("Петров", 1265, 99),
                new Student("Сидоов", 346, 1)};
        Student[] studentsSecond = {
                new Student("Соболев", 422, 12),
                new Student("Егоров", 6222, 74)};

        Student[] mergedStudents = Sort.merge(Sort.mergeSort(studentsFirst), Sort.mergeSort(studentsSecond));
        System.out.println(Arrays.toString(mergedStudents));
    }
}
