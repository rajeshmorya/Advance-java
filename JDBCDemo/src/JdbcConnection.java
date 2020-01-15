import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcConnection {

	public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		try {
			FileInputStream fis = new FileInputStream("D:\\java\\collection\\oracle.properties");
			Properties pos = new Properties();
			pos.load(fis);
			String driverclassName = pos.getProperty("k1");
			String url = pos.getProperty("k2");
			String username = pos.getProperty("k3");
			String password = pos.getProperty("k4");
			Class.forName(driverclassName);
			Connection conn = DriverManager.getConnection(url, username, password);
			Statement stmt=conn.createStatement();  
			  
			//step4 execute query  
			ResultSet rs=stmt.executeQuery("select * from emp"); 
			while(rs.next())  
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)); 
			
			System.out.println("the driver is"+driverclassName);
			System.out.println("Connection is opend");
			conn.close();
			System.out.println("Connection is closed");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
