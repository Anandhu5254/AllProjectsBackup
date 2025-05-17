package javadatabse;

import java.sql.Connection;
import java.sql.Statement;

public class OfficeTable {

	public static void main(String[] args) {
		
		Connection conn=null;
		Statement statement=null;
		String query="create table exam1(employee_id int primary key not null, age int not null,firstname varchar(30),lastname varchar(30))";
		
		try {
			
			conn=OfficeJDBC.getConnection();
			statement=conn.createStatement();
			statement.execute(query);
			statement.close();
			conn.close();
			System.out.println("table created successfully");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
