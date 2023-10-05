import java.util.Comparator;

class StudentGradeComparator implements Comparator<Student> {
    public int compare(Student first, Student second) {
        return Integer.compare(second.grade, first.grade);
    }
}

public class Sort {
    private static final Comparator<Student> comparator = new StudentGradeComparator();

    public static void quickSort(Student[] students, int begin, int end) {
        int left = begin;
        int right = end;
        Student pivot = students[(left + right) / 2];
        while (left <= right) {
            while (comparator.compare(students[left], pivot) < 0) {
                left++;
            }
            while (comparator.compare(students[right], pivot) > 0) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    Student t = students[left];
                    students[left] = students[right];
                    students[right] = t;
                }
                left++;
                right--;
            }
        }
        if (left < end) {
            quickSort(students, left, end);
        }
        if (right > begin) {
            quickSort(students, begin, right);
        }
    }

    public static Student[] mergeSort(Student[] students) {
        if (students.length < 2)
            return students;

        Student[] first = new Student[students.length / 2];
        System.arraycopy(students, 0, first, 0, students.length / 2);

        Student[] second = new Student[students.length - students.length / 2];
        System.arraycopy(students, students.length / 2, second, 0, students.length - students.length / 2);

        first = mergeSort(first);
        second = mergeSort(second);
        return merge(first, second);
    }

    public static Student[] merge(Student[] first, Student[] second) {
        Student[] result = new Student[first.length + second.length];
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
            else if (comparator.compare(first[firstIndex], second[secondIndex]) < 0) {
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
}
