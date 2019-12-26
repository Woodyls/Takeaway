package com.sql.connect;

import java.sql.Connection;

import com.character.Teacher;
import com.dom.component.Get_Component;

public class Teacher_Connect {
	private Teacher tch = null;
	private Connection conn = null;

	public Teacher_Connect(Teacher tch) {

		this.tch = tch;
		// TODO Auto-generated constructor stub
	}

	public Connection get_conn() {
		return conn;
	}

	// 单线程锁定
	public void Connect() {
		// 调用连接
		Get_Component component = new Get_Component();
		this.conn = Connect_Pool_Tch.getConnection(tch, component);
		System.out.println("数据库连接成功");
	}

	public void disconnect(Get_Component component) {
		component.Link_Release(conn, tch);
	}

}
