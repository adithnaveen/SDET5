package com.fannie;

import javax.jws.WebService;

@WebService(endpointInterface="com.fannie.ICreditScoreCheck")
public class CreditScoreCheck implements ICreditScoreCheck {

	@Override
	public String sayHi(String name) {
		return "Hi " + name +" this is for testing";
	}

	@Override
	public String checkCreditScore(String name, int score) {
		if(score < 400){
			return "Sorry loan procession not done Mr/Ms/Mrs : " + name; 
		}else if(score >=400 && score < 600){
			return "Your processing shall take some time now please wait  Mr/Ms/Mrs : " + name;
		}else {
			return "Congrats loan procession in progress  Mr/Ms/Mrs :" + name;
		}
	}

	@Override
	public boolean checkEligible(int score) {
		return score>600;
	}

}
