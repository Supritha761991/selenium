package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook {

		//finding elements-declaration
		
		@FindBy(id = "email")
		public WebElement EmailTab;
		
		@FindBy(id= "pass")
		public WebElement PasswordTab;
		
		@FindBy(name= "login")
		public WebElement LogInButton;
		
		//initialization
		
		public Facebook(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
			
		//utilization
		
		public void EmailTab(String id)
		{
		
			EmailTab.sendKeys(id);
		}


		public void PasswordTab(String id) 
		{
			PasswordTab.sendKeys(id);
			
		}


		public void LogInButton() 
		{
			LogInButton.click();	
		}
}

