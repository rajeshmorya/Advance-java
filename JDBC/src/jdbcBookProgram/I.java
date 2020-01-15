package jdbcBookProgram;

import java.sql.*;
public class I {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Connection con = Util.getConnection();
		PreparedStatement pst=con.prepareStatement("insert into tab14 values(?,?)");
		pst.setInt(1, 101);
		pst.setString(2,"mukesh");
		pst.executeUpdate();
		pst.setInt(1, 102);
		pst.setString(2,"ramesh");
		pst.executeUpdate();
		pst.setInt(1, 103);
		pst.setString(2,"suresh");
		pst.executeUpdate();
		pst.setInt(1, 104);
		pst.setString(2,"mahesh");
		pst.executeUpdate();
		pst.setInt(1, 105);
		pst.setString(2,"ramesh");
		pst.executeUpdate();
		System.out.println("done");
	}

}
