package com.sql.inquire;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

import com.dom.component.Get_Component;
import com.sql.connect.ConnectInformation;
import com.sql.connect.DB_Base_Connect_Param;

public class Stu_Del {
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
		stmt.executeUpdate(sql);
		// 关闭查询结果
		// component.Link_Close(stmt, null);

		return Stu_List;
	}
}
