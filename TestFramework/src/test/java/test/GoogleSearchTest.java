package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchPage;

public class GoogleSearchTest {
	
	private static WebDriver driver =null;

	public static void main(String[] args) {
	
		googleSearch();

	}	
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver",projectPath+"/drivers/chromeDriver/chromedriver.exe");
		 driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://www.google.com/");
		
		GoogleSearchPage.textSearch(driver).sendKeys("selenium");
		
		GoogleSearchPage.searchButton(driver).sendKeys(Keys.RETURN);
		//driver.findElement(By.name("q")).sendKeys("selenium");
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
		
		driver.close();
		
		
	}

}
