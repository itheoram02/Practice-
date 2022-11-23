@outline
Feature: validate Techfios Add account functionality by scenario outline

Background: 
	Given User will open browser 
	
Scenario Outline: 1 user will be able to login with the valid Credentials 
	//When User land on the techfios login page    
	When user enter "<username>" and "<password>" 
 
 
	And users clicks signin button 
	Then user will lands on Dashboard page 
	
	When user will be able to click on bank and cash button 
	When user will be able to click on add account button 
	
	When user will enter"<account_title>" , "<enter_description>", "<initial_balance>", "<account_number>", "<contact_person>", "<phone>", "<internet_banking>"    
	When user will click on submit button 
	And takeScreenshotAtEndOfTest(WebDriver driver) 
	Then user will close the browser 
	
	Examples: 
		|username         |   password | account title|                  description                   |initial balance|account number |contact person|  phone   |internet banking     |
		|demo@techfios.com|    abc123  |Saving account|you have to keep $500 every statement month     |       $500    |saving123456790|Techfios.inc  |0987654321|url.techfios.internet|