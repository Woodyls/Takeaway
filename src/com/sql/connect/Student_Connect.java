package com.sql.connect;

import java.sql.Connection;

import com.character.Student;

public class Student_Connect {
	private Student stu = null;
	private Connection conn = null;

	// 对连接和学生进行实例化
	public Student_Connect(Student student) {
		stu = student;
	}

	// 单线程
	public synchronized void Connect() {
		// 调用连接
		Connection conn = Connect_Pool.getConnection(stu);
		System.out.println("学生数据库连接成功");
	}
}
