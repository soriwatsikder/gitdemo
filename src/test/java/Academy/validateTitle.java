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

public class validateTitle extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to home page");
	}
	
	
	@Test
	public void validatePageTitle() throws IOException {

		
		LandingPage lp = new LandingPage(driver);
		AssertJUnit.assertEquals(lp.getTitle().getText(), "FEATURED COURSES");
		//Assert.assertTrue(condition);
		log.info("Successfully vaslidated text message");
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
