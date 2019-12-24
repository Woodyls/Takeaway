package com.sql.inquire;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.character.Person;
import com.character.Student;
import com.character.Systems;
import com.character.Teacher;
import com.dom.component.Get_Component;

public class Inquire_User {
	// 查询模块
	public static boolean inquire_person(Student stu, Connection conn, Get_Component component) {
		String sql_stu = Inquire_Command.Select_Student();
		return inquire(stu, conn, component, sql_stu, Table_Att_Par.Student_ID(), Table_Att_Par.Student_PW());
	}

	public static boolean inquire_person(Teacher tch, Connection conn, Get_Component component) {
		String sql_tch = Inquire_Command.Select_Teacher();
		String ID = "Tno";
		String PW = "Tpw";
		return inquire(tch, conn, component, sql_tch, Table_Att_Par.Teacher_ID(), Table_Att_Par.Teacher_PW());
	}

	public static boolean inquire_person(Systems sys, Connection conn, Get_Component component) {
		String sql_sys = Inquire_Command.SELECT_System();
		String ID = "Syno";
		String PW = "Sypw";
		return inquire(sys, conn, component, sql_sys, Table_Att_Par.System_ID(), Table_Att_Par.System_PW());
	}

	public static void Print_Result(String ID, String PW) {
		// 输出数据
		System.out.print("ID: " + ID);
		System.out.print(",PW: " + PW);
		System.out.print("\n");
	}

	public static boolean inquire(Person person, Connection conn, Get_Component component, String sql, String ID,
			String PW) {
		// 实例化查询
		java.sql.Statement stmt = component.Get_Statement(conn);
		// 查询结果
		ResultSet rs = component.Get_Result(sql, stmt);

		// 对查询结果进行分析
		try {
			while (rs.next()) {
				// 通过字段检索
				String Link_ID = rs.getString(ID);
				String Link_PW = rs.getString(PW);
				// Print_Result(ID, PW);
				// Print_Result(person.getID(), person.getPW());
				if (Link_ID.equals(person.getID()) && Link_PW.equals(person.getPW())) {
					return true;
				}
			}
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
		// 关闭查询结果
		component.Link_Close(stmt, rs);
		return false;
	}
}
