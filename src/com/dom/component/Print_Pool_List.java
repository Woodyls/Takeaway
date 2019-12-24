package com.dom.component;

import java.sql.Connection;
import java.util.LinkedList;

public class Print_Pool_List {
	public static void print_conn_pool(LinkedList<Connection> pool) {
		int i = 0;
		// LinkedList<Connection> pool = Connect_Pool.get_pool_list();
		// 循环输出连接池中的对象
		for (Connection conn : pool) {
			System.out.println(conn + "..." + i++);
		}
	}
}
