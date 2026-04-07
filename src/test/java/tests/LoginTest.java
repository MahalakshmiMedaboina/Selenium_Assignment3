package tests;
import base.BaseClass;
import pages.LoginPage;

import java.io.IOException;

import org.testng.annotations.Test;
import utilities.ScreenshotUtil;

public class LoginTest extends BaseClass{
	
	@Test
	public void testLogin() throws IOException {

	    LoginPage login = new LoginPage(getDriver());
	    login.login("standard_user", "secret_sauce");

	    ScreenshotUtil.takeScreenshot(getDriver(), "loginTest");
	}
	
	
}
