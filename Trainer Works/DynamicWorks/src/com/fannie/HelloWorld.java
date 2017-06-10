package com.fannie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {

		System.out.println(">>>>>>>>INIT>>>>>>>>>>>>>");
	}

	public void destroy() {
		System.out.println("<<<<<<<<<DESTORY<<<<<<<<<<<<<");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// response type as text render as html 
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<body>");
		out.print("<h2>Welcome to Servlets </h2>");
		out.println("</body>");
		out.println("</html>");
	
		out.close();
	}

}
