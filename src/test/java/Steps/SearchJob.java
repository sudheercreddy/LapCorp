package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SearchJob {
	


	@Given("Browser to {string}")
	public void browser_to(String url) {
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumDrives\\LabCorp\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(url);
	
	}

	@Then("Find and click Careers link")
	public void find_and_click_Careers_link() {
		
	}

	@Then("Search for {string}")
	public void search_for(String job) {
		System.out.println(job);
	}

	@Then("click on the search button")
	public void click_on_the_search_button() {

	}
}
