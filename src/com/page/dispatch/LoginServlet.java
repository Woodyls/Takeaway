package com.page.dispatch;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.character.Student;
import com.sql.connect.Student_Connect;

public class LoginServlet extends HttpServlet {
	ServletContext context;

	public void init() {
		context = getServletContext();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String ID = request.getParameter("username");
		String PW = request.getParameter("password");
		System.out.println(ID + "    " + PW);
		// 连接数据库
		Student student = new Student(ID, PW);
		Student_Connect conn = new Student_Connect(student);
		conn.Connect();
		System.out.println(conn.get_conn());
		//
		if (conn.get_conn() != null) {
			request.setAttribute("conn", conn);
			request.getRequestDispatcher("0mainpage.html").forward(request, response);
		}
	}
}
