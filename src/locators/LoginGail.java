package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.findElement(By.id("identifierId")).sendKeys("suprithasri20@gmail.com");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		driver.findElement(By.name("password")).sendKeys("Cherishya20");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		/*if(title.equals("Facebook"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(5000);
		driver.close();

	}

}