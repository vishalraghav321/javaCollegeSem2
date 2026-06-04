import java.sql.*;

public class DBConnect {

    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/college",
                    "root",
                    "admin@1234"
            );

            Statement stmt = con.createStatement();

            // Delete old record if exists
            stmt.executeUpdate(
                    "delete from student where id=101"
            );

            // INSERT
            int i = stmt.executeUpdate(
                    "insert into student values(101,'Ayush','MCA')"
            );

            if (i > 0) {
                System.out.println("Record Inserted");
            }

            // UPDATE
            int u = stmt.executeUpdate(
                    "update student set name='Rahul' where id=101"
            );

            if (u > 0) {
                System.out.println("Record Updated");
            }

            // RETRIEVE
            ResultSet rs = stmt.executeQuery(
                    "select * from student"
            );

            System.out.println("\nStudent Records:");

            while (rs.next()) {

                System.out.println(
                        rs.getInt(1) + " " +
                        rs.getString(2) + " " +
                        rs.getString(3)
                );
            }

            // DELETE
            int d = stmt.executeUpdate(
                    "delete from student where id=101"
            );

            if (d > 0) {
                System.out.println("Record Deleted");
            }

            con.close();

        } catch (Exception e) {

            System.out.println(e);
        }
    }
}
