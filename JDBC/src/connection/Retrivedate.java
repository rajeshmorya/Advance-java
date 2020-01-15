package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;
import java.text.*;

public class Retrivedate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root"); 
		PreparedStatement stmt=con.prepareStatement("select * from product");
		
		ResultSet rs = stmt.executeQuery();	
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy"); 
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			java.sql.Date sdate = rs.getDate(4);
			String s = sdf.format(sdate);
			System.out.println(s);
		}
	}

}
