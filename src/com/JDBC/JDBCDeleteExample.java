package com.JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCDeleteExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = JDBCUtil.JDBC("ShreeGanesha");
		Statement stmt = con.createStatement();
		String sql = "Delete from tbl_person where id = 1";
		int i =stmt.executeUpdate(sql);
		System.out.println("no of rows deleted "  + i);
		ResultSet rs1 = stmt.executeQuery("Select *  from tbl_person");
		ResultSetMetaData rms1 = rs1.getMetaData();
		//System.out.println("ID  Name  Email Gender Age DateofBirth" );
		int i1 =rms1.getColumnCount(); 
		for ( int i3 = 1; i3 <= i1 ; i3= i3+1) {
			System.out.print(rms1.getColumnName(i3) + "		");
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
