package com.dom.component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import com.character.Student;
import com.character.Systems;
import com.character.Teacher;

public class Get_Component {

	public static ResultSet Get_Result(String sql, java.sql.Statement stmt) {
		return Get_Result.get_Result(sql, stmt);
	}

	public static Statement Get_Statement(Connection conn) {
		return Get_Statement.get_Statement(conn);
	}

	public static void Link_Close(java.sql.Statement stmt, ResultSet rs) {
		Link_Close.close(stmt, rs);
	}

	public static void Print_Pool_List(LinkedList<Connection> pool) {
		Print_Pool_List.print_conn_pool(pool);
	}

	public static void Link_Release(Connection conn, Teacher tch) {
		Link_Release.release(conn, tch);
	}

	public static void Link_Release(Connection conn, Systems sys) {
		Link_Release.release(conn, sys);
	}

	public static void Link_Release(Connection conn, Student sys) {
		Link_Release.release(conn, sys);
	}

}
