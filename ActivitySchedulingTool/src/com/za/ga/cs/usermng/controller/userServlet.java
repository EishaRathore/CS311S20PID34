package com.za.ga.cs.usermng.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.za.ga.cs.usermng.dao.userDao;
import com.za.ga.cs.usermng.model.user;

/**
 * Servlet implementation class userServlet
 */
@WebServlet("/SignUp.jsp")
public class userServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private userDao userdao= new userDao();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB_INF/SignUp.html");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String role=request.getParameter("role");
		String firstname=request.getParameter("FirstName");
		String lname=request.getParameter("lastName");
		String Email=request.getParameter("email");
		String password=request.getParameter("pass");
		String cpassword=request.getParameter("pass");
		String mblnumber=request.getParameter("mblno");
		user user = new user();
		user.setRole(role);
		user.setFirst(firstname);
		user.setLast(lname);
		user.setEmail(Email);
		user.setPassword(password);
		user.setCpassword(cpassword);
		user.setMblnumber(mblnumber);
		PrintWriter out=response.getWriter();
		try {
			userdao.registerUser(user); 
			out.println("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>");
			out.println("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/limonte-sweetalert2/6.11.4/sweetalert2.all.js\"></script>");
			out.println("<script>");
			out.println("$(document).ready(function(){");
			out.println("swal('WELCOME','Successfull !'','success');");
			out.println("});");
			out.println("</script>");
		} catch (ClassNotFoundException e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB_INF/Login.html");
		dispatcher.forward(request, response);
	}

}
