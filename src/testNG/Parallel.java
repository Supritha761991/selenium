package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@Parameters({"BrowserName"})
	@Test
	public void login(String browser)
	{
		if(browser.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.findElement(By.linkText("Forgotten password?")).click();
	}

}

/*
 
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite" parallel="tests">
  <test thread-count='5' name="Test1">
  <parameter name="BrowserName" value="chrome"></parameter>
  <classes>
  <class name="testNG.Parallel"></class>
  </classes>
  </test> <!-- Test -->
  
  <test thread-count='5' name="Test2">
  <parameter name="BrowserName" value="chrome"></parameter>
  <classes>
  <class name="testNG.Parallel"></class>
  </classes>
  </test> <!-- Test -->
  
</suite> <!-- Suite -->

*/