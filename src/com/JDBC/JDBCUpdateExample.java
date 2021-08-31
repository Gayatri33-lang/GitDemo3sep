package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCUpdateExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String URL1 = "jdbc:sqlserver://LAPTOP-NJ1P9TEK\\GAYATRISQLSERVER:1433;databaseName=ShreeGanesha;user=sa;password=Shirdi@#3";
			Connection con2 =DriverManager.getConnection(URL1);
			Statement stmt2 = con2.createStatement();
			int result1 =stmt2.executeUpdate("update tbl_person set age = 28 where id = 8");
			System.out.println("rows updated  " + result1);
			
	}		

}
