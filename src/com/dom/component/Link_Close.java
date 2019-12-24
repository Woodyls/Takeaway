package com.dom.component;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Link_Close {
	public static void close(java.sql.Statement stmt, ResultSet rs) {
		// 关闭查询结果
		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 关闭查询操作
		try {
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
