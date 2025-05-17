package javadatabse;

import java.sql.Connection;
import java.sql.Statement;

public class DeleteFromTable {
  
	public static void main(String args[]){
		Connection conn = null;
		Statement statement = null;
		String query="delete from emp where id=111";
		try{
		conn = TestJDBC.getConnection();
		statement = conn.createStatement();
		statement.executeUpdate(query);
		statement.close();
		conn.close();
		 System.out.println("Record deleted successfully.");
		}
		catch(Exception e)
		{
		  e.printStackTrace();
		}
		}
		}

