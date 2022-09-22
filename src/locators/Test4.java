package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("forgetPasswordEmailOrUsername")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("forgetPasswordButton")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
