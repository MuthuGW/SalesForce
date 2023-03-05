package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class sort extends BaseClass {
@Test
	public  void dash() {
		
		
		WebElement opt = driver.findElement(By.xpath("//input[@class='slds-input']"));
		opt.sendKeys("dashboard");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		
		WebElement dash = driver.findElement(By.xpath("//span[text()='Dashboard Name']"));
		Actions mouse=new Actions(driver);
		mouse.moveToElement(dash).perform();
		dash.click();

	}

}
