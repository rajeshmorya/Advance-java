package connection;
import java.sql.*;

public class Testcon {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		int i = st.executeUpdate("insert into dep values('d5','raju1',107)");
		//System.out.println(con.getClass().getName());
		//System.out.println(con.getClass().getName());
	}

}
