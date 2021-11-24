package Academy.E2EProject;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.PracticePage;
import resources.Base;

public class ValidatenavBar extends Base{
	public WebDriver driver;
	
	
	 public static Logger log =LogManager.getLogger(Base.class.getName());
	@BeforeTest

	public void initialize() throws IOException
	{
		
		 driver =initializeDriver();
		 log.info("Driver is initialized");
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Home Page");
	}
	

@Test
public void validateAppNavBar() throws IOException
{
	
		
		 LandingPage l=new LandingPage(driver);
		 
		 Assert.assertTrue(l.getNavigationBar().isDisplayed());
		 log.info("Navigation Bar is displayed");
	}
	

@AfterTest
public void teardown()
{
	
	driver.close();
	log.info("window closed");
	
	
}
}
	
