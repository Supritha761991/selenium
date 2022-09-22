package screenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//type casting
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		//access the method and take a screenshot and get the location
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		//specify the location
		File dest = new File("./Photo/facebook.png");
		
		//copy and paste it in specific folder
		FileUtils.copyFile(src, dest);
		
		driver.close();
	}

}
