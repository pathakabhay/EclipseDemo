package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPageFactory;

public class GoogleSearchPageFactoryTest {

	private static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		GooglePagePFTest();
	}
	
	public static void GooglePagePFTest() {
		
				
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		GoogleSearchPageFactory searchObj = new GoogleSearchPageFactory(driver);
		
		driver.get("https://www.google.com/");
		
		searchObj.setTextPF("selenium");
		searchObj.clickButtonPF();
		
		driver.close();
		
	}

}
