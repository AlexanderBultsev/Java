import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Area extends JFrame {

    public Area() {
        setTitle("Карта");
        setSize(300, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel panelC = new JPanel();
        panelC.setBackground(Color.RED);
        add(panelC, BorderLayout.CENTER);
        panelC.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(panelC, "Добро пожаловать в ЦАО");
            }
        });

        JPanel panelW = new JPanel();
        panelW.setBackground(Color.ORANGE);
        add(panelW, BorderLayout.WEST);
        panelW.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(panelW, "Добро пожаловать в ЗАО");
            }
        });

        JPanel panelS = new JPanel();
        panelS.setBackground(Color.YELLOW);
        add(panelS, BorderLayout.SOUTH);
        panelS.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(panelS, "Добро пожаловать в ЮАО");
            }
        });

        JPanel panelN = new JPanel();
        panelN.setBackground(Color.YELLOW);
        add(panelN, BorderLayout.NORTH);
        panelN.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(panelN, "Добро пожаловать в САО");
            }
        });

        JPanel panelE = new JPanel();
        panelE.setBackground(Color.ORANGE);
        add(panelE, BorderLayout.EAST);
        panelE.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
            JOptionPane.showMessageDialog(panelE, "Добро пожаловать в ВАО");
            }
        });
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var app = new Area();
            app.setVisible(true);
        });
    }
}
