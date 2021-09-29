package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


//WebDriverManager.Chromedriver().setup();
public class LoginTest {
	
	
	ChromeDriver driver = new ChromeDriver();
	
//public static WebDriver driver;
	
	
	@BeforeSuite
	public void setUp()
	{
	   
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin()
	{
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("bfmnyameni@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("ghsdhh");
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
