import javax.swing.*;
import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginApp extends JFrame {
    Font font = new Font("Serif", Font.PLAIN, 20);
    public LoginApp() {
        setTitle("Вход");
        setSize(400, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setFont(font);

        JPanel userPanel = new JPanel(new FlowLayout());
        JLabel userLabel = new JLabel("     Имя:");
        userLabel.setFont(font);
        userPanel.add(userLabel);
        JTextField userField = new JTextField(20);
        userField.setFont(font);
        userPanel.add(userField);
        add(userPanel);

        JPanel passwordPanel = new JPanel(new FlowLayout());
        JLabel passwordLabel = new JLabel("Пароль:");
        passwordLabel.setFont(font);
        passwordPanel.add(passwordLabel);
        JTextField passwordField = new JTextField(20);
        passwordField.setFont(font);
        passwordPanel.add(passwordField);
        add(passwordPanel);

        JPanel buttonPanel = new JPanel(new FlowLayout());
        JButton button = new JButton("Войти");
        button.setFont(font);
        buttonPanel.add(button, FlowLayout.LEFT);
        add(buttonPanel);

        button.addActionListener(event -> {
            String password = passwordField.getText();
            if (checkPassword(password)) {
                JOptionPane.showMessageDialog(this, "Вход выполнен", "", JOptionPane.INFORMATION_MESSAGE);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Пароль не подходит", "", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private boolean checkPassword(String password) {
        Pattern pattern = Pattern.compile("(?=\\w*\\d)(?=\\w*[a-z])(?=\\w*[A-Z]).{8,}");
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var app = new LoginApp();
            app.setVisible(true);
        });
    }
}
