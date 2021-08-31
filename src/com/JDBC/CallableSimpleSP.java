package com.JDBC;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class CallableSimpleSP {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con3 = JDBCUtil.JDBC("ShreeGanesha");
		CallableStatement cs = con3.prepareCall("{call Getproductdesc()}");
		cs.executeQuery();

	}

}
