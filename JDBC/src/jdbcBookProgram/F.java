package jdbcBookProgram;

import java.sql.*;


public class F {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		DatabaseMetaData dbmd = con.getMetaData();
		System.out.println(dbmd.getDriverName());
		System.out.println(dbmd.getDatabaseProductName());
		System.out.println(dbmd.getDatabaseProductVersion());
	}

}
