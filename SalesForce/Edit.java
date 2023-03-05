package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Edit extends BaseClass {
	
@Test

	   public  void Update() throws InterruptedException {
		
		WebElement Apps = driver.findElement(By.xpath("//div[@class='slds-accordion__summary']"));
		Apps.click();
		
		WebElement dashbord = driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li"));
		dashbord.click();
		
		 WebElement edit=driver.findElement(By.xpath("//input[@class='search-text-field slds-input input uiInput uiInputText uiInput--default uiInput--input']"));
		 edit.sendKeys("Muthu Gowreswaran",Keys.ENTER);
		 

		   
		 WebElement mouse = driver.findElement(By.xpath("(//span[text()='Muthu Gowreswaran'])/ancestor::lightning-formatted-url"));
         mouse.click();

		 Thread.sleep(10000);
		 WebElement second = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	     driver.switchTo().frame(second);

		 driver.findElement(By.xpath("//button[text()='Edit']")).click();

		 driver.switchTo().defaultContent();
		 
		 WebElement frame =driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		 driver.switchTo().frame(frame);

	     driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon-border-filled editProperties']")).click();
		 driver.findElement(By.xpath("(//div[@class='slds-form-element__control']//input[@class='slds-input'])[2]")).sendKeys("Hello Everone");   
		 String title = driver.getTitle();   
		 WebElement save = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
		 save.click();
		 
		 WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
		 done.click();
		 
		 driver.findElement(By.xpath("//footer[@class='slds-modal__footer']//button[text()='Save']")).click();
		 String title1 = driver.getTitle();

		if(title.equals(title1)) {
		    	   System.out.println("The Dashboard is Edited Successfully");
		       }



	}

}
