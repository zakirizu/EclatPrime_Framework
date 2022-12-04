package TestCases;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Base.BaseTest;
import Pages.InitiagePage;
import Pages.Login_Page;

public class DeEnrollment_TestCases extends BaseTest {
	
WebDriver driver;	

@AfterMethod
public void closingBrowser() throws InterruptedException {
	Thread.sleep(2000);
	driver.quit();
}
	

@BeforeMethod
public void OpenBrowser() throws InterruptedException, IOException {
	driver = initializeDriver();
	
}
	@Test
	public void HappyFlow_TestCase1() throws IOException, InterruptedException {
		
		Login_Page lp = new Login_Page(driver);
		lp.logintoApplication();		
		InitiagePage init = new InitiagePage(driver);
		
	
	}

	
	

}



