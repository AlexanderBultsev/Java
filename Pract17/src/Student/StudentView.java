package Student;

import javax.swing.*;
import java.awt.*;

public class StudentView extends JFrame {
    JTextField idField;
    JTextField nameField;
    JLabel statusLabel;
    JButton buttonGet;
    JButton buttonSet;

    public StudentView() {
        setTitle("Редактор студента");
        setSize(300, 200);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel infoPanel = getInfoPanel();
        add(infoPanel, BorderLayout.CENTER);

        JPanel buttonPanel = getButtonPanel();
        add(buttonPanel, BorderLayout.SOUTH);

        setVisible(true);
    }

    private JPanel getInfoPanel() {
        JPanel infoPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JPanel idPanel = new JPanel(new FlowLayout());
        JLabel idLabel = new JLabel("ID:");
        idPanel.add(idLabel);
        idField = new JTextField(20);
        idPanel.add(idField);
        infoPanel.add(idPanel);

        JPanel namePanel = new JPanel(new FlowLayout());
        JLabel nameLabel = new JLabel("Имя:");
        namePanel.add(nameLabel);
        nameField = new JTextField(20);
        namePanel.add(nameField);
        infoPanel.add(namePanel);

        JPanel statusPanel = new JPanel(new FlowLayout());
        statusLabel = new JLabel("Не обновлено");
        statusPanel.add(statusLabel);
        infoPanel.add(statusPanel);

        return infoPanel;
    }

    private JPanel getButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        JPanel buttonGrid = new JPanel(new GridLayout(1,2,5,0));
        buttonGet = new JButton("Обновить");
        buttonGrid.add(buttonGet);
        buttonSet = new JButton("Сохранить");
        buttonGrid.add(buttonSet);
        buttonPanel.add(buttonGrid);

        return buttonPanel;
    }
}
