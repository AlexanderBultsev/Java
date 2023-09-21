import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import static java.lang.Math.*;

public class GUIFigures extends JFrame {
    final int WIDTH = 960;
    final int HEIGHT = 540;
    Font font = new Font("Serif", Font.PLAIN, 20);

    JButton startBtn = new JButton("Print figures");

    ActionListener printFiguresActionListener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            printFigures();
        }
    };

    public void printFigures() {
        Graphics g = this.getGraphics();
        Random random = new Random();
        for (int j = 0; j < 20; j++) {
            int npoints = random.nextInt(3,10);
            int x = random.nextInt(30, WIDTH - 30);
            int y = random.nextInt(30, HEIGHT - 30);
            int[] xpoints = new int[npoints];
            int[] ypoints = new int[npoints];
            for (int i = 0; i < npoints; i++) {
                xpoints[i] = (int)(cos((double)i * 2 * PI / (npoints-1)) * 20 + x);
                ypoints[i] = (int)(sin((double)i * 2 * PI / (npoints-1)) * 20 + y);
            }
            Polygon polygon = new Polygon(xpoints, ypoints, npoints);
            g.setColor(new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256)));
            g.fillPolygon(polygon);
        }
    }

    public GUIFigures() throws HeadlessException {
        super("Figures");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        startBtn.setSize(200, 50);
        startBtn.setLocation(10, 10);
        startBtn.addActionListener(printFiguresActionListener);
        startBtn.setFont(font);
        add(startBtn);
    }

    public static void main(String[] args) {
        new GUIFigures();
    }
}
