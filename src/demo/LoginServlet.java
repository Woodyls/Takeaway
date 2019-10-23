package demo;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {
	ServletContext context;

	public void init() {
		context = getServletContext();
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String sname = request.getParameter("username");
		String snumber = request.getParameter("password");
		//Student stud = new Student(sname, snumber);
		
		//System.out.println(stud.getName()+"  "+stud.getPassword());
		//连接数据库
		Student student = new Student("root","123456");
		Student_Connect test = new Student_Connect(student);
		test.Connect();
		//
		request.getRequestDispatcher("student.jsp").forward(request, response);
	}
}
