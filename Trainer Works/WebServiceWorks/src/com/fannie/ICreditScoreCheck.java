package com.fannie;

import java.lang.annotation.Target;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(portName="ICreditScoreCheckTest")
@SOAPBinding(style=Style.RPC)
public interface ICreditScoreCheck {
	@WebMethod
	public String sayHi(@WebParam(name="userName")  String name);

	@WebMethod
	public String checkCreditScore(@WebParam(name="userName")String name,
			@WebParam(name="creditScore")int score);
	
	@WebMethod
	public boolean checkEligible(int score);
}
