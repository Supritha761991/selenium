package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("**********@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("pass")).sendKeys("****************");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();

	}

}
