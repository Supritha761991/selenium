package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Dog supplies']"));
		Point add = ele.getLocation();
		System.out.println(add);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		System.out.println(x);
		System.out.println(y);
		
JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,+x)");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,+(y-200))");
		
		ele.click();
	}

}
