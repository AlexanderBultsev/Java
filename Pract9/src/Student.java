public class Student implements Comparable{
    String name;
    int idNumber;

    public Student(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
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
                '}';
    }
}