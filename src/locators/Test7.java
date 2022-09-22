package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			Thread.sleep(3000);	
			driver.findElement(By.cssSelector("input[name='username']")).sendKeys("admin");
			driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
			driver.close();
	}

}
