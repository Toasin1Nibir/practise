package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PO_001_checkboxAndRadio {
	WebDriver driver=null;
	
	public PO_001_checkboxAndRadio(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By londonRadioButton=By.xpath("//body/div[1]/fieldset[1]/label[3]");
	By fiveStarCheckbox=By.xpath("//body[1]/div[1]/fieldset[2]/label[4]/span[1]");

	public void clickRadioButtonLondon() 
	{
		driver.findElement(londonRadioButton).click();
	}
	
	public void clickFiveStar() 
	{
		driver.findElement(fiveStarCheckbox).click();
	}

}
