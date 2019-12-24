package com.dom.component;

import java.sql.Connection;

import com.character.Student;
import com.character.Systems;
import com.character.Teacher;
import com.sql.connect.Connect_Pool_Stu;
import com.sql.connect.Connect_Pool_Sys;
import com.sql.connect.Connect_Pool_Tch;

public class Link_Release {

	// 将连接返回连接池
	public static void release(Connection conn, Student stu) {
		Connect_Pool_Stu.get_pool_list().addLast(conn);

	}

	public static void release(Connection conn, Teacher tch) {
		Connect_Pool_Tch.get_pool_list().addLast(conn);
	}

	public static void release(Connection conn, Systems sys) {
		Connect_Pool_Sys.get_pool_list().addLast(conn);
	}
}
