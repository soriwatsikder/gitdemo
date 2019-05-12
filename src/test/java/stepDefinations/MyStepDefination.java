package stepDefinations;

import org.junit.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.portalHomePage;
import resources.base;

public class MyStepDefination extends base {

	@Given("^Nitialiaze the Browser with Chrome$")
	public void nitialiaze_the_Browser_with_Chrome() throws Throwable {
		driver = initializeDriver();
	}

	@Given("^Navigate to \"([^\"]*)\" Site$")
	public void navigate_to_Site(String arg1) throws Throwable {
		driver.get(arg1);

	}

	@Given("^Click on Login link in home page to land on Secure sing in Page$")
	public void click_on_Login_link_in_home_page_to_land_on_Secure_sing_in_Page() throws Throwable {
		LandingPage lp = new LandingPage(driver);
		
		if(lp.getPopUpSize()>0) {
			lp.getPopUp().click();
		}
		lp.getLogin().click();

	}

	@Then("^Verify that user successfully logged in$")
	public void verify_that_user_successfully_logged_in() throws Throwable {
		portalHomePage ph = new portalHomePage(driver);
		Assert.assertTrue(ph.searchBox().isDisplayed());
	}
	@When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_and_and_logs_in(String username, String password) throws Throwable {
		LoginPage lpg = new LoginPage(driver);
		lpg.getEmail().sendKeys(username);
		lpg.getPass().sendKeys(password);
		lpg.getLogin().click();
    }
	
	@And("^close browser$")
    public void close_browser() throws Throwable {
        driver.quit();
    }
	

}
