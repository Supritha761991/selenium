package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScenario {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(3000);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("Pass : Homepage displayed");
		}
		else
		{
			System.out.println("Fail : Homepage not displayed");
		}
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		driver.close();
		
	}

}
