import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Guess extends JFrame {
    Font font = new Font("Serif", Font.PLAIN, 20);
    final int answer;
    int attempts;
    public Guess() {
        setTitle("Угадай");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setFont(font);

        JLabel infoLabel = new JLabel("Угадайте число от 0 до 20");
        infoLabel.setFont(font);
        add(infoLabel);
        JTextField inputField = new JTextField(10);
        inputField.setFont(font);
        add(inputField);
        JLabel attemptsLabel = new JLabel("У вас осталось 3 попытки");
        attemptsLabel.setFont(font);
        add(attemptsLabel);
        JButton button = new JButton("Угадать");
        button.setFont(font);
        add(button);

        answer = (new Random()).nextInt(21);
        setTitle("Угадай " + answer);
        attempts = 3;

        button.addActionListener(event -> {
            try {
                int input = Integer.parseInt(inputField.getText());

                attempts -= 1;
                switch (attempts) {
                    case 2:
                        attemptsLabel.setText("У вас осталось 2 попытки");
                        break;
                    case 1:
                        attemptsLabel.setText("У вас осталась 1 попытка");
                        break;
                    case 0:
                        attemptsLabel.setText("У вас не осталось попыток");
                        button.setBackground(Color.RED);
                        button.setText("Закрыть");
                        break;
                    default:
                        dispose();
                        break;
                }

                if (input < answer) {
                    setTitle("Больше");
                    infoLabel.setText("Маловато... Нужно больше");
                } else if (input > answer) {
                    setTitle("Меньше");
                    infoLabel.setText("Многовато... Нужно меньше");
                } else {
                    setTitle("Победа");
                    infoLabel.setText("Ура! Вы угадали! Это " + answer + "!");
                    attempts = 0;
                    attemptsLabel.setText("Победа! Вы просто гнений!");
                    button.setBackground(Color.GREEN);
                    button.setText("Закрыть");
                }
            } catch (NumberFormatException exception) {
                JOptionPane.showMessageDialog(this, "Введите число, а не абракадабру", "Нужно число", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var app = new Guess();
            app.setVisible(true);
        });
    }
}
