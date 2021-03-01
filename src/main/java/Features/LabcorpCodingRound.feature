@labcorp 
Feature: search the job in Labcorp 

#Background: pre scenario steps 
	#Given User is on Labcorp Home Page 
	
Scenario: End to end scenario 
	Given User is on Labcorp Home Page 
	And User selects Careers Link 
	And User searches for "QA Test Automation Developer" 
	When User opens job with title "Senior QA Test Automation Developer / Engineer" 
	Then Job title should be "Senior QA Test Automation Developer / Engineer" 
	And Job Location should be "Durham, North Carolina" 
	And Job Id should be "20-85412" 
	And first sences of the third paragraph should be "The right candidate for this role will participate in the test automation technology development and best practice models." 
	And second bullet point under Management Support shold be "Prepare test plans, budgets, and schedules." 
	And Third requirement should be "5+ years of experience in QA automation development and scripting." 
	And Verify "Selenium" should be first suggested Automation tool 
	When User selects Apply Now 
	Then Job title in Confirmation Page should be "Senior QA Test Automation Developer / Engineer"
	And Job Id in Confirmation Page should be "20-85412"  
	And User returns to Job Search 
	
	
	#	1.	Start the test by opening a browser to www.labcorp.com 
	#2.	Find and click Careers link
	#3.	Search for “QA Test Automation Developer” 
	#4.	Select and browse to the “Senior QA Test Automation Developer / Engineer” – Durham, North Carolina – (posted on) 12/10/2020 
	#5.	Confirm job title, job location, and job id (#20-85412) 
	#6.	Confirm first sentence of third paragraph under Description/Introduction as “The right candidate for this role will participate in the test automation technology development and best practice models.” 
	#7.	Confirm second bullet point under Management Support as “Prepare test plans, budgets, and schedules.” 
	#8.	Confirm third requirement as “5+ years of experience in QA automation development and scripting.” 
	#9.	Confirm first suggested automation tool to be familiar with contains “Selenium” 
	#10.	Click Apply Now and confirm points 5 and 6 in the proceeding page. 
	#11.	Click to Return to Job Search
