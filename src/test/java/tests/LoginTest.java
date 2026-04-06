package tests;
import base.BaseClass;
import pages.LoginPage;

import org.testng.annotations.Test;


public class LoginTest extends BaseClass{
	@Test
    public void testLogin() {
		LoginPage login = new LoginPage(driver);

//        login.enterUsername("admin");
//        login.enterPassword("admin123");
//        login.clickLogin();
		
		login.login("standard_user", "secret_sauce");

        System.out.println("Login using PageFactory");
    }
}
