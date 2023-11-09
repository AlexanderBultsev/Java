package Student;

public class StudentController {
    private final Student model;
    private final StudentView view;

    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;

        view.buttonSet.addActionListener(e -> setAction());
        view.buttonGet.addActionListener(e -> getAction());
    }

    private void setStudentId() {
        String id = view.idField.getText();
        model.setId(id);
    }
    private String getStudentId() {
        return model.getId();
    }
    private void setStudentName() {
        String name = view.nameField.getText();
        model.setName(name);
    }
    private String getStudentName() {
        return model.getName();
    }
    private void setAction() {
        setStudentId();
        setStudentName();
        view.statusLabel.setText("Успешно сохранено");
    }

    private void getAction() {
        view.idField.setText(getStudentId());
        view.nameField.setText(getStudentName());
        view.statusLabel.setText("Успешно обновлено");
    }
}
