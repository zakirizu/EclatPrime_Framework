package Utilities;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Base.BaseTest;
import ResuseAbstractComponents.ExtentReporterNG;

public class Listeners extends BaseTest implements ITestListener{	
ExtentReports extent = ExtentReporterNG.getReportObject();
ExtentTest test;
WebDriver driver;
	
    @Override		
    public void onTestStart(ITestResult arg0) {					
        /*********************************
    	*****Add code to log reports******
    	**********************************/
    	
    	test = extent.createTest(arg0.getMethod().getMethodName());
        		
    }		
    

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        /*********************************
      	*****Message to state TC Pass******
      	**********************************/
    	String tcName = arg0.getMethod().getMethodName();
    	test.log(Status.PASS, " "+tcName  +"Passed");
    	
    	
    	
        		
    }	
    
    @Override		
    public void onTestFailure(ITestResult arg0) {					
        // TODO Auto-generated method stub	
    	//We Can write the code for Taking screen shots on failures of test case
    	
        /*********************************
      	*****Add code to log reports******
      	**********************************/
    	try {
			driver = (WebDriver) arg0.getTestClass().getRealClass().getField("driver").get(arg0.getInstance());
		} 
    	catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	
    	String tcName = arg0.getMethod().getMethodName();
    	test.log(Status.FAIL, arg0.getThrowable());
    	
    	String filepath = null;
    	
    	try {
			 filepath = getScreenShot(tcName, driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	test.addScreenCaptureFromPath(filepath, tcName);
    	
    	
        		
        		
    }	
	
	@Override		
    public void onFinish(ITestContext arg0) {	
		
       extent.flush();
        		
    }		

    @Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

	

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		



	
	
	

}
