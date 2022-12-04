package ResuseAbstractComponents;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	WebDriver driver;
	public AbstractComponents(WebDriver driver)
	{
		this.driver=driver;
	}
	
	
	
	public void hovertoElement(WebElement element) {
		
		
		
		//Actions ac = new Actions(driver);
		//ac.moveToElement(element).build().perform();
		
	}
	
	public void SelectDDLElement(WebElement element,String Text) {
		Select sc = new Select(element);
		sc.selectByVisibleText(Text);
		
	}
	
	
	/*WebDriver driver;
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void waitForElementToAppera(By findBy) {
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	}*/
	
	
	
	
	
	
	
	
	
	
	

}
