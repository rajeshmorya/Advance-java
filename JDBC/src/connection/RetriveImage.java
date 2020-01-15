package connection;

import java.io.*;
import java.sql.*;

public class RetriveImage {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
	       Class.forName("com.mysql.jdbc.Driver");
	       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/aug","root","root");

	       Statement st=con.createStatement();
	       ResultSet rs=st.executeQuery("select * from insertimg");
	       rs.first();
	    //   if(rs.next())
	      // {
	         InputStream in=rs.getBinaryStream("image");

	     	 FileOutputStream fos=new FileOutputStream("newpict1.png");

		     int bytesRead=0;
	  	     byte [] buffer=new byte[4096];

	    	 while((bytesRead=in.read(buffer))!=-1)
		     {
		        fos.write(buffer,0,bytesRead);
	         }

			System.out.println("photo is stored in newpict1.png");

	          fos.close();
		      in.close();
		      rs.close();
		      st.close();
		      con.close();
	}

}
