package com.sql.connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

import com.character.Student;
import com.dom.component.Get_Component;
import com.sql.inquire.Inquire_User;

public class Connect_Pool_Stu {

	// 创建一个集合用于模拟连接池
	private static LinkedList<Connection> pool_stu = new LinkedList<Connection>();
	static {
		try {
			// 初始化驱动类
			Class.forName(ConnectInformation.get_DRIVER());
			// 创建10个连接对象
			for (int i = 0; i < DB_Base_Connect_Param.get_Max_Connection_Student(); i++) {
				Connection conn = DriverManager.getConnection(ConnectInformation.get_URL(),
						DB_Base_Connect_Param.get_Student_ID(), DB_Base_Connect_Param.get_Student_PW());
				pool_stu.add(conn);
			}
			System.out.println("初始化连接");
			// 打印所创建的连接对象
			Get_Component component = new Get_Component();
			component.Print_Pool_List(get_pool_list());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 取出一个连接
	public synchronized static Connection getConnection(Student stu, Get_Component component) {

		Connection connect = null;
		// 从队列中移出一个连接对象，返回给调用者
		if (pool_stu.size() > 0) {
			// 防止为0的时候，导致异常，所以要进行判断
			if (Inquire_User.inquire_person(stu, pool_stu.get(0), component)) {
				connect = pool_stu.remove();
				System.out.println("登陆成功");
			} else {
				System.out.println("查无此人");
			}
			return connect;
		} else {
			// 如果连接池中没有连接对象时返回一个提示
			throw new RuntimeException("对不起，服务器忙！");
		}
	}

	// 获取连接池
	public static LinkedList<Connection> get_pool_list() {
		return pool_stu;
	}
}
