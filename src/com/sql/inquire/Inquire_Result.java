package com.sql.inquire;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Inquire_Result {

	public static ResultSet get_Inquire_Result(String sql, java.sql.Statement stmt) {
		// 返回查询结果
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
}
