package Academy;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.AssertJUnit;
//rahulonlinetutor@gmail.com
import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class validateNavigationBar extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test
	public void validatePageNavigation() throws IOException {
		
		
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertTrue(lp.getNavigationBar().isDisplayed());
		//Assert.assertFalse(false);
		log.info("Successfully Navigated");
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
}
