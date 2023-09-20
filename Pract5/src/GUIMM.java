import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class GUIMM extends JFrame {
    final int WIDTH = 480;
    final int HEIGHT = 460;
    int MilanScore = 0;
    int MadridScore = 0;
    Font font = new Font("Serif", Font.PLAIN, 20);

    JButton Milan = new JButton("AC Milan");
    JButton Madrid = new JButton("Real Madrid");
    JLabel score = new JLabel("Result: 0 X 0");
    JLabel last = new JLabel("Last scorer: N/A");
    JLabel winner = new JLabel("Winner: DRAW");

    ActionListener MilanActionListner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MilanScore++;
            score.setText("Result: " + MilanScore + " X " + MadridScore);
            last.setText("Last scorer: AC Milan");
            if (MilanScore > MadridScore) {
                winner.setText("Winner: AC Milan");
            }
            else if (MilanScore == MadridScore) {
                winner.setText("Winner: DRAW");
            }
        }
    };

    ActionListener MadridActionListner = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            MadridScore++;
            score.setText("Result: " + MilanScore + " X " + MadridScore);
            last.setText("Last scorer: Real Madrid");
            if (MadridScore > MilanScore) {
                winner.setText("Winner: Real Madrid");
            }
            else if (MadridScore == MilanScore) {
                winner.setText("Winner: DRAW");
            }
        }
    };

    public GUIMM() throws HeadlessException {
        super("Results");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setVisible(true);
        setResizable(false);
        setFont(font);

        Milan.setBounds(20, 20, 200, 50);
        Milan.setFont(font);
        Milan.addActionListener(MilanActionListner);
        add(Milan);

        Madrid.setBounds( 240,20, 200, 50);
        Madrid.setFont(font);
        Madrid.addActionListener(MadridActionListner);
        add(Madrid);

        score.setBounds(160, 90, 200, 50);
        score.setFont(font);
        add(score);

        last.setBounds(160, 160, 200, 50);
        last.setFont(font);
        add(last);

        winner.setBounds(160, 230, 200, 50);
        winner.setFont(font);
        add(winner);
    }

    public static void main(String[] args) {
        new GUIMM();
    }
}
