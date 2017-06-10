package com.fannie;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CreditScoreClient {
	public static void main(String[] args) throws MalformedURLException {
		URL url= new URL("http://127.0.0.1:9876/fannie?WSDL");
		
		QName qname = new QName("http://fannie.com/", "CreditScoreCheckService");
		
		Service service = Service.create(url, qname);
		
		ICreditScoreCheck csc = service.getPort(ICreditScoreCheck.class);
		
		
		System.out.println(csc.checkCreditScore("Harry", 343));
		System.out.println("Eligibility for 400 : " + csc.checkEligible(400));
		System.out.println(csc.sayHi("Harry"));
		
	}
}
