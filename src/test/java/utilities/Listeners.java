package utilities;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utilities.ScreenshotUtil;
import com.aventstack.extentreports.*;

public class Listeners extends base.BaseClass implements ITestListener {

    ExtentReports extent = ExtentReporterNG.getReportObject();
    ExtentTest test;

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
        
        try {
            String path = ScreenshotUtil.takeScreenshot(getDriver(), result.getMethod().getMethodName());
            test.addScreenCaptureFromPath(path);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
	 public void onFinish(org.testng.ITestContext context) {
	        extent.flush();
	    }
    
    
  }
        
