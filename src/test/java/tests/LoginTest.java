package tests;
import base.BaseClass;
import pages.LoginPage;
//import org.testng.Assert;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtil;
//import utilities.ScreenshotUtil;
import utilities.TestDataProvider;


public class LoginTest extends BaseClass{
	
	@DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {

        String path = System.getProperty("user.dir") + "/testdata/LoginData.xlsx";

        return ExcelUtil.getTestData(path, "Sheet1");
    }
	

	
	@Test(dataProvider = "jsonData", dataProviderClass = TestDataProvider.class)
	public void testLoginJson(HashMap<String, String> data) throws InterruptedException {

	    LoginPage login = new LoginPage(getDriver());

	    login.login(data.get("username"), data.get("password"));
	    
	    Thread.sleep(5000); // just to see session in Grid, we slowed the execution 
	}
	
}
