package com.sql.inquire;

import java.sql.Connection;
import java.util.LinkedList;

import com.sql.connect.Connect_Pool;

public class Print_List {
	public static void print_conn_pool() {
		int i = 0;
		LinkedList<Connection> pool = Connect_Pool.get_pool_list();
		// 循环输出连接池中的对象
		for (Connection conn : pool) {
			System.out.println(conn + "..." + i++);
		}
	}

}
