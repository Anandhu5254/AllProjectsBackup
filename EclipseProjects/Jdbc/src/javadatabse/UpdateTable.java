package javadatabse;

import java.sql.Connection;
import java.sql.Statement;

public class UpdateTable {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement stmt=null;
		try {
			conn=TestJDBC.getConnection();
		    stmt=conn.createStatement();
			stmt.executeUpdate("update emp set name='Siyana' where id=112");
			stmt.executeUpdate("update emp set age=15 where id=112");
			conn.close();
			stmt.close();
			System.out.println("Updated");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
