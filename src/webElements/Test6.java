package webElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele = driver.findElement(By.name("username"));
		Point loc = ele.getLocation();
		System.out.println(ele.getLocation());
		System.out.println(loc.getX()+ " x-axis");
		System.out.println(loc.getY()+ " y-axis");
		
		driver.close();
	}

}
