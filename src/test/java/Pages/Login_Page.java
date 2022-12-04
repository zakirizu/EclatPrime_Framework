package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;

public class Login_Page extends BaseTest {

	
	WebDriver driver;
	public Login_Page(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath= "//input[@id='txtUserID']")
	WebElement Userid;
	
	@FindBy(xpath= "//input[@id='txtPassword']")
	WebElement PassWord;
	
	@FindBy(xpath= "//button[@id='sub']//span[text()='Log in']")
	WebElement SubmitButton;
	
	
	
	public void logintoApplication() throws InterruptedException {
		
		driver.get(Pegaurl);
		Userid.sendKeys("joed");
		PassWord.sendKeys("Rules@123");
		SubmitButton.click();
		Thread.sleep(1000);
		
		
		
	}
	
	
}
