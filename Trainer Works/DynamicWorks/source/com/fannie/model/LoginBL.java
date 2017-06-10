package com.fannie.model;

import com.fannie.beans.LoginBean;

public class LoginBL {
	public boolean validateLogin(LoginBean lb){
		// this shall be connected to JDBC 
		if(lb.getuName().equals("fannie") && lb.getPassword().equals("hello")){
			return true;
		}else {
			return false;
		}
	}
}
