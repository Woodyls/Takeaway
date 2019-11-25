package com.sql.inquire;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Inquire_Statement {
	public static Statement get_Statement(Connection conn) {
		// 返回Statement执行数据库语句操作对象
		java.sql.Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
	}
}
