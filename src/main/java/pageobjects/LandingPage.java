package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	

	public WebDriver driver;
	
	By signin=By.xpath("//span[contains(text(),'Login')]");
	By practice=By.xpath("//a[contains(text(),'Practice')]");
	By title=By.xpath("//h2[contains(text(),'Featured Courses')]");
	By NavBar=By.xpath("//header/div[2]");
	


	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
	}



	public LoginPage getLogin()
	{
		 driver.findElement(signin).click();
		 LoginPage lp=new LoginPage(driver);
		 return lp;

}
	
	public WebElement getPractice()
	{
		return driver.findElement(practice);

}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);

}


	public WebElement getNavigationBar() {
		return driver.findElement(NavBar);
	}
	}
