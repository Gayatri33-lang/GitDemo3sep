package com.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInsertExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String URL = "jdbc:sqlserver://LAPTOP-NJ1P9TEK\\GAYATRISQLSERVER:1433;databaseName=ShreeGanesha;user=sa;password=Shirdi@#3";
		Connection con1 = DriverManager.getConnection(URL);
		Statement stmt1 = con1.createStatement(); 
		int count  =stmt1.executeUpdate("insert into tbl_person values (8,'abc','abc@gmail',3,27,getdate()) ");
		System.out.println("rows affected " + count);
	}

}
