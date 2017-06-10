package com.fannie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fannie.model.LoginBL;
import com.fannie.service.LoginService;

/**
 * Servlet implementation class LoginValidate1
 */
@WebServlet("/LoginValidate1")
public class LoginValidate1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String uri; 
		if(new LoginBL().validateLogin(LoginService.getLoginBean(request))){
			uri="Success.jsp";
		}else{
			uri = "Error.jsp";
		}
		
		request.getRequestDispatcher("/WEB-INF/views/" + uri).forward(request, response);
	}

}














