package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// here we created: Defined locators and methods
public class LoginPage {

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
//    By username = By.id("user-name"); 
      @FindBy(id="user-name") //instead of above line we write this
      WebElement username;
    
//    By password = By.id("password");
      @FindBy(id="password")
      WebElement password;
      
//    By loginBtn = By.id("login-button");
      @FindBy(id="login-button")
      WebElement loginBtn;

    // Actions
    public void enterUsername(String user) {
//        driver.findElement(username).sendKeys(user);
    	username.sendKeys(user); // we wrote this step instead of above line
    }

    public void enterPassword(String pass) {
//        driver.findElement(password).sendKeys(pass);
    	password.sendKeys(pass);
    }

    public void clickLogin() {
//        driver.findElement(loginBtn).click();
    	loginBtn.click();
    	
    }
    public void login(String user, String pass) {
  	  username.sendKeys(user);
  	  password.sendKeys(pass);
  	  loginBtn.click();
  	}
}