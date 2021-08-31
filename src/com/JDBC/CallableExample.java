package com.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class CallableExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con3 = JDBCUtil.JDBC("ShreeGanesha");
		//Statement stmt =  con3.createStatement();
		CallableStatement stmt1 = con3.prepareCall("{call withoutput(?,?)}"); //used to call SP 
		stmt1.setString(1, "naveen"); // i/p perameter so used set
		stmt1.registerOutParameter(2, Types.INTEGER);
		stmt1.executeUpdate();
		int data = stmt1.getInt(2);
		System.out.println(data);

	}

}
