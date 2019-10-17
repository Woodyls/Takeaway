package demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC_Connect {
	// MySQL 8.0 以上版本 - JDBC 驱动名及数据库 URL
	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    static final String DB_URL = "jdbc:mysql://localhost:3306/mysql?useUnicode=true&characterEncoding=utf-8&useSSL=true&serverTimezone=GMT";
    public JDBC_Connect() {
    	
    }
    
    //连接到数据库
	public synchronized Connection getConnection(Person person) throws SQLException {
		Connection conn = null;
		// 打开链接
		conn = DriverManager.getConnection(DB_URL,person.getName(),person.getPassword());
		//返回一个属于个人的连接
		return conn;		
	}
}
