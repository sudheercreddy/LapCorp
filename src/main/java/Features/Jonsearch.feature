Feature: search the job in Lapcorp 


Scenario: Verify user is able to do job serach for Auromation tester 

	Given Browser to "https://www.labcorp.com/" 
	Then Find and click Careers link 
	Then Search for "QA Test Automation Developer"
	Then click on the search button 
