package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;

public class BaseClass {

    public WebDriver driver;

    @BeforeClass
    public void setup() {
        System.out.println("Launching Browser");
        
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/"); 
    }

    @AfterClass
    public void teardown() {
        System.out.println("Closing Browser");
        driver.quit();
    }
}