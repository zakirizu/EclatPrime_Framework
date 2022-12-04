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
import Pages.VerifyWithDODPage;


public class Enrollment_TestCases extends BaseTest {
WebDriver driver;	



@Test(dataProvider = "getData")
public void HappyFlow_TestCase(HashMap<String, String> input) throws IOException, InterruptedException {
	
	Login_Page lp = new Login_Page(driver);
	lp.logintoApplication();
	
	InitiagePage ip = new InitiagePage(driver);
	ip.hovertoCreateElement();
	ip.getCreateButton().click();
	ip.getEnrolmenteButton().click();
	ip.getSSNTxtBox().sendKeys(input.get("RandomSSN"));
	ip.getAcntNumTxtBox().sendKeys(input.get("acc"));
	ip.getFrstNameTextBox().sendKeys(input.get("fname"));
	ip.getLstNameTextBox().sendKeys(input.get("lname"));
	ip.getSearchButton().click();
	ip.getCommnetsTextBox().sendKeys(input.get("comments"));
	ip.getProceedButton().click();		
	ip.getGoButton().click();
	ip.getSubmitButton().click();
	
	Assert.assertTrue(ip.getDODVerification().isDisplayed());
	
	VerifyWithDODPage dod = new VerifyWithDODPage(driver);
	dod.getSubmitButton().click();
	
	
	
	
	
	
	
}



	@Test(dataProvider = "getData")
	public void HappyFlow_TestCase2(HashMap<String, String> input) throws IOException, InterruptedException {
		
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
	
	
	
	
	
	
	
	
	@Test(dataProvider = "getData")
	public void ValidateEndFlow(HashMap<String, String> input) throws IOException, InterruptedException{
		
		
		
	}
	
	
	
	
	
	@Test(dataProvider = "getData")
	public void ValdiaMMiltaFLow(HashMap<String, String> input) throws IOException, InterruptedException{
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
@DataProvider
	public Object[][] getData() throws IOException {
		List<HashMap<String, String>> data =  getJsonDataReader(System.getProperty("user.dir")+"\\Resources\\TestData.json");
		return new Object[][]{
			{data.get(0)},
			//{data.get(1)}
			
		};
		
	}

@AfterMethod
	public void closingBrowser() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
	}

@BeforeMethod
	public void OpenBrowser() throws InterruptedException, IOException {
		driver = initializeDriver();
	}

	
	

}
