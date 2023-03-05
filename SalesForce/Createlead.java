package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Createlead extends BaseClass {

	@Test
	
	public void create() throws InterruptedException {
		
		WebElement Apps = driver.findElement(By.xpath("//div[@class='slds-accordion__summary']"));
		Apps.click();
		
		WebElement dashbord = driver.findElement(By.xpath("//p[text()='Dashboards']/ancestor::li"));
		dashbord.click();
		
		WebElement New = driver.findElement(By.xpath("//div[text()='New Dashboard']"));
		New.click();
		
		WebElement frame =driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
	    driver.switchTo().frame(frame);
	       
	       
		WebElement name = driver.findElement(By.id("dashboardNameInput"));
		name.sendKeys("Muthu Gowreswaran");
		
		
	    WebElement create = driver.findElement(By.id("submitBtn"));
		create.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(10000);
		WebElement Add = driver.findElement(By.xpath("//div[@class='dashboardContainer']//iframe"));
		driver.switchTo().frame(Add);
		
		WebElement save = driver.findElement(By.xpath("//button[text()='Save']"));
		save.click();
		
		WebElement done = driver.findElement(By.xpath("//button[text()='Done']"));
		done.click();
		
		
	}

}
