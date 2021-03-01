package Utils;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	static WebDriver driver;

	public static WebDriver getDriver() {

	System.setProperty("webdriver.chrome.driver", 
			System.getProperty("user.dir")+"/chromedriver/chromedriver.exe");
	
		if (driver == null) {
			driver = new ChromeDriver();
			driver.manage().window().maximize();

		}

		return driver;

	}
}
