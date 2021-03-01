package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.DriverManager;

public class JobResultsSection {

	public WebDriver driver;
	
//	public JobResultsSection() {
//		driver = new ChromeDriver();
//	}
//	
	public WebDriver ldriver;

	public JobResultsSection() {
		ldriver = DriverManager.getDriver();
	}
	
	By jobKeywordHeader = By.xpath("//section[@data-selector-name=\"jobdetails\"]/h1");
	By jobKeywordLocation = By.xpath("//span[@class=\"job-location job-info\"]");
	By jobKeywordID = By.xpath("//span[@class=\"job-id job-info\"]");
	By thirdPara = By.xpath("(//div[@class=\"ats-description\"]//p/span)[3]");
	By secondBullet = By.xpath("//strong[text()=' Management Support']//ancestor::ol/following-sibling::ul[1]/li[2]");
	By thirdRequirement = By.xpath("//span[text()='Requirements']//ancestor::p/following-sibling::ul[1]/li[3]");
	By automationTool = By.xpath("//span[contains(text(),'Familiar with common test automation tools')]/ancestor::ul/following-sibling::ul[1]/li[1]");
	By applyNow = By.xpath("(//a[text()='Apply Now'])[last()]");
	
	By overlayClose = By.xpath("//button[@class=\"close closebutton ae-button\"]");
	By jobTitle = By.xpath("//span[@class=\"jobTitle job-detail-title\"]");
	By jobTitleID = By.xpath("//span[@class=\"jobnum\"]");
	By returnToJobSearch = By.xpath("//span[text()='Return to Job Search']");
	
	
	public JobResultsSection searchHeader(String Header) {

		String jobHeader = ldriver.findElement(jobKeywordHeader).getText();
		
		Assert.assertEquals(jobHeader, Header);
		return this;
	}
	
	public JobResultsSection searchLocation(String Location) {

		String jobLocation = ldriver.findElement(jobKeywordLocation).getText();
		
		Assert.assertTrue(jobLocation.contains(Location));
		return this;
	}

	public JobResultsSection searchJobID(String JobID) {

		String jobid = ldriver.findElement(jobKeywordID).getText();
		
		Assert.assertTrue(jobid.trim().contains(JobID));
		return this;
	}

	public JobResultsSection verifyThirdPara(String sentence) {

		String para = ldriver.findElement(thirdPara).getText();
		
		Assert.assertTrue(para.trim().contains(sentence));
		return this;
	}
	
	public JobResultsSection verifysecondBullet(String bulletpoints) {

		String para = ldriver.findElement(secondBullet).getText();
		
		Assert.assertTrue(para.trim().contains(bulletpoints));
		return this;
	}
	
	public JobResultsSection verifythirdRequirement(String requirement) {

		String para = ldriver.findElement(thirdRequirement).getText();
		
		Assert.assertTrue(para.trim().contains(requirement));
		return this;
	}
	
	public JobResultsSection verifyAutomationTool(String tool) {

		String para = ldriver.findElement(automationTool).getText();
		
		Assert.assertTrue(para.trim().contains(tool));
		return this;
	}
	
	public JobResultsSection clickApplyNow() {
		ldriver.findElement(applyNow).click();
		WebDriverWait wait = new WebDriverWait(ldriver, 5000);

		wait.until(ExpectedConditions.visibilityOfElementLocated(overlayClose));
		ldriver.findElement(overlayClose).click();
		return this;
		
	}
	
	public JobResultsSection verifyHeader(String Header) {

		String str = ldriver.findElement(jobTitle).getText();
		
		Assert.assertTrue(str.trim().contains(Header));
		return this;
	} 
	
	public JobResultsSection verifyJobID(String TitleID) {

		String str = ldriver.findElement(jobTitleID).getText();
		
		Assert.assertTrue(str.trim().contains(TitleID));
		return this;
	} 
	
	public JobResultsSection clickReturntoJobSearch() {
		ldriver.findElement(returnToJobSearch).click();
		
		return this;
		
	}
	
}
