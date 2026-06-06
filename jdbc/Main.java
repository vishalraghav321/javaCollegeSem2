import java.sql.*;

public class Main {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/abes", "root", "admin@1234");
			Statement s = c.createStatement();

			ResultSet rs = s.executeQuery("select * from emp");
			while (rs.next()) {
				System.out.println(rs.getInt("empid") + " " +
						rs.getString("emp_name") + " " +
						rs.getDate("emp_dob") + " " +
						rs.getDate("emp_doj") + " " +
						rs.getInt("emp_sal") + " " +
						rs.getString("emp_aadhar"));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
