package SalesForce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	ChromeDriver driver;
	@BeforeMethod

	public void Base() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
	    driver = new ChromeDriver(option);
		driver.get(" https://login.salesforce.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		WebElement UserName = driver.findElement(By.id("username"));
		UserName.sendKeys("hari.radhakrishnan@qeagle.com");
		
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Leaf@123");
		
		
		WebElement login = driver.findElement(By.id("Login"));
		login.click();
		
		WebElement applanch = driver.findElement(By.className("slds-icon-waffle"));
		applanch.click();
		
		WebElement view = driver.findElement(By.xpath("//button[text()='View All']"));
		view.click();


	}

}
