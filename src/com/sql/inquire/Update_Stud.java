package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Update_Stud extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String StuID = request.getParameter("StuID");
		String Username = request.getParameter("Username");
		String Classgrade = request.getParameter("Classgrade");
		StuID = "'" + StuID + "'";
		Username = "'" + Username + "'";
		Classgrade = "'" + Classgrade + "'";
		System.out.println(StuID + " " + Username + " " + Classgrade);

		String sql = "UPDATE student " + "SET Sname =" + Username + ",class =" + Classgrade + " WHERE Sno =" + StuID
				+ ";";
		String sql2 = "SELECT * FROM Student where Sno=" + StuID + ";";
		// System.out.println(sql + sql2);

		LinkedList<String> Stu_List = null;
		try {
			Inquire_Update_Stu.inquire(sql, sql2);
			Stu_List = Inquire_Update_Stu.inquire(sql, sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("Stu_List", Stu_List);
		RequestDispatcher view = request.getRequestDispatcher("Update_Stu.jsp");
		view.forward(request, response);
	}
}
