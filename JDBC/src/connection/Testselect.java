package connection;
import java.sql.*;
public class Testselect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root"); 
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from dep");	
		while(rs.next())
		{
			System.out.println(rs.getString("d")+" "+rs.getString("name")+" "+rs.getInt("d1"));
		}
		rs.close();
		st.close();
		con.close();
			
	}

}
