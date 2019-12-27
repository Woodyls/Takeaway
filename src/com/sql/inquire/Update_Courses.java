package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update_Courses extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String CourseID = request.getParameter("CourseID");
		String CourseName = request.getParameter("CourseName");

		CourseID = "'" + CourseID + "'";
		CourseName = "'" + CourseName + "'";

		System.out.println(CourseID + " " + CourseName);

		String sql = "UPDATE Course " + "SET Coname =" + CourseName + " WHERE Cosno =" + CourseID + ";";
		String sql2 = "SELECT * FROM Course where Cosno=" + CourseID + ";";
		// System.out.println(sql + sql2);

		LinkedList<String> Stu_List = null;
		try {
			Update_Course.inquire(sql, sql2);
			Stu_List = Update_Course.inquire(sql, sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("Stu_List", Stu_List);
		RequestDispatcher view = request.getRequestDispatcher("Update_Course.jsp");
		view.forward(request, response);
	}
}
