package pageObjects;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.LabcorpCodingRound;
import Utils.DriverManager;

public class LabcorpHomePage {

	public WebDriver ldriver;

	public LabcorpHomePage() {
		ldriver = DriverManager.getDriver();
	}
	

	By careersPath = By.xpath("//a[text()='Careers']");

	public LabcorpJobSearchPage clickLnkCareers() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(ldriver, 20);
	//	DriverManager.waitForElementVisible("//a[text()='Careers']");
		WebElement careersElement = ldriver.findElement(careersPath);
		wait.until(ExpectedConditions.elementToBeClickable(careersElement));
		((JavascriptExecutor) ldriver).executeScript("arguments[0].scrollIntoView(true);", careersElement);
		((JavascriptExecutor) ldriver).executeScript("arguments[0].click();", careersElement);
		switchTab();
		return new LabcorpJobSearchPage();
	}

	private void switchTab() {
		Set<String> allwindowsHandles = ldriver.getWindowHandles();

		for (String handle : allwindowsHandles) {
			if (!handle.contentEquals(ldriver.getWindowHandle())) {
				System.out.println(handle);
				ldriver.switchTo().window(handle);
			}
		}
	}

}
