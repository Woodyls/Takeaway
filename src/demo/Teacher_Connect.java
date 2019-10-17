package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Teacher_Connect {
	private JDBC_Connect tch_Connect = null;
	private Teacher tch = null;

	public Teacher_Connect(Teacher teacher) {
		tch = teacher;
		tch_Connect = new JDBC_Connect();
	}

	//单线程锁定连接
	public synchronized void Connect() {
		try {
			//调用连接
			Connection conn = tch_Connect.getConnection(tch);
			System.out.println("数据库连接成功");
			//连接完成后关闭连接
			conn.close();
			System.out.println("数据库连接关闭");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
