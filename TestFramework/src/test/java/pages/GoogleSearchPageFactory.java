package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPageFactory {
	
	private static WebDriver driver = null;
	
	public GoogleSearchPageFactory(WebDriver driver) {
		
		this.driver = driver;
	}
	
	 By textsearchPF = By.name("q");
	 By searchbuttonPF = By.name("q");
	
	public void setTextPF(String textToSearch) {
		
		driver.findElement(textsearchPF).sendKeys(textToSearch);
	}
	
	public void clickButtonPF() {
		
		driver.findElement(searchbuttonPF).sendKeys(Keys.RETURN);
	}
}
