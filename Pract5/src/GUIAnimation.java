import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class GUIAnimation extends JFrame {
    final int WIDTH = 960;
    final int HEIGHT = 540;
    Font font = new Font("Serif", Font.PLAIN, 20);

    JButton startBtn = new JButton("Start animation");

    ActionListener startAnimation = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            switch (startBtn.getText()) {
                case ("Start animation") -> {

                    startBtn.setText("Stop animation");
                }
                case ("Stop animation") -> {

                    startBtn.setText("Start animation");
                }
            }
        }
    };

    public GUIAnimation() throws HeadlessException {
        super("Animation");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        startBtn.setSize(200, 50);
        startBtn.setLocation(10, 10);
        startBtn.addActionListener(startAnimation);
        add(startBtn);
    }

    @Override
    public void paint(Graphics g) {
        File[] files = new File("Pract5/src/frames").listFiles();
        for (File file : files) {
            try {
                Image img = ImageIO.read(file);
                g.drawImage(img, 0, 0, WIDTH, HEIGHT, this);

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        GUIAnimation animation = new GUIAnimation();
    }
}
