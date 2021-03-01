package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.DriverManager;

public class LabcorpJobSearchPage {

	// By careersPath = By.xpath("//a[text()='Careers']");

	By jobKeywordElement = By.xpath("//input[contains(@id,'search-keyword')]");
	
	By locationElement = By.xpath("//input[@placeholder='City, State, or Zip']");

	By submitElement = By.xpath("//button[contains(@id,'search-submit')]");

	 By jobTitles = By.xpath("//section[@id=\"search-results-list\"]//h2");
//	@FindBy(xpath = "")
//	private WebElement locationElement;

//	public LabcorpJobSearchPage() {
//		driver = DriverManager.getDriver();
//	}
	public WebDriver ldriver;

	public LabcorpJobSearchPage() {
		ldriver = DriverManager.getDriver();
	}

	public LabcorpJobSearchPage enterKeyword(String keyword) {

		ldriver.findElement(jobKeywordElement).sendKeys(keyword);
		return this;
	}

	public LabcorpJobSearchPage clearLocation() {
		ldriver.findElement(locationElement).clear();
		return this;
	}

	public LabcorpJobSearchPage clickSubmit() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(submitElement));
		ldriver.findElement(submitElement).click();
		Thread.sleep(5000);
		return this;
	}
	
	
	
	
	//By jobClick = By.xpath("(//section[@id=\\\"search-results-list"]//a)");
	
	public LabcorpJobSearchPage selectJobTitle(String title) throws InterruptedException {
		Thread.sleep(5000);
		List<WebElement> searchTitle = ldriver.findElements(jobTitles);
			for(WebElement s : searchTitle) {
			System.out.println(s.getText());
			if(s.getText().equalsIgnoreCase(title)) {
			
				((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", s);
				break;
				
			}
		}return null;
		
		}
	
}


