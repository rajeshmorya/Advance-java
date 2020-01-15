package connection;

import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Insertdate {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");  
		  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");  
		  
		PreparedStatement stmt=con.prepareStatement("insert into product values(?,?,?,?)");  
		stmt.setInt(1,107);
		stmt.setString(2,"table");
		stmt.setString(3,"furniture");
		String dop="13-02-2020";
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		java.util.Date udate = sdf.parse(dop);
		long l = udate.getTime();
		java.sql.Date sdate= new java.sql.Date(l);
		stmt.setDate(4,sdate);
		stmt.executeUpdate();
		System.out.println("record inserted");
	}

}
