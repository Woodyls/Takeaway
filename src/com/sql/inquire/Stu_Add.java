package com.sql.inquire;

import java.io.IOException;
import java.sql.SQLException;
import java.util.LinkedList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Stu_Add extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("UTF-8");
		String StuID = request.getParameter("StuID");
		String Username = request.getParameter("StuName");
		String Classgrade = request.getParameter("StuClass");
		StuID = "'" + StuID + "'";
		Username = "'" + Username + "'";
		Classgrade = "'" + Classgrade + "'";
		System.out.println(StuID + " " + Username + " " + Classgrade);
		String sql = "INSERT INTO student" + " (Sno,Sname ,Class)" + "VALUES" + "(" + StuID + "," + Username + ","
				+ Classgrade + ");";

		String sql2 = "SELECT * FROM Student where Sno=" + StuID + ";";
		System.out.println(sql + sql2);

		LinkedList<String> Stu_List = null;
		try {
			Stu_List = Stu_AddInfo.inquire(sql, sql2);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("Stu_List", Stu_List);
		RequestDispatcher view = request.getRequestDispatcher("Stu_Add.jsp");
		view.forward(request, response);
	}
}
