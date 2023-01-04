package Pages;

import javax.security.auth.login.AccountNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ResuseAbstractComponents.AbstractComponents;

public class InitiagePage  {
	
	WebDriver driver;
	public InitiagePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	
	/****************************START*************************************
	 ******************Template to Add Elements**********************
	 ******************************************************************/
	@FindBy(xpath = "//span[text()='Enrollment']")
	private WebElement EnrolmenteButton;
	
	public WebElement getEnrolmenteButton() {return EnrolmenteButton;}
	public void setEnrolmenteButton(WebElement enrolmenteButton) {EnrolmenteButton = enrolmenteButton;}

	/**************************END***************************************/
	
	
	

	
	@FindBy(xpath = "(//span[text()='Initiate DOD verification'])[1]")
	private WebElement DODVerification;
	public WebElement getDODVerification() {return DODVerification;}
	public void setDODVerification(WebElement DODVerification) {DODVerification = DODVerification;}
	
	@FindBy(xpath = "(//span[text()='Initiate DOD '])[1]")
	private WebElement temp;
	public WebElement gettemp() {return temp;}
	public void settemp(WebElement temp) {temp = temp;}
	
	
	
	
	
	@FindBy(id = "b3d17ee3")
	private	 WebElement SSNTxtBox;
	public WebElement getSSNTxtBox() {
		return SSNTxtBox;
	}
	public void setSSNTxtBox(WebElement sSNTxtBox) {
		SSNTxtBox = sSNTxtBox;
	}

	
	@FindBy(id = "360e26ae")
	private
	 WebElement AcntNumTxtBox;
	
	@FindBy(id = "fd28b87d")
	private
	 WebElement FrstNameTextBox;
	
	@FindBy(id = "9091f465")
	private
	 WebElement LstNameTextBox;
	
	@FindBy(xpath = "//button[text()='Clear']")
	 WebElement ClearButton;
	
	@FindBy(xpath = "//button[text()='Search']")
	private
	 WebElement SearchButton;

	@FindBy(id = "5e1978c7")
	private
	WebElement CommnetsTextBox;
	

	@FindBy(xpath = "//button[text()='Proceed']")
	private
	WebElement ProceedButton;
	
	
	@FindBy(xpath = "//img[@title='Application logo']")
	WebElement PegaButton;
	
	@FindBy(xpath = "//span[text()='Create']")
	private	WebElement CreateButton;
	public WebElement getCreateButton() {
		return CreateButton;	}
	public void getCreateButton(WebElement CreateButton) {
		FrstNameTextBox = CreateButton;
	}
	
	@FindBy(xpath = "//button[text()='Go']")
	private
	WebElement goButton;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private
	WebElement SubmitButton;
	
	public WebElement getFrstNameTextBox() {
		return FrstNameTextBox;
	}
	public void setFrstNameTextBox(WebElement frstNameTextBox) {
		FrstNameTextBox = frstNameTextBox;
	}
	public WebElement getLstNameTextBox() {
		return LstNameTextBox;
	}
	public void setLstNameTextBox(WebElement lstNameTextBox) {
		LstNameTextBox = lstNameTextBox;
	}
	public WebElement getAcntNumTxtBox() {
		return AcntNumTxtBox;
	}
	public void setAcntNumTxtBox(WebElement acntNumTxtBox) {
		AcntNumTxtBox = acntNumTxtBox;
	}
	public WebElement getProceedButton() {
		return ProceedButton;
	}
	public void setProceedButton(WebElement proceedButton) {
		ProceedButton = proceedButton;
	}
	public WebElement getSearchButton() {
		return SearchButton;
	}
	public void setSearchButton(WebElement searchButton) {
		SearchButton = searchButton;
	}
	public WebElement getCommnetsTextBox() {
		return CommnetsTextBox;
	}
	public void setCommnetsTextBox(WebElement commnetsTextBox) {
		CommnetsTextBox = commnetsTextBox;
	}
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	public void setSubmitButton(WebElement submitButton) {
		SubmitButton = submitButton;
	}
	public WebElement getGoButton() {
		return goButton;
	}
	public void setGoButton(WebElement goButton) {
		this.goButton = goButton;
	}

/********************************
 * 								*
 * COMMON METHODS FOR THIS PAGE *
 * 								*
 * ******************************
 */
	

	public void hovertoCreateElement() throws InterruptedException {
	    JavascriptExecutor executor = (JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//span[text()='Create']")));
	    Thread.sleep(2000);
		
	}
	
	
}
