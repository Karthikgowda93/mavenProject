package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class logintest {

	public static WebDriver driver ;
	
	@BeforeSuite
	public void setup() {
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}
	
	@Test
	public void login() {
		
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("karthikbdvt6");
		driver.findElement(By.id("identifierId")).sendKeys(Keys.ENTER);
		driver.manage().window().maximize();
		
	}
	@AfterSuite
	public void teardown() {
		driver.quit();
	}
	
	
	
	
}
