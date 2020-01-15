package jdbcBookProgram;

import java.sql.*;

public class D {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		st.execute("insert into tab14 Values(10,'sumit')");
		System.out.println("done");
	}

}
