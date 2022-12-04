package ResuseAbstractComponents;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	
	
	
	public static ExtentReports getReportObject() {
		//String path = System.getProperty("user.dir"+"//reports//index.html");
		String path  = "C:\\Work\\EclatPrime_Framework\\reports\\index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		reporter.config().setReportName("Military Assist Automation Results");
		reporter.config().setDocumentTitle("Eclat Prime");
		
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester Name", "Abhilash B V");
		return extent;
		
	}
	
	

}
