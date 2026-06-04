import java.awt.*;
import javax.swing.*;

public class UseFrame {

    JFrame f1;
    JTextField t1;
    JPasswordField pf1;
    JLabel l1, l2, l3, l4, l5, l6, l7;
    JComboBox<String> cb;
    JList<String> cityList;
    JTextArea ta;
    JRadioButton rb1, rb2;
    JCheckBox c1, c2;
    JButton b1;

    public UseFrame() {

        f1 = new JFrame("Form");
        f1.setSize(500, 500);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = f1.getContentPane();
        c.setLayout(new GridLayout(8, 2, 10, 10));

        t1 = new JTextField(20);
        pf1 = new JPasswordField(20);

        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");
        l3 = new JLabel("Gender");
        l4 = new JLabel("Hobbies");
        l5 = new JLabel("State");
        l6 = new JLabel("City");
        l7 = new JLabel("Description");

        rb1 = new JRadioButton("Male", true);
        rb2 = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JPanel p1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p1.add(rb1);
        p1.add(rb2);

        c1 = new JCheckBox("Singing");
        c2 = new JCheckBox("Dancing");

        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        p2.add(c1);
        p2.add(c2);

        String city[] = {"Gzb", "Noida", "Fdb", "Gurugram"};
        String state[] = {"MP", "UP", "HR", "Delhi", "Goa"};

        cb = new JComboBox<>(state);
        cityList = new JList<>(city);

        ta = new JTextArea(3, 20);
        b1 = new JButton("Submit");

        c.add(l1);
        c.add(t1);

        c.add(l2);
        c.add(pf1);

        c.add(l3);
        c.add(p1);

        c.add(l4);
        c.add(p2);

        c.add(l5);
        c.add(cb);

        c.add(l6);
        c.add(new JScrollPane(cityList));

        c.add(l7);
        c.add(new JScrollPane(ta));

        c.add(new JLabel(""));
        c.add(b1);

        f1.setVisible(true);
    }

    public static void main(String[] args) {

        new UseFrame();
    }
}
