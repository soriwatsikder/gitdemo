package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class portalHomePage {
	public WebDriver driver;
	
	By searchBox = By.xpath("//input[@id='search-courses']");
	
	public portalHomePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement searchBox() {
		return driver.findElement(searchBox);
	}
	

}
