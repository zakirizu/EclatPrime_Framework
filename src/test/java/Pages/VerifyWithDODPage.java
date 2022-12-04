package Pages;

import javax.security.auth.login.AccountNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ResuseAbstractComponents.AbstractComponents;

public class VerifyWithDODPage  {
	
	WebDriver driver;
	public VerifyWithDODPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	/****************************START*************************************
	 ******************Template to Add Elements**********************
	 ******************************************************************/
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement SubmitButton;
	public WebElement getSubmitButton() {return SubmitButton;}
	public void setSubmitButton(WebElement SubmitButton) {SubmitButton = SubmitButton;}

	/**************************END***************************************/
	

	
	
}
