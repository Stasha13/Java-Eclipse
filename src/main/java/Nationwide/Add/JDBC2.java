package Nationwide.Add;

import java.sql.*;

public class JDBC2 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/nationwide?useLegacyDatetimeCode=false&serverTimezone=Europe/London","root","Jhb4534586");
		stmt = conn.createStatement();
		//stmt.executeUpdate("insert into school values(1,'Stasha',80)");
		ResultSet rs = stmt.executeQuery("Select * from school");
			while (rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
		stmt.close();
		conn.close();
	}catch (Exception se) {
		System.out.println(se.toString());
	}
	}
}
