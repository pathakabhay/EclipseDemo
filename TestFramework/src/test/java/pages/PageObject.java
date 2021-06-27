package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class PageObject {

	static WebDriver driver = null;
	static WebElement element = null;

	static By filterDropDown = By.id("selDetails");
	static By deptDropDown = By.id("fltdepartment");
	static By regionDropDown = By.id("fltregion");
	static By generateRptBtn = By.id("btnGen");

	public PageObject(WebDriver driver) {
		this.driver = driver;
	}

	public void FilterDropDown(String filter) {

		element = driver.findElement(filterDropDown);

		Select select = new Select(element);
		select.selectByValue(filter);
	}

	public void DeptDropDown(String dept) {

		element = driver.findElement(deptDropDown);
		DeslctandSelect(dept);

	}

	public void RegionDropDown(String region) {

		element = driver.findElement(regionDropDown);
		DeslctandSelect(region);

	}

	public static void DeslctandSelect(String value) {

		Select select = new Select(element);
		select.deselectAll();
		select.selectByVisibleText(value);
	}
	
	public void generateReport() {
		
		element = driver.findElement(generateRptBtn);
		element.click();
	}

}
