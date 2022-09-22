package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='text']")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("aaa");
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("button[value='1']")).click();
		
	}
}
