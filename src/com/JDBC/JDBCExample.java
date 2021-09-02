// JDBC - Establish connection with Database 
// 5 steps 
//1 . Load SQL server Jar to class path & classname load 




package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
			//String dbURL = "jdbc:sqlserver://localhost:1433;databaseName=ShreeGanesha";
			//String user = "LAPTOP-NJ1P9TEK\\Gayatri";
			//String pass = "shirdi@1234";
			//Connection conn = DriverManager.getConnection(dbURL, user, pass);
			
	String dbURL = "jdbc:sqlserver://LAPTOP-NJ1P9TEK\\GAYATRISQLSERVER:1433;databaseName=ShreeGanesha;user=sa;password=Shirdi@#3";
			
		Connection con =  DriverManager.getConnection(dbURL);
			
			Statement stmt = con.createStatement(); 
			
		ResultSet rs1	=stmt.executeQuery("select * from tbl_person");
		
		while(rs1.next()) {
			System.out.println(rs.getInt(1)  + " " + rs.getString(2) + " " + rs.getString(3));
		}
			
	}

}
