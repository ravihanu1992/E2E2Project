package Academy.E2EProject;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageobjects.ForgotPassword;
import pageobjects.LandingPage;
import pageobjects.LoginPage;
import pageobjects.PracticePage;
import resources.Base;

public class HomePage extends Base{
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
	public void basePageNavigation() throws IOException
	{
		 
		driver.get(prop.getProperty("url"));
		LandingPage l=new LandingPage(driver);
	
		LoginPage lp=l.getLogin();
		lp.getEmail().sendKeys("ravi@gmail.com");
		lp.getPassword().sendKeys("12345");

	
		
		
		ForgotPassword fp= lp.forgetPassword();
		fp.getEmail().sendKeys("xxx@12345");
		fp.sendMeInstructions().click();
	}
	
		
	
	
	@AfterTest
	public void teardown()
	{
		
		driver.close();
		log.info("window closed");
		
	}
		
	
	
	
   /*@Test	
	public void practice() throws IOException
	{
	
		
		 
		 LandingPage l=new LandingPage(driver);
		 l.getPractice().click();
		 
		 PracticePage p=new PracticePage(driver);
		 p.getRadioButton().click();
		 log.info("radio Button clicked");
			
		 p.getCheckBox1().click();
		 log.info("Check box 1 clicked");
			
		 p.getCheckbox3().click();
		 log.info("Check box 3 clicked");
			
	
		 }*/
		
		
	}
