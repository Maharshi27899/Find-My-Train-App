package practiseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class FirstConnection {
//	First create 3 variables for url, username, password
	public static final String DB_URL = "jdbc:mysql://localhost:port/databasename";
	public static final String DB_UNAME = "root";
	public static final String DB_PWD = "root";
//	Create  a query variable
	public static final String INSERT_SQL = "INSERT INTO <tablename> values (column entries)";
	
	
//	Driver's code
	public static void main(String[] args) throws Exception {
//		Steps to establish a connection with Database
//		Step I : Load class
		Class.forName("com.mysql.jdbc.Driver");
//		Step II : get Connection
		Connection conn = DriverManager.getConnection(DB_URL,DB_UNAME,DB_PWD);
//		Step III : create statements
		Statement stmt = conn.createStatement();
//		Step IV : Execute Query 
		int rowsAffected = stmt.executeUpdate(INSERT_SQL);
//		Step V : Process Result
		System.out.println("Insert count : "+rowsAffected);
//		Step VI : Close
		conn.close();
		
	}
}
