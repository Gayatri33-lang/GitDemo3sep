// Using statement :- compile evrytime 

// but using prepared statement queries compile only 1 time eg : for loop  if 

// if u ant to inert bulk data dynamically use prepared statement instaed of statement

package com.JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class PreparedStatementExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con2 = JDBCUtil.JDBC("ShreeGanesha");
		String sql2 = "Insert into tbl_person values (?,?,?,?,?,?)";  // This Query will be compiles 
		PreparedStatement stmt = con2.prepareStatement(sql2);
		stmt.setInt(1,13);
		stmt.setString(2,"goldy");
		stmt.setString(3,"m");
		stmt.setInt(4,5);
		stmt.setInt(5, 40);
		long millis=System.currentTimeMillis();
		Date d = new Date(millis);
		stmt.setDate(6,d );
		int i3 =stmt.executeUpdate();
		System.out.println("Rows inserted " + i3);
		
		// This below set of data will be inserted but second time query will not be compiled 
		// This is major diff b/w statement & prepared statement so prepared statement is better fr performance point of view 
		
		stmt.setInt(1,1);
		stmt.setString(2,"naveen");
		stmt.setString(3,"n@gmail.com");
		stmt.setInt(4,5);
		stmt.setInt(5, 30);
		//long millis=System.currentTimeMillis();
		//Date d = new Date(millis); // check Time epoch time 
		stmt.setDate(6,d );
		int i4 =stmt.executeUpdate();
		System.out.println("Rows inserted " + i4);
		
		Statement stmt3 = con2.createStatement();
		ResultSet rs1 = stmt3.executeQuery("Select *  from tbl_person");
		ResultSetMetaData rms1 = rs1.getMetaData();
		//System.out.println("ID  Name  Email Gender Age DateofBirth" );
		int i1 =rms1.getColumnCount(); 
		for ( int i5 = 1; i5 <= i1 ; i5= i5+1) {
			System.out.print(rms1.getColumnName(i5) + "		");
		}
			System.out.println();
		while (rs1.next()) {
		
			for ( int i2 = 1 ; i2<= i1 ; i2 = i2+1) {
//				System.out.println(rms1.getColumnType(i2));
				if (rms1.getColumnType(i2) == 4) {
					System.out.print(rs1.getInt(i2) + "		");
				}
				else if (rms1.getColumnType(i2)== 12) {
					System.out.print(rs1.getString(i2).trim() + "		");
				}
				else if (rms1.getColumnType(i2) == 93 ) {
					System.out.println(rs1.getDate(i2));
				}
				else {
					System.out.print("error");
				}
			}
		//	rms1.getColumnName(1);
		//	rms1.getColumnType(1);
			// 4- int , 12-string , 93- datetime 
			
		}
		
	}

}
