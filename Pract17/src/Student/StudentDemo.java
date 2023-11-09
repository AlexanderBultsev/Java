package Student;

import java.awt.*;

public class StudentDemo {
    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setId("029467");
        student.setName("Александр");
        return student;
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var model = retrieveStudentFromDatabase();
            var view = new StudentView();
            var controller = new StudentController(model, view);
        });
    }
}
