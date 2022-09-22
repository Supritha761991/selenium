package webElements2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement dd = driver.findElement(By.id("cars"));
		
		Select s = new Select(dd);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByVisibleText("INR 100 - INR 199 ( 16 ) ");
		Thread.sleep(3000);
		s.selectByValue("299");
		Thread.sleep(3000);
		/*s.deselectByIndex(1);
		Thread.sleep(3000);
		s.deselectAll();*/
		
		WebElement first = s.getFirstSelectedOption();
		System.out.println(first.getText());
		
		List<WebElement> all = s.getAllSelectedOptions();
		
		for(WebElement i : all)
		{
			System.out.println(i.getText());
		}
		System.out.println("Elements of dropdown");
		List<WebElement> a = s.getOptions();
		for (WebElement ele : a) {
			System.out.println(ele.getText());
		}
		
		}
	}
