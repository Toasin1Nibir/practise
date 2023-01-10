package advanceTestCase;

import java.time.Duration;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;
import pageObject.PO_001_checkboxAndRadio;

public class TC004_checkboxAndRadioButton extends DriverSetup{
	public static String baseUrl = "https://jqueryui.com/checkboxradio";

	// Selection of Radio button and Check box in Frames:
	@Test
	public static void CheckBoxAndRadioButtonInFrame() throws InterruptedException {
		
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		// Switch to Frame
		driver.switchTo().frame(0);
		
		// Operate Elements
		PO_001_checkboxAndRadio cbox= new PO_001_checkboxAndRadio(driver);
		
		cbox.clickRadioButtonLondon();
		Thread.sleep(5000);
		cbox.clickFiveStar();
		
		Thread.sleep(5000);
		// Back to page
		driver.switchTo().defaultContent();
		// Close site
		driver.close();
	}
}
