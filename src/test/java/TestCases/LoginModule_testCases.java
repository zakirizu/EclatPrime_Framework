package TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginModule_testCases extends BaseTest{


@BeforeMethod
public static void PreTestCase() throws IOException {
	driver = initializeDriver();
}	

@AfterMethod
public static void PostTestCase() {
	driver.close();
}
	
	@Test
	public static void LoginTestCase() throws IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.openUrl(url);
		lp.getEnterUserNamePassword("test1626@gmail.com", "V77yQ6Z@TNLdbPM");
		
		
	}
	
	
	
}