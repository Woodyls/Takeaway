package com.sql.connect;

import java.sql.Connection;

import com.character.Student;
import com.dom.component.Get_Component;

public class Student_Connect {
	private Student stu = null;
	private Connection conn = null;

	public Student_Connect(Student stu) {
		this.stu = stu;
	}

	// 获取连接
	public Connection get_conn() {
		return conn;
	}

	// 单线程
	public void Connect() {
		// 调用连接
		Get_Component component = new Get_Component();
		Connection conn = Connect_Pool_Stu.getConnection(stu, component);
		System.out.println("学生数据库连接成功");
	}

	public void disconnect(Get_Component component) {
		component.Link_Release(conn, stu);
	}

}
