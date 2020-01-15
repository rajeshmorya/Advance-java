package jdbcBookProgram;

import java.sql.*;

public class C {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");;
		Statement stmt = con.createStatement();
		stmt.execute("insert into tab14 values(20,'amit"+"')");
		System.out.println("done");
	}

}
