package actionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Mirrors']")).click();
		
		Thread.sleep(3000);
		driver.close();
		

	}

}
