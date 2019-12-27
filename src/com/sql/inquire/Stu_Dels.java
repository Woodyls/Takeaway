package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Stu_Dels extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String StuID = request.getParameter("StuID");
		StuID = "'" + StuID + "'";
		System.out.println(StuID);

		String sql = "DELETE FROM Student WHERE Sno=" + StuID + ";";
		System.out.println(sql);

		LinkedList<String> Stu_List = null;
		try {
			Stu_List = Stu_Del.inquire(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("Stu_List", Stu_List);
		RequestDispatcher view = request.getRequestDispatcher("Stu_Del.jsp");
		view.forward(request, response);
	}
}
