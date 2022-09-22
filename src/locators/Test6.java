package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(3000);
		driver.findElement(By.linkText("LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("Forgot")).click();
		driver.close();

}
}