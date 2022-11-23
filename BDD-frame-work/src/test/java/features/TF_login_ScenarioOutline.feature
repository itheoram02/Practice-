@loginPage 
Feature: validate Techfios login functionality 

Background: 
	Given User is opening browser 
	
@positiveTest 
Scenario Outline: 1 user should be able to login with the valid credentials 

	When User is on the techfios login page 
	When user enters "<username>" and "<password>" 
	And user click signin button 
	Then user will land on dashboard page 
	
	Then browser will closed automatically 
	
	
	Examples: 
	
		|username         |		password|
		|demo@techfios.com|		abc123  |