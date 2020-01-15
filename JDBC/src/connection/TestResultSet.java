package connection;
import java.sql.*;

public class TestResultSet {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");
		Statement st = con.createStatement();
		boolean b = st.execute("select * from dep");
		System.out.println(b);
		ResultSet rs = st.getResultSet();
		while(rs.next()) 
		{
			System.out.println(rs.getString("d")+" "+rs.getString("name")+" "+rs.getInt("d1"));
		}

	}

}
