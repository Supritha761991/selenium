package webElements2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(dd);
		s.selectByIndex(4);
		Thread.sleep(3000);
		s.selectByVisibleText("Baby");
		Thread.sleep(3000);
		s.selectByValue("search-alias=stripbooks");
	}

}
