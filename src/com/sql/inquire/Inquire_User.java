package com.sql.inquire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.character.Person;

public class Inquire_User {

	// 查询模块
	public static boolean inquire(Person person, Connection conn) {

		// Statement执行数据库语句操作
		java.sql.Statement stmt = null;
		// 数据库结果返回对象
		ResultSet rs = null;
		// 实例化查询
		stmt = Inquire_Statement.get_Statement(conn);
		// 查询结果
		rs = Inquire_Result.get_Inquire_Result(Inquire_Command.SELECT_STUDENT(), stmt);
		// 对查询结果进行分析
		try {
			while (rs.next()) {
				// 通过字段检索
				String name = rs.getString("name");
				String password = rs.getString("password");
				// 输出数据// System.out.print("ID: " + id);// System.out.print("学生姓名: " + name);//
				// System.out.print(",学生密码: " + password);// System.out.print("\n");
				if (name.equals(person.getName()) && password.equals(person.getPassword())) {
					return true;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 关闭查询结果
		Inquire_Close.close(stmt, rs);
		return false;
	}
}
