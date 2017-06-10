@Smoke
Feature: To sanction Loan for the customer


Background: 
# all backgrounds are pre conditions 
	Given load chrome browser 

# this is my comment 

Scenario Outline: To issue the loan for the customer who is full time govt emp
	Given Employee has a "creditvalue" score 
	| creditvalue|
	| 100 |
	| 200 |
	| 300 |
	And according to bank standard
	# we say full, part, contractor, consultant with timed variable 
	When Customer has "<timed>" time work
	# it shall be like govt, private or semigovt with officetype variable  
	And in "<officetype>" office
	Then Sanction loan 
	# number of years to repay 
	But should repay within "<noofyears>" years   


Examples: 
|		timed		|		officetype			|		noofyears			|
|		full		|   govt						|      25					| 
|		full		|   private					|      22					| 
|		part		|   govt						|      14					| 
|		part		|   private					|      7					| 
	