import javax.swing.*;
import java.awt.*;

public class Calculator1 extends JFrame {
    final int WIDTH = 280;
    final int HEIGHT = 280;
    Font font = new Font("Serif", Font.PLAIN, 20);
    JPanel numberPanel1 = new JPanel();
    JLabel numberLabel1 = new JLabel("Первое число");
    JTextField numberField1 = new JTextField(10);
    JPanel numberPanel2 = new JPanel();
    JLabel numberLabel2 = new JLabel("Второе число");
    JTextField numberField2 = new JTextField(10);
    JPanel buttonsPanel = new JPanel();
    JButton addButton = new JButton("Сложить");
    JButton subButton = new JButton("Вычесть");
    JButton mulButton = new JButton("Умножить");
    JButton divButton = new JButton("Поделить");
    public Calculator1 () {
        super("Калькулятор");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(font);
        setVisible(true);
        setLayout(new GridLayout(3,1));

        numberPanel1.setLayout(new FlowLayout());
        numberPanel1.add(numberLabel1);
        numberPanel1.add(numberField1);
        numberPanel2.setLayout(new FlowLayout());
        numberPanel2.add(numberLabel2);
        numberPanel2.add(numberField2);
        buttonsPanel.setLayout(new FlowLayout());
        buttonsPanel.add(addButton);
        buttonsPanel.add(subButton);
        buttonsPanel.add(mulButton);
        buttonsPanel.add(divButton);
        add(numberPanel1);
        add(numberPanel2);
        add(buttonsPanel);

        addButton.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(numberField1.getText().trim());
                double x2 = Double.parseDouble(numberField2.getText().trim());
                JOptionPane.showMessageDialog(this, "Результат = " + (x1 + x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (NumberFormatException ne)
            {
                JOptionPane.showMessageDialog( this, "Ошибка в числах","Ошибка" , JOptionPane.ERROR_MESSAGE);
            }
        });
        subButton.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(numberField1.getText().trim());
                double x2 = Double.parseDouble(numberField2.getText().trim());
                JOptionPane.showMessageDialog(this, "Результат = " + (x1 - x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog( this, "Ошибка в числах","Ошибка" , JOptionPane.ERROR_MESSAGE);
            }
        });
        mulButton.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(numberField1.getText().trim());
                double x2 = Double.parseDouble(numberField2.getText().trim());
                JOptionPane.showMessageDialog(this, "Результат = " + (x1 * x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog( this, "Ошибка в числах","Ошибка" , JOptionPane.ERROR_MESSAGE);
            }
        });
        divButton.addActionListener(e -> {
            try {
                double x1 = Double.parseDouble(numberField1.getText().trim());
                double x2 = Double.parseDouble(numberField2.getText().trim());
                JOptionPane.showMessageDialog(this, "Результат = " + (x1 / x2), "Результат", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (NumberFormatException ne) {
                JOptionPane.showMessageDialog( this, "Ошибка в числах","Ошибка" , JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    public static void main(String[] args) {
        new Calculator1();
    }
}

