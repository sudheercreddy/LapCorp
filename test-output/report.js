$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/schittireddy/eclipse-workspace/LabCorp/src/main/java/Features/Jonsearch.feature");
formatter.feature({
  "name": "search the job in Lapcorp",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify user is able to do job serach for Auromation tester",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Browser to \"https://www.labcorp.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SearchJob.browser_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Find and click Careers link",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchJob.find_and_click_Careers_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search for \"QA Test Automation Developer\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchJob.search_for(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "SearchJob.click_on_the_search_button()"
});
formatter.result({
  "status": "passed"
});
});