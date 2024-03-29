package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	public WebDriver driver;
	
	By signin = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector(".text-center>h2");
	By NavBar = By.cssSelector(".nav.navbar-nav.navbar-right>li>a");
	By PopUp = By.xpath("//button[contains(text(),'NO THANKS')]");
			
	
	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getLogin() {
		return driver.findElement(signin);
	}
	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}
	public int getPopUpSize() {
		return driver.findElements(PopUp).size();
	}
	public WebElement getPopUp() {
		return driver.findElement(PopUp);
	}
	public WebElement getTitle() {
		return driver.findElement(title);
	}
	

}
