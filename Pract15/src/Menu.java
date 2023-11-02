import javax.swing.*;
import java.awt.*;

public class Menu extends JFrame {
    final int WIDTH = 244;
    final int HEIGHT = 310;
    Font font = new Font("Serif", Font.PLAIN, 20);

    JPanel menuPanel = new JPanel(new FlowLayout());
    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("Файл");
    JMenuItem saveFile = new JMenuItem("Сохранить");
    JMenuItem exitFile = new JMenuItem("Выход");
    JMenu editMenu = new JMenu("Правка");
    JMenuItem copyEdit = new JMenuItem("Копировать");
    JMenuItem cutEdit = new JMenuItem("Вырезать");
    JMenuItem pasteEdit = new JMenuItem("Вставить");
    JMenu helpMenu = new JMenu("Справка");

    JPanel buttonPanel = new JPanel(new FlowLayout());
    JButton button1 = new JButton("Кнопка");
    JButton button2 = new JButton("Кнопка");

    JPanel textPanel = new JPanel(new FlowLayout());
    JTextArea textArea = new JTextArea(2, 20);

    public Menu() {
        super("Калькулятор");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(font);
        setLayout(new GridLayout(3,1));

        fileMenu.add(saveFile);
        fileMenu.add(exitFile);
        menuBar.add(fileMenu);
        editMenu.add(copyEdit);
        editMenu.add(cutEdit);
        editMenu.add(pasteEdit);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        menuPanel.add(menuBar);
        add(menuPanel);

        buttonPanel.add(button1);
        buttonPanel.add(button2);
        add(buttonPanel);

        textPanel.add(textArea);
        add(textPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Menu();
    }
}
