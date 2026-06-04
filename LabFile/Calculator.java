import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {

    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    public Calculator() {

        setTitle("Calculator");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 2, 10, 10));

        JLabel l1 = new JLabel("First Number");
        JLabel l2 = new JLabel("Second Number");
        JLabel l3 = new JLabel("Result");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Add");
        b2 = new JButton("Subtract");
        b3 = new JButton("Multiply");
        b4 = new JButton("Divide");

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        int num1 = Integer.parseInt(t1.getText());
        int num2 = Integer.parseInt(t2.getText());

        int result = 0;

        if (e.getSource() == b1) {
            result = num1 + num2;
        }

        else if (e.getSource() == b2) {
            result = num1 - num2;
        }

        else if (e.getSource() == b3) {
            result = num1 * num2;
        }

        else if (e.getSource() == b4) {
            result = num1 / num2;
        }

        t3.setText(String.valueOf(result));
    }

    public static void main(String[] args) {

        new Calculator();
    }
}