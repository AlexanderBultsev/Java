import javax.swing.*;
import java.awt.*;

public class Countries extends JFrame {
    final int WIDTH = 240;
    final int HEIGHT = 240;
    Font font = new Font("Serif", Font.PLAIN, 20);

    String[] countries = {"Россия", "Китай", "Япония", "Франция"};
    JComboBox<String> comboBox = new JComboBox<>(countries);

    public Countries() {
        super("Выберите");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(font);
        setVisible(true);
        setLayout(new FlowLayout());

        add(comboBox);

        comboBox.addActionListener(e -> JOptionPane.showMessageDialog(this, "Выбрано: " + comboBox.getSelectedItem(), "Выбрано", JOptionPane.INFORMATION_MESSAGE));
    }

    public static void main(String[] args) {
        new Countries();
    }
}
