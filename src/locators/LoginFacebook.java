package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("supritha.r032@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Cherishya@20");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Facebook"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.close();

	}

}
