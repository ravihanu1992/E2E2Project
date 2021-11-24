package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	
public WebDriver driver;
	
	By email=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@id='user_password']");
	By login=By.name("commit");
	By forgotPassword = By.xpath("//a[contains(text(),'Forgot Password?')]");


	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getEmail()
	{
		return driver.findElement(email);

}

	public WebElement getPassword()
	{
		return driver.findElement(password);

}
	


	public ForgotPassword forgetPassword()
	{
		driver.findElement(forgotPassword).click();
		return new ForgotPassword(driver);
}
}
