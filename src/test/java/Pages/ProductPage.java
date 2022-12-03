package Pages;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.BaseTest;
import ResuseAbstractComponents.AbstractComponents;

public class ProductPage extends BaseTest {


@FindBy(xpath = "//input[@id='userEmail']" )
WebElement loginEmailID;

@FindBy(css=".mb-3")
List<WebElement> prodcuts;

/*
	 * WebDriver driver;
public ProductPage(WebDriver driver)
{
super(driver);
this.driver=driver;
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
PageFactory.initElements(driver, this);

}

	 */
	
	
	
	
	

}
