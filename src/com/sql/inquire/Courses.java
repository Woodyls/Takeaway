package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Courses extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String SemsterCourse = request.getParameter("SemsterCourse");
		SemsterCourse = "'" + SemsterCourse + "'";
		System.out.println(SemsterCourse);

		String sql = "SELECT * FROM score where Cosno=" + SemsterCourse;
		System.out.println(sql);

		LinkedList<String> Stu_List = null;
		try {
			Stu_List = Inquire_Course.inquire(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("Stu_List", Stu_List);
		RequestDispatcher view = request.getRequestDispatcher("courses.jsp");
		view.forward(request, response);
	}
}
