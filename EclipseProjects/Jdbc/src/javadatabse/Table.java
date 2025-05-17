package javadatabse;

import java.sql.Connection;
import java.sql.Statement;

public class Table {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement statement=null;
		String query="create table emp(Name varchar(30),id int,age int)";
		try
		{
			conn=TestJDBC.getConnection();
			statement=conn.createStatement();
			statement.execute(query);
			statement.close();
			conn.close();
			System.out.println("table created succesfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
