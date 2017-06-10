@Fannie
Feature: Login Feature 

Background: 
	Given this will execute for all the scenarios 
Scenario:
	Given username and password 
	# there shall be values which can be passed 
	|login  | pwd |  roles | 
	|larry  | larrypwd| manger   |
	|harry  | harrypwd| teamleader |
	|peter  | peterpwd| developer   |
	When login successful 
	Then show inbox  
	
	
@AfterSuccessLogin 
Scenario: 
	When user logs in successfully 
	