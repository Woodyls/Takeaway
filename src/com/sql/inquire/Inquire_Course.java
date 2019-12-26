package com.sql.inquire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

import com.dom.component.Get_Component;
import com.sql.connect.ConnectInformation;
import com.sql.connect.DB_Base_Connect_Param;

public class Inquire_Course {
	public static void Print_Result(String ID, String PW) {
		// 输出数据
		System.out.print("ID: " + ID);
		System.out.print(",PW: " + PW);
		System.out.print("\n");
	}

	public static LinkedList<String> inquire(String sql) throws SQLException {

		LinkedList<String> Stu_List = new LinkedList<String>();

		Get_Component component = new Get_Component();
		Connection conn = DriverManager.getConnection(ConnectInformation.get_URL(),
				DB_Base_Connect_Param.get_Student_ID(), DB_Base_Connect_Param.get_Student_PW());
		// 实例化查询
		java.sql.Statement stmt = component.Get_Statement(conn);
		// 查询结果
		ResultSet rs = component.Get_Result(sql, stmt);

		// 对查询结果进行分析
		try {
			while (rs.next()) {
				// 通过字段检索
				String Sno = rs.getString("Sno");
				String Cosno = rs.getString("Cosno");
				String Score = rs.getString("Score");

				String str = "学生ID:" + Sno + " 课程编号:" + Cosno + " 成绩:" + Score;
				Stu_List.add(str);
				// Stu_List.add("ID:" + Link_ID + " Sname:" + Link_Sname);
				Print_Result(Cosno, Score);
				// Print_Result(person.getID(), person.getPW());

			}
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		// 关闭查询结果
		component.Link_Close(stmt, rs);

		// String[] List = { "11111", "11111", "11111" };
		return Stu_List;
	}
}
