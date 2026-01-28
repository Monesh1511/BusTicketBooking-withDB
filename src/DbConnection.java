

import java.sql.*;

public class DbConnection {
	private static final String url = "jdbc:mysql://localhost:3306/busreser";
	private static final String userName = "root";
	private static final String passWord = "Monesh@1511";
	
	public static Connection getConnection() throws SQLException{
		return  DriverManager.getConnection(url,userName,passWord);
	}

}