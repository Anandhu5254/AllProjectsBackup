package javadatabse;

import java.sql.Connection;
import java.sql.Statement;

public class InsertIntoTable {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement statement=null;
		

		try {
			conn=TestJDBC.getConnection();
			statement=conn.createStatement();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate("INSERT INTO emp VALUES('Anandhu', 111, 23)");
//			stmt.executeUpdate("INSERT INTO emp VALUES('Aju', 112, 22)");
//			stmt.executeUpdate("INSERT INTO emp VALUES('Ammu', 113, 20)");
//			stmt.executeUpdate("INSERT INTO emp VALUES('Darsana', 114, 17)");
			statement.close();
			conn.close();
			System.out.println("Record inserted successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
