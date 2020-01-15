package jdbcBookProgram;

import java.sql.*;


public class G {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from tab14");
		ResultSetMetaData r = rs.getMetaData();
		System.out.println(r.getColumnCount());
	}

}
