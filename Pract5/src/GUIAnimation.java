import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class GUIAnimation extends JFrame {
    final int WIDTH = 960;
    final int HEIGHT = 540;
    Font font = new Font("Serif", Font.PLAIN, 20);

    ArrayList<Image> frames;

    JButton startBtn = new JButton("Start animation");

    ActionListener startAnimation = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                animate();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
    };

    public void setFrames(String path) throws IOException {
        frames = new ArrayList<>();
        for (File file : new File(path).listFiles()) {
            frames.add(ImageIO.read(file));
        }
    }

    public GUIAnimation() throws HeadlessException, IOException {
        super("Animation");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);

        startBtn.setSize(200, 50);
        startBtn.setLocation(10, 10);
        startBtn.addActionListener(startAnimation);
        startBtn.setFont(font);
        add(startBtn);
    }

    public void animate() throws InterruptedException {
        Graphics g = this.getGraphics();
        for (int i = 0; i < frames.size(); i++) {
            g.drawImage(frames.get(i), 0, 0, WIDTH, HEIGHT, this);
            Thread.sleep(40);
        }
    }

    public static void main(String[] args) throws IOException {
        GUIAnimation animation = new GUIAnimation();
        if (args.length == 1) {
            animation.setFrames(args[0]);
        }
        else {
            System.out.println("Wrong frames path");
        }
    }
}
