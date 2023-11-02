import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Calculator2 extends JFrame {
    final int WIDTH = 244;
    final int HEIGHT = 310;
    Font font = new Font("Serif", Font.PLAIN, 20);
    JTextArea outputArea = new JTextArea(1, 15);
    JScrollPane outputPane = new JScrollPane(outputArea);
    JPanel buttonPanel = new JPanel();
    JButton button0 = new JButton("0");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton buttonDot = new JButton(".");
    JButton buttonAdd = new JButton("+");
    JButton buttonSub = new JButton("-");
    JButton buttonMul = new JButton("×");
    JButton buttonDiv = new JButton("÷");
    JButton buttonOpen = new JButton("(");
    JButton buttonClose = new JButton(")");
    JButton buttonRes = new JButton("=");
    JButton buttonDel = new JButton("<");
    JButton buttonClear = new JButton("C");
    StringBuffer input = new StringBuffer();

    public Calculator2() {
        super("Калькулятор");
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setFont(font);
        setVisible(true);
        setLayout(new FlowLayout());

        outputArea.setEditable(false);
        outputArea.setFont(font);
        outputPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        add(outputPane);

        buttonPanel.setLayout(new GridLayout(5,4,10,10));
        buttonOpen.setFont(font);
        buttonClose.setFont(font);
        buttonDel.setFont(font);
        buttonClear.setFont(font);
        button1.setFont(font);
        button2.setFont(font);
        button3.setFont(font);
        button4.setFont(font);
        button5.setFont(font);
        button6.setFont(font);
        button7.setFont(font);
        button8.setFont(font);
        button9.setFont(font);
        button0.setFont(font);
        buttonDot.setFont(font);
        buttonRes.setFont(font);
        buttonAdd.setFont(font);
        buttonSub.setFont(font);
        buttonMul.setFont(font);
        buttonDiv.setFont(font);
        buttonPanel.add(buttonOpen);
        buttonPanel.add(buttonClose);
        buttonPanel.add(buttonDel);
        buttonPanel.add(buttonClear);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        buttonPanel.add(buttonAdd);
        buttonPanel.add(button4);
        buttonPanel.add(button5);
        buttonPanel.add(button6);
        buttonPanel.add(buttonSub);
        buttonPanel.add(button7);
        buttonPanel.add(button8);
        buttonPanel.add(button9);
        buttonPanel.add(buttonMul);
        buttonPanel.add(button0);
        buttonPanel.add(buttonDot);
        buttonPanel.add(buttonRes);
        buttonPanel.add(buttonDiv);
        add(buttonPanel);

        button0.addActionListener(e -> {
            input.append("0");
            outputArea.setText(input.toString());
        });
        button1.addActionListener(e -> {
            input.append("1");
            outputArea.setText(input.toString());
        });
        button2.addActionListener(e -> {
            input.append("2");
            outputArea.setText(input.toString());
        });
        button3.addActionListener(e -> {
            input.append("3");
            outputArea.setText(input.toString());
        });
        button4.addActionListener(e -> {
            input.append("4");
            outputArea.setText(input.toString());
        });
        button5.addActionListener(e -> {
            input.append("5");
            outputArea.setText(input.toString());
        });
        button6.addActionListener(e -> {
            input.append("6");
            outputArea.setText(input.toString());
        });
        button7.addActionListener(e -> {
            input.append("7");
            outputArea.setText(input.toString());
        });
        button8.addActionListener(e -> {
            input.append("8");
            outputArea.setText(input.toString());
        });
        button9.addActionListener(e -> {
            input.append("9");
            outputArea.setText(input.toString());
        });
        buttonDot.addActionListener(e -> {
            input.append(".");
            outputArea.setText(input.toString());
        });
        buttonAdd.addActionListener(e -> {
            input.append(" + ");
            outputArea.setText(input.toString());
        });
        buttonSub.addActionListener(e -> {
            input.append(" - ");
            outputArea.setText(input.toString());
        });
        buttonMul.addActionListener(e -> {
            input.append(" × ");
            outputArea.setText(input.toString());
        });
        buttonDiv.addActionListener(e -> {
            input.append(" ÷ ");
            outputArea.setText(input.toString());
        });
        buttonOpen.addActionListener(e -> {
            input.append("( ");
            outputArea.setText(input.toString());
        });
        buttonClose.addActionListener(e -> {
            input.append(" )");
            outputArea.setText(input.toString());
        });
        buttonRes.addActionListener(e -> {
            try {
                ArrayList<String> list = new ArrayList<>(Arrays.asList(input.toString().split(" ")));
                input.append(calc(list));
            }
            catch (Exception exception) {
                input.append(" = Error");
            }
            outputArea.setText(input.toString());
            input.delete(0, input.length());
        });
        buttonDel.addActionListener(e -> {
            if (!input.isEmpty()) {
                input.delete(input.length() - 1, input.length());
                outputArea.setText(input.toString());
            }
        });
        buttonClear.addActionListener(e -> {
            input.delete(0, input.length());
            outputArea.setText(input.toString());
        });
    }
    private String calc(ArrayList<String> list) {
        if (list.isEmpty())
            return "";
        int i = 0;
        ArrayList<Float> sum = new ArrayList<>();
        ArrayList<String> sign = new ArrayList<>();
        sum.add((float) 0);
        sign.add("+");
        float next;

        for (String operand : list) {
            switch (operand) {
                case "+", "-", "×", "÷" -> sign.set(i, operand);
                case "(" -> {
                    i++;
                    if (sum.size() < i + 1) {
                        sum.add((float) 0);
                        sign.add("+");
                    } else {
                        sum.set(i, (float) 0);
                        sign.set(i, "+");
                    }
                }
                case ")" -> {
                    next = sum.get(i);
                    i--;
                    switch (sign.get(i)) {
                        case "+" -> sum.set(i, sum.get(i) + next);
                        case "-" -> sum.set(i, sum.get(i) - next);
                        case "×" -> sum.set(i, sum.get(i) * next);
                        case "÷" -> sum.set(i, sum.get(i) / next);
                    }
                }
                default -> {
                    next = Float.parseFloat(operand);
                    switch (sign.get(i)) {
                        case "+" -> sum.set(i, sum.get(i) + next);
                        case "-" -> sum.set(i, sum.get(i) - next);
                        case "×" -> sum.set(i, sum.get(i) * next);
                        case "÷" -> sum.set(i, sum.get(i) / next);
                    }
                }
            }
        }
        return " = " + sum.get(0);
    }

    public static void main(String[] args) {
        new Calculator2();
    }
}
