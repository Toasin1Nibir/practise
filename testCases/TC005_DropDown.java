package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC005_DropDown extends DriverSetup {
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(enabled = false)
	public static void selectingValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.name("cars"));
		Select s = new Select(e);
		Thread.sleep(3000);
		s.selectByIndex(1);
		Thread.sleep(3000);
		// deselectAll( ):
		// deselectByValue( )
		// deselectByVisibleText( ):
		// getAllSelectedOptions( ):

		driver.switchTo().defaultContent();
	}

	@Test
	public static void selectingMultipleValueFromDropdown() throws InterruptedException {

		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.switchTo().frame("iframeResult");
		WebElement e = driver.findElement(By.name("cars"));
		Select s = new Select(e);
		// Select more than one item
		Actions a = new Actions(driver);
		
		a.keyDown(Keys.CONTROL)
			.click(s.getOptions().get(3))
			.click(s.getOptions().get(1))
			.keyUp(Keys.CONTROL)
			.build()
			.perform();

		Thread.sleep(3000);
		// Close Site

		driver.switchTo().defaultContent();
	}
}
