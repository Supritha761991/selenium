package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCase3 {
	WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	@Test
	public void tc1()
	{
		driver.findElement(By.xpath("//a[text()='Create a Page']")).click();
		driver.findElement(By.xpath("(//div[text()='Get Started'])[1]")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.quit();
	}

}
