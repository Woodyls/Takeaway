package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Student_Connect {
	private JDBC_Connect stu_Connect = null;
	private Student stu = null;

	//对连接和学生进行实例化
	public Student_Connect(Student student) {
		stu = student;
		stu_Connect = new JDBC_Connect();
	}

	//单线程锁定连接
	public synchronized void Connect() {
		try {
			//调用连接
			Connection conn = stu_Connect.getConnection(stu);
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
