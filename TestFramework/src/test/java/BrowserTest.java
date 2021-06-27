import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {
	
	public static void main(String[] args) {
		
		String projectPath = System.getProperty("user.dir");
		
	//	System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckoDriver/geckodriver.exe");
	//	WebDriver driver = new FirefoxDriver();
		
	//	System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromeDriver/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://www.selenium.dev/");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
