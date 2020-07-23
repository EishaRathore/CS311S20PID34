package com.za.ga.cs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPageProcess
 */
@WebServlet("/LoginPageProcess")
public class LoginPageProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		
		System.out.println("user Name is "+name);
		System.out.println("user Name is "+pass);
		
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("pass", pass);
		
		response.sendRedirect("html/Login.html");
	}

}
