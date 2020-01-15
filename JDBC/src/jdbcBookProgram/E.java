package jdbcBookProgram;

import java.sql.*;

public class E {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from tab14");
		while(rs.next())
		{
			System.out.print(rs.getString(1)+":");
			System.out.println(rs.getString(2));
		}
		System.out.println("done");
	}

}
