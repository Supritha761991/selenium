package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		System.out.println(driver.getTitle());
		//String s = driver.getTitle();
		//System.out.println(s);
	
		System.out.println(driver.getCurrentUrl());
		
		driver.close();

	}

}
