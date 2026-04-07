package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


// here we created: Defined locators and methods
//public class LoginPage {
public class LoginPage extends AbstractComponent{

    WebDriver driver;

    // Constructor
    public LoginPage(WebDriver driver) {
    	super(driver); //Calls parent constructor (AbstractComponent)
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators

      @FindBy(id="user-name") 
      WebElement username;
    
      @FindBy(id="password")
      WebElement password;
      
      @FindBy(id="login-button")
      WebElement loginBtn;

    // Actions
    public void enterUsername(String user) {
    	username.sendKeys(user);
    }

    public void enterPassword(String pass) {
    	password.sendKeys(pass);
    }

    public void clickLogin() {
//    	loginBtn.click();
    	clickElement(loginBtn); //This method comes from AbstractComponent
    	
    }
    public void login(String user, String pass) {
    	waitForElement(username);
  	  username.sendKeys(user);
  	waitForElement(password);
  	  password.sendKeys(pass);
  	  loginBtn.click();
  	}
}