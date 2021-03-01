package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utils.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.JobResultsSection;
import pageObjects.LabcorpHomePage;
import pageObjects.LabcorpJobSearchPage;

public class LabcorpCodingRound {

	public static WebDriver driver;
	LabcorpJobSearchPage lsp = new LabcorpJobSearchPage();
	public LabcorpHomePage lhp;
	public JobResultsSection jrs = new JobResultsSection();
	
	//	private String SearchJob = "QA Test Automation Developer";
	//	private String jobTitle = "Senior QA Test Automation Developer / Engineer";

	@Given("User is on Labcorp Home Page")
	public void user_is_on_Labcorp_Home_Page() {
		driver = DriverManager.getDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.labcorp.com/");
		
	}

	@And("User selects Careers Link")
	public void user_selects_Careers_Link() throws InterruptedException {
		
		new LabcorpHomePage().clickLnkCareers();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@Given("User searches for {string}")
	public void user_searches_for(String SearchJob) throws InterruptedException {


		lsp.enterKeyword(SearchJob);
		lsp.clearLocation();
		lsp.clickSubmit();
	}
	@When("User opens job with title {string}")
	public void user_opens_job_with_title(String jobTitle) throws InterruptedException {
		lsp.selectJobTitle(jobTitle);
	}

	@Then("Job title should be {string}")
	public void job_title_should_be(String string) throws InterruptedException {

		jrs.searchHeader(string);
	}

	@Then("Job Location should be {string}")
	public void job_Location_should_be(String string) {
		jrs.searchLocation(string);
	}

	@Then("Job Id should be {string}")
	public void job_Id_should_be(String string) {
		jrs.searchJobID(string);
	}

	@Then("first sences of the third paragraph should be {string}")
	public void first_sences_of_the_third_paragraph_should_be(String string) {
		jrs.verifyThirdPara(string);
	}

	@Then("second bullet point under Management Support shold be {string}")
	public void second_bullet_point_under_Management_Support_shold_be(String string) {
		jrs.verifysecondBullet(string);
	}

	@Then("Third requirement should be {string}")
	public void third_requirement_should_be(String string) {
		jrs.verifythirdRequirement(string);
	}

	@Then("Verify {string} should be first suggested Automation tool")
	public void verify_should_be_first_suggested_Automation_tool(String string) {
		jrs.verifyAutomationTool(string);
	}

	@When("User selects Apply Now")
	public void user_selects_Apply_Now() {
		jrs.clickApplyNow();
	}


	@Then("Job title in Confirmation Page should be {string}")
	public void job_title_in_Confirmation_Page_should_be(String string) {
		jrs.verifyHeader(string);
	}

	@Then("Job Id in Confirmation Page should be {string}")
	public void job_Id_in_Confirmation_Page_should_be(String string) {
		jrs.verifyJobID(string);


	}
	@When("User returns to Job Search")
	public void user_returns_to_Job_Search() {
		jrs.clickReturntoJobSearch();
	}


	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}

	
}
