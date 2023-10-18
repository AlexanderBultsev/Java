import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String name;
    int id;
    int grade;
    Date birthDate;
    SimpleDateFormat shortDateFormat = new SimpleDateFormat("d.M.yy");
    SimpleDateFormat mediumDateFormat = new SimpleDateFormat("dd.MM.yyyy");
    SimpleDateFormat largeDateFormat = new SimpleDateFormat("dd MMM yyyy");
    public Student(String name, int id, int grade, Date birthDate) {
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.birthDate = birthDate;
    }
    @Override
    public String toString() {
        String result = "Студент {";
        result += "id = " + id;
        result += ", имя = " + name;
        result += ", оценка = " + grade;
        result += ", дата рождения = " + mediumDateFormat.format(birthDate);
        result += '}';
        return result;
    }
    public String toString(String dateFormat) {
        String result = "Студент {";
        result += "id = " + id;
        result += ", имя = " + name;
        result += ", оценка = " + grade;
        result += ", дата рождения = ";
        switch (dateFormat) {
            case "short" -> result += shortDateFormat.format(birthDate);
            default -> result += mediumDateFormat.format(birthDate);
            case "large" -> result += largeDateFormat.format(birthDate);
        }
        result += '}';
        return result;
    }

    public static void main(String[] args) {
        Student student = new Student("Лёшка", 777, 3, new Date());

        System.out.println(student.toString("short"));
        System.out.println(student);
        System.out.println(student.toString("large"));
    }
}

