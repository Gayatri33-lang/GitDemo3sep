package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {

	public static Connection JDBC(String dbName) throws ClassNotFoundException, SQLException {
				
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String URL1 = "jdbc:sqlserver://LAPTOP-NJ1P9TEK\\GAYATRISQLSERVER:1433;databaseName="+dbName+";user=sa;password=Shirdi@#3";
			Connection con2 =DriverManager.getConnection(URL1);
			return con2;
			
		
	}
	
	
}
