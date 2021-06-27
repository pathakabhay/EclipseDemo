package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.GoogleSearchPageFactory;

public class TestNG_test {

	WebDriver driver = null;

	@BeforeSuite
	public void Setup() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();

	}
	
	@Test
	public void GooglePagePFTest() {

		GoogleSearchPageFactory searchObj = new GoogleSearchPageFactory(driver);

		driver.get("https://www.google.com/");

		searchObj.setTextPF("selenium");
		searchObj.clickButtonPF();

	}
	
	@AfterSuite
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");

	}

}
