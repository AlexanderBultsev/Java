public class ComplicatedStudent extends Student {
    int grade;
    public ComplicatedStudent(String name, int idNumber, int grade) {
        super(name, idNumber);
        this.grade = grade;
    }

    @Override
    public int compareTo(Object o) {
        return Integer.compare(this.grade, ((ComplicatedStudent)o).grade);
    }

    @Override
    public String toString() {
        return "ComplicatedStudent{" +
                "idNumber=" + idNumber +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
