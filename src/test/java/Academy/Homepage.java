package Academy;
import org.testng.annotations.Test;
//rahulonlinetutor@gmail.com
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class Homepage extends base {
	private static Logger log = LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		
	}
	
	@Test(dataProvider="getData")
	public void basePageNevigation(String Username, String Password) throws IOException {
	
		driver.get(prop.getProperty("url"));
		LandingPage lp = new LandingPage(driver);
		lp.getLogin().click();
		LoginPage lpg = new LoginPage(driver);
		lpg.getEmail().sendKeys(Username);
		lpg.getPass().sendKeys(Password);
		//System.out.println(Text);
		
		log.info("testing");
		lpg.getLogin().click();
	}
		@AfterTest
		public void teardown() {
			driver.close();
			driver=null;
	}
	@DataProvider
	public Object[][] getData() {
		//rows stand for how many different data types test should run
		//coloumn stands for how many values per each test
		Object [][] data = new Object[2][2];
		data[0][0]="faysalsf@gmail.com"; 	//0 th row
		data[0][1]="123456";
		
		data[1][0]="nonfaysalsf@gmail.com";
		data[1][1]="123456789AAAA";

		
		return data;
		
	}
}
