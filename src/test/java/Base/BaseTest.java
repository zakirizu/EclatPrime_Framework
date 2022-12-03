package Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import Pages.LoginPage;

public class BaseTest {
public static WebDriver driver;
public static String browserName;
public static String url;
	
public static WebDriver initializeDriver() throws IOException {

	 
	Properties prop 	= new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Resources\\GlobalData.properties");
	System.out.println(System.getProperty("user.dir")+"\\Resources\\GlobalData.properties");
	prop.load(fis);
	browserName 	= prop.getProperty("browser");
	url 			= prop.getProperty("url");
	
	
	if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	else if(browserName.equals("edge")){
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Drivers\\msedgedriver.exe");
			driver = new InternetExplorerDriver();
	}
	
	else if(browserName.equals("firefox")){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	}
	
	else
	{
		System.out.println("Please give the Proper Browser Name In GlobalData.Properties files Under Resources Folder ");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	return driver;
	
}
	

	

}
