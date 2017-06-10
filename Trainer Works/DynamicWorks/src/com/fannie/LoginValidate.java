package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginValidate
 */
@WebServlet("/validate.do")
public class LoginValidate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String uName = request.getParameter("uname");
		String password = request.getParameter("pwd");
		
		// we are hard coding it, but should be connected to DB 
		if(uName.equals("fannie") && password.equals("hello")){
			request.getRequestDispatcher("Home").forward(request, response);
		}else{
			request.getRequestDispatcher("Error").include(request, response);
		
		}
	}

}
