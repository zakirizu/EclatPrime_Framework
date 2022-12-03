package Pages;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import ResuseAbstractComponents.AbstractComponents;

public class LoginPage {
WebDriver driver;

public LoginPage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}


@FindBy(xpath = "//input[@id='userEmail']" )
WebElement loginEmailID;

@FindBy(xpath = "//input[@id='userPassword']" )
WebElement LoginPassword;
	
@FindBy(xpath = "//input[@id='login']")
WebElement LoginButton;
	












public void getEnterUserNamePassword(String email, String Password) {
	loginEmailID.sendKeys(email);
	LoginPassword.sendKeys(Password);
	LoginButton.click();
}	
	

public void openUrl(String url) {
	driver.get(url);
}
	
	
	
	
	
	
	

}
