package TestCases;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Base.BaseTest;
import Pages.InitiagePage;
import Pages.Login_Page;



public class Enrollment_TestCases extends BaseTest {
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





	@Test(dataProvider = "getData")
	public void HappyFlow_TestCase(HashMap<String, String> input) throws IOException, InterruptedException {
		
		Login_Page lp = new Login_Page(driver);
		lp.logintoApplication();		
		InitiagePage init = new InitiagePage(driver);
		init.hovertoCreateElement();
		init.getCreateButton().click();
		init.getEnrolmenteButton().click();
		init.getSSNTxtBox().sendKeys(input.get("ssn"));
		init.getAcntNumTxtBox().sendKeys(input.get("acc"));
		init.getFrstNameTextBox().sendKeys(input.get("fname"));
		init.getLstNameTextBox().sendKeys(input.get("lname"));
		init.getSearchButton().click();
		init.getCommnetsTextBox().sendKeys(input.get("comments"));
		init.getProceedButton().click();		
		init.getGoButton().click();
		init.getSubmitButton().click();
		Assert.assertTrue(init.getDODVerification().isDisplayed());
		
	
	}
	
	
	@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data =  getJsonDataReader(System.getProperty("user.dir")+"\\Resources\\TestData.json");
		return new Object[][]{
			{data.get(0)},
			//{data.get(1)}
			
		};
		
	}


	
	

}
