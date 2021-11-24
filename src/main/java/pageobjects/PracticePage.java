package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticePage {
	
	
public WebDriver driver;
	
	By radio3=By.xpath("//body/div[1]/div[1]/fieldset[1]/label[3]/input[1]");
	By option1=By.xpath("//input[@id='checkBoxOption1']");
	By option3=By.name("checkBoxOption3");



	public PracticePage(WebDriver driver) {
		
		this.driver=driver;
	}

	public WebElement getRadioButton()
	{
		return driver.findElement(radio3);

}
	public WebElement getCheckBox1()
	{
		return driver.findElement(option1);

}
	public WebElement getCheckbox3()
	{
		return driver.findElement(option3);

}


}
