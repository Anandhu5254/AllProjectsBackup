package javadatabse;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectFromTable {

	public static void main(String args[]){
	Connection conn = null;
	Statement statement = null;
	 String query = "select id, Name from emp";
	try{
	conn = TestJDBC.getConnection();
	statement = conn.createStatement();
	ResultSet rs = statement.executeQuery(query);
	while (rs.next()) {
	 String id = rs.getString("id");
	 String Name = rs.getString("Name");
	 System.out.println("Id : " + id);
	 System.out.println("Name : " + Name); 
	}
	statement.close();
	conn.close();
	}catch(Exception e){
	e.printStackTrace();
	}
	}
	}
