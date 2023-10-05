public class Student implements Comparable{
    String name;
    int idNumber;
    int grade;

    public Student(String name, int idNumber, int grade) {
        this.name = name;
        this.idNumber = idNumber;
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.idNumber, ((Student)o).idNumber);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", idNumber=" + idNumber +
                ", grade=" + grade +
                '}';
    }
}