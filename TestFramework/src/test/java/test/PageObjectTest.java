package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import config.PropertiesFiles;
import pages.PageObject;

public class PageObjectTest {

	static WebDriver driver = null;
	static String url;  // from .properties file

	PageObject testobj = new PageObject(driver);
	PropertiesFiles propObj = new PropertiesFiles();

	@BeforeTest
	public void Setup() {

		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test(priority = 1)
	public void LaunchURL() {
		url = propObj.getProperties("url");
		driver.get(url);
	}

	@Test(priority = 2)
	public void filterEmpDetail() {

		PageObject testobj = new PageObject(driver);

		testobj.FilterDropDown("department");
		testobj.FilterDropDown("region");

	}

	@Test(priority = 3)
	public void selectEmpDept() {
		testobj.DeptDropDown("Marketing");
		testobj.RegionDropDown("UAE");

	}

	@Test(priority = 4)
	public void ReportGeneration() throws InterruptedException {
		testobj.generateReport();
		Thread.sleep(5000);
	}

	@AfterSuite
	public void teardown() {
		driver.close();
		System.out.println("Test Completed Successfully");

	}
}
