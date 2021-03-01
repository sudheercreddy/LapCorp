package Utils;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utils {

	static WebDriver driver;
	

	public static void main(String[] args) {

	}

//Implicit wait
	public void implicitWaitSeconds(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);

	}

//Page maximize
	public void pageMAximize() {
		driver.manage().window().maximize();
	}

//ChromeDriver get
	public static WebDriver getDriver() {
		ChromeOptions chOptions = new ChromeOptions();
		Map<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("credentials_enable_service", false);
		chOptions.setExperimentalOption("prefs", chromePrefs);
		chOptions.addArguments("--disable-plugins", "--disable-extensions", "--disable-popup-blocking",
				"--start-maximized");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrives\\LabCorp\\chromedriver.exe");
		if (driver == null) {
			driver = new ChromeDriver(chOptions);
			driver.manage().window().maximize();

		}

		return driver;

	}

	// Switch window
	public static void switchWindow() {

		Set<String> windowHandles = getDriver().getWindowHandles();

		for (String handle : windowHandles) {
			if (!handle.contentEquals(getDriver().getWindowHandle())) {
				getDriver().switchTo().window(handle);
			}
		}
	}

}
