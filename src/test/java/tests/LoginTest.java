package tests;
import base.BaseClass;
import pages.LoginPage;
import org.testng.Assert;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utilities.ExcelUtil;
import utilities.ScreenshotUtil;

public class LoginTest extends BaseClass{
	
	@DataProvider(name = "loginData")
    public Object[][] getData() throws IOException {

        String path = System.getProperty("user.dir") + "/testdata/LoginData.xlsx";

        return ExcelUtil.getTestData(path, "Sheet1");
    }
	
	@Test(dataProvider = "loginData")
	public void testLogin(String username, String password) {

	    LoginPage login = new LoginPage(getDriver());

	    login.login(username, password);
	    
	    String currentUrl = getDriver().getCurrentUrl();
	    Assert.assertTrue(currentUrl.contains("inventory"), "Login Failed");
	}
	
	
}
