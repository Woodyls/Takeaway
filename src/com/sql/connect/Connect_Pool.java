package com.sql.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

import com.character.Person;
import com.sql.inquire.Inquire_User;
import com.sql.inquire.Print_List;

public class Connect_Pool {

	// 创建一个集合用于模拟连接池
	private static LinkedList<Connection> pool = new LinkedList<Connection>();
	static {
		try {
			// 初始化驱动类
			Class.forName(ConnectInformation.get_JDBC_DRIVER());
			// DriverManager.registerDriver(new Driver());
			// 创建10个连接对象
			for (int i = 0; i < 3; i++) {
				Connection conn = DriverManager.getConnection(ConnectInformation.get_DB_URL(),
						DB_Base_Connect_Param.get_user(), DB_Base_Connect_Param.get_password());
				pool.add(conn);
			}
			System.out.println("初始化连接");
			// 打印所创建的连接对象
			Print_List.print_conn_pool();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 取出一个连接
	public synchronized static Connection getConnection(Person person) {

		Connection connect = null;
		// System.out.println("取之前的连接如下");
		// Print_List.print_conn_pool();
		// 从队列中移出一个连接对象，返回给调用者
		if (pool.size() > 0) {

			// 防止为0的时候，导致异常，所以要进行判断
			if (Inquire_User.inquire(person, pool.get(0))) {
				connect = pool.remove();
			} else {
				System.out.println("查无此人");
			}
			// 判断连接是否存在
			System.out.println("取出一个连接之后");
			Print_List.print_conn_pool();

			return connect;
		} else {
			// 如果连接池中没有连接对象时返回一个提示
			throw new RuntimeException("对不起，服务器忙！");
		}
	}

	// 获取连接池
	public static LinkedList<Connection> get_pool_list() {
		return pool;
	}
}
