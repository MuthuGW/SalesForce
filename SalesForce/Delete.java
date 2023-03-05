package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Delete extends BaseClass {
@Test

	public void Remove() throws InterruptedException {
	
		
		 WebElement all = driver.findElement(By.xpath("//div[@class='slds-accordion__summary']"));
		 all.click();
		 
		 WebElement Dash = driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li"));
		 Dash.click();
		 
		   WebElement name=driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
		   name.sendKeys("Muthu Gowreswaran",Keys.ENTER);

     	    Thread.sleep(3000);
	        WebElement brands=driver.findElement(By.xpath("(//button[@class='slds-button slds-button_icon-border slds-button_icon-x-small'])[1]//following::lightning-primitive-icon"));
			Actions move=new Actions(driver);
			move.moveToElement(brands).perform();
			brands.click();

			driver.findElement(By.xpath("//span[text()='Delete']")).click();
		    driver.findElement(By.xpath("//span[text()='Delete']/parent::button")).click();
			System.out.println();
		   
		   
		   

	}

}
