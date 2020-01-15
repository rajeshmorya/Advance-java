package connection;

import java.io.*;
import java.sql.*;

public class InsertImges {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, FileNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root"); 
		
		File file = new File("C:\\Users\\rajesh\\Downloads\\rajesh.jpg");
		FileInputStream fis = new FileInputStream(file);
		
		PreparedStatement stmt=con.prepareStatement("insert into Insertimg values(?,?)");
		stmt.setString(1,"rajesh");
		
		stmt.setBinaryStream(2,fis,(int)file.length());
		stmt.executeUpdate();
	}
	

}
