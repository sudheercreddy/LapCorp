$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/schittireddy/eclipse-workspace/LabCorp/src/main/java/Features/LabcorpCodingRound.feature");
formatter.feature({
  "name": "search the job in Labcorp",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@labcorp"
    }
  ]
});
formatter.scenario({
  "name": "End to end scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@labcorp"
    }
  ]
});
formatter.step({
  "name": "User is on Labcorp Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "LabcorpCodingRound.user_is_on_Labcorp_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Careers Link",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.user_selects_Careers_Link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User searches for \"QA Test Automation Developer\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.user_searches_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens job with title \"Senior QA Test Automation Developer / Engineer\"",
  "keyword": "When "
});
formatter.match({
  "location": "LabcorpCodingRound.user_opens_job_with_title(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job title should be \"Senior QA Test Automation Developer / Engineer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LabcorpCodingRound.job_title_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job Location should be \"Durham, North Carolina\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.job_Location_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job Id should be \"20-85412\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.job_Id_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "first sences of the third paragraph should be \"The right candidate for this role will participate in the test automation technology development and best practice models.\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.first_sences_of_the_third_paragraph_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "second bullet point under Management Support shold be \"Prepare test plans, budgets, and schedules.\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.second_bullet_point_under_Management_Support_shold_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Third requirement should be \"5+ years of experience in QA automation development and scripting.\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.third_requirement_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify \"Selenium\" should be first suggested Automation tool",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.verify_should_be_first_suggested_Automation_tool(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User selects Apply Now",
  "keyword": "When "
});
formatter.match({
  "location": "LabcorpCodingRound.user_selects_Apply_Now()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job title in Confirmation Page should be \"Senior QA Test Automation Developer / Engineer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LabcorpCodingRound.job_title_in_Confirmation_Page_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Job Id in Confirmation Page should be \"20-85412\"",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.job_Id_in_Confirmation_Page_should_be(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User returns to Job Search",
  "keyword": "And "
});
formatter.match({
  "location": "LabcorpCodingRound.user_returns_to_Job_Search()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});