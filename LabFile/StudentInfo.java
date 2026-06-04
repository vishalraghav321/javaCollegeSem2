import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class StudentInfo extends JFrame implements ActionListener {

    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1;

    Connection con;

    public StudentInfo() {

        setTitle("Student Record");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2, 10, 10));

        l1 = new JLabel("Enter ID");
        l2 = new JLabel("Name");
        l3 = new JLabel("Course");

        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();

        b1 = new JButton("Search");
        b1.addActionListener(this);

        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);
        add(t3);

        add(new JLabel(""));
        add(b1);

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "admin@1234"
            );

        } catch (Exception e) {

            System.out.println(e);
        }

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        try {

            int id = Integer.parseInt(t1.getText());

            PreparedStatement ps = con.prepareStatement(
                    "SELECT * FROM student WHERE id=?"
            );

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                t2.setText(rs.getString("name"));
                t3.setText(rs.getString("course"));

            } else {

                JOptionPane.showMessageDialog(
                        this,
                        "Record Not Found"
                );
            }

        } catch (Exception ex) {

            System.out.println(ex);
        }
    }

    public static void main(String[] args) {

        new StudentInfo();
    }
}
