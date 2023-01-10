package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.DriverSetup;

public class TC0010_RightClick extends DriverSetup{
	public static String baseUrl = "https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple";

	@Test(enabled=true)
	public static void doubleClickRightClick() throws InterruptedException {
		driver.get(baseUrl);
		new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		Actions a = new Actions(driver);
		WebElement doubleClickElement = driver.findElement(By.xpath("//p[contains(text(),'The multiple attribute specifies that multiple opt')]"));
		a.doubleClick(doubleClickElement).build().perform();
		
		Thread.sleep(3000);
		
		WebElement rightClick = driver.findElement(By.xpath("//body/form[1]/input[1]"));
		a.contextClick(rightClick).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		

		//click()
		//dragAndDrop( )
		//clickAndHold( )
		//keyDown( )
		//keyUp( )
		//release( )
		
		//build( )
		//perform();
		
	}
}
