package jdbcBookProgram;

import java.sql.*;


public class A {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement stmt = con.createStatement();
		stmt.execute("create table tab14(id int,name varchar(10))");
		System.out.println("done");
	}

}
