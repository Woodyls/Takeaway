package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Id extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");

		String StuID = request.getParameter("username");
		StuID = "'" + StuID + "'";
		System.out.println(StuID);

		String sql = "SELECT * FROM Student where Sno=" + StuID;
		System.out.println(sql);

		LinkedList<String> Stu_Id_List = null;
		try {
			Stu_Id_List = Inquire_ID.inquire(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		request.setAttribute("Stu_Id_List", Stu_Id_List);
		RequestDispatcher view = request.getRequestDispatcher("inquire_id.jsp");
		view.forward(request, response);
	}
}
