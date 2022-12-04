package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import ResuseAbstractComponents.AbstractComponents;

public class BaseTest  {
public static WebDriver driver;
public static String browserName;
public static String url;
public static String Pegaurl;
public static int timeout;
	
public static WebDriver initializeDriver() throws IOException {

	Properties prop 	= new Properties();
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\Resources\\GlobalData.properties");
	prop.load(fis);
	browserName 	= prop.getProperty("browser");
	url 			= prop.getProperty("url");
	Pegaurl			= prop.getProperty("Pegaurl");
	//timeout			= (int) prop.get("timeout");
	
	
	
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
		System.out.println("Please give the Proper Browser Name In  Resources->GlobalData.Properties Folder ");
	}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	return driver;
	
}

public static List<HashMap<String, String>> getJsonDataReader(String filePath) throws IOException{
//Read Json String 	
String jsconContent = FileUtils.readFileToString(new File(filePath));

//String to HashMap -- can be done by using jackson Databid Dependency
ObjectMapper mapper 				 = new ObjectMapper();
List<HashMap<String,String>>	data = mapper.readValue(jsconContent, new TypeReference<List<HashMap<String,String>>>() {});
return data;
//now this list has two maps
}


public void getScreenShot(String TestCaseName) throws IOException
{
	
TakesScreenshot ts 	= (TakesScreenshot)driver;
File source 		= ts.getScreenshotAs(OutputType.FILE);
File Destination	= new File(System.getProperty("user.dir")+"\\ScreenShots"+TestCaseName+".png");
FileUtils.copyFile(source, Destination);
return System.getProperty("user.dir")+"\\ScreenShots"+TestCaseName+".png";


}
	

	

}
