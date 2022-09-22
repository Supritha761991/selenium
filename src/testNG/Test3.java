package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test3 {
	@Test(priority=-1,invocationCount = 5)
	public void chats()
	{
		Reporter.log("chats",true);
	}
	@Test(enabled=false)
	public void calls()
	{
		Reporter.log("calls",true);
	}
	@Test
	public void settings()
	{
		Reporter.log("settings",true);
	}
}
