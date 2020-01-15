package jdbcBookProgram;

import java.sql.*;
class Util {
	static Connection getConnection() throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
	return con;
	}
}
public class H {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = Util.getConnection();
		PreparedStatement pst = con.prepareStatement("insert into tab14 values(10,'kratika')");
		pst.executeUpdate();
		System.out.println("done");
	}

}
