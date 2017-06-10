@Smoke
Feature: To sanction Loan for the customer

# this is my comment 

Scenario: To issue the loan for the customer who is full time govt emp
	Given Employee has a credit score 
	And according to bank standard 
	When Customer has full time work 
	And in govt office 
	Then Sanction loan 
	But should repay within 5 years   
	
	
Scenario: To issue the loan for the customer who is private time govt emp
	Given Employee has a credit score 
	And according to bank standard 
	When Customer has part time work 
	And in govt office 
	Then Sanction loan 
	But should repay within 5 years   
	
	
Scenario: To issue the loan for the customer who is full time private emp
	Given Employee has a credit score 
	And according to bank standard 
	When Customer has full time work 
	And in private office
	Then Sanction loan 
	But should repay within 5 years   
	
	