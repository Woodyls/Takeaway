package com.sql.connect;

import java.sql.Connection;

import com.character.Teacher;

public class Teacher_Connect {
	private Teacher tch = null;
	private Connection conn = null;

	public Teacher_Connect(Teacher teacher) {
		tch = teacher;
	}

	// 单线程锁定
	public synchronized void Connect() {
		// 调用连接
		Connection conn = Connect_Pool.getConnection(tch);
		System.out.println("数据库连接成功");
	}
}
