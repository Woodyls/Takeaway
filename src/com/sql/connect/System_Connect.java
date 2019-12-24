package com.sql.connect;

import java.sql.Connection;

import com.character.Systems;
import com.dom.component.Get_Component;

public class System_Connect {
	private Systems sys = null;
	private Connection conn = null;

	public System_Connect(Systems sys) {
		this.sys = sys;
		// TODO Auto-generated constructor stub
	}

	// 获取连接
	public Connection get_conn() {
		return conn;
	}

	// 单线程
	public void Connect() {
		// 调用连接
		Get_Component component = new Get_Component();
		Connection conn = Connect_Pool_Sys.getConnection(sys, component);
		System.out.println("系统管理员数据库连接成功");
	}

	public void disconnect(Get_Component component) {
		component.Link_Release(conn, sys);
	}

}
