import javax.swing.*;
import java.awt.*;

public class TextRedactor extends JFrame {

    public TextRedactor() {
        setTitle("Текстовый редактор");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setTabSize(1);
        textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20));
        textArea.setForeground(Color.BLACK);
        add(textArea);

        JMenuBar menuBar = new JMenuBar();
        JMenu colorMenu = new JMenu("Цвет");
        JMenu fontMenu = new JMenu("Шрифт");
        menuBar.add(colorMenu);
        menuBar.add(fontMenu);
        setJMenuBar(menuBar);

        JMenuItem color1 = new JMenuItem("Черный");
        colorMenu.add(color1);
        color1.addActionListener(e -> textArea.setForeground(Color.BLACK));
        JMenuItem color2 = new JMenuItem("Синий");
        colorMenu.add(color2);
        color2.addActionListener(e -> textArea.setForeground(Color.BLUE));
        JMenuItem color3 = new JMenuItem("Красный");
        colorMenu.add(color3);
        color3.addActionListener(e -> textArea.setForeground(Color.RED));

        JMenuItem font1 = new JMenuItem("Times New Roman");
        fontMenu.add(font1);
        font1.addActionListener(e -> textArea.setFont(new Font("Times New Roman", Font.PLAIN, 20)));
        JMenuItem font2 = new JMenuItem("MS Sans Serif");
        fontMenu.add(font2);
        font2.addActionListener(e -> textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 20)));
        JMenuItem font3 = new JMenuItem("Courier New");
        fontMenu.add(font3);
        font3.addActionListener(e -> textArea.setFont(new Font("Courier New", Font.PLAIN, 20)));
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var app = new TextRedactor();
            app.setVisible(true);
        });
    }
}
