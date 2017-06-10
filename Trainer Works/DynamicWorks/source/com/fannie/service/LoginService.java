package com.fannie.service;

import javax.servlet.http.HttpServletRequest;

import com.fannie.beans.LoginBean;

public class LoginService {
	public static LoginBean getLoginBean(HttpServletRequest request){
		LoginBean lb = new LoginBean();
		lb.setuName(request.getParameter("uname"));
		lb.setPassword(request.getParameter("pwd"));
		
		return lb;
	}
}
