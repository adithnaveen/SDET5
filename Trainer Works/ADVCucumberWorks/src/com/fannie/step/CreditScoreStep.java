package com.fannie.step;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.But;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreditScoreStep {
	// step defn to go here
	
	
	// this method is called hook method and shall be called 
	/// for all features   
	@Before
	public void conn_to_db(){
		System.out.println("======== connecting to DB =============");
	}

	@Given("^load chrome browser$")
	public void load_chrome_browser() throws Throwable {
		System.out.println(":::::::::::: Chrome Browser Loading:::::::::::");
	}

	@Given("Employee has a credit score")
	public void employee_has_a_credit_score() {
		System.out.println("Employee has a credit score>>>>>>");
	}

	@And("according to bank standard")
	public void according_to_bank_standard() {
		System.out.println("according to bank standard>>>>>>>>>>>");
	}

	// this method shall be genernic method
	// which will take one work anything
	@When("^Customer has \"([a-zA-Z]{1,})\" time work$")
	public void customer_has_full_time_work(String workTime) {
		System.out.println("Customer has -" + workTime + "- time work >>>>>>>>>>>");
	}

	@And("^in \"([a-zA-Z]{1,})\" office$")
	public void in_gove_office(String officetype) {
		System.out.println("in " + officetype + " office >>>>>>>>>>>>");
	}

	@Then("Sanction loan")
	public void sanction_loan() {
		System.out.println("Sanction loan >>>>>>>>>");
	}

	@But("should repay within (\"[0-9]{1,}\") years")
	public void should_repay_within_5_years(String noOfYears) {
		System.out.println("should repay within " + noOfYears + " years>>>>>>>");
	}

}
