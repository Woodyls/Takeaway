package com.sql.connect;

import java.sql.Connection;

public class Connect_Release {

	// 将连接返回连接池
	public static void release(Connection conn) {
		Connect_Pool.get_pool_list().addLast(conn);
	}
}
