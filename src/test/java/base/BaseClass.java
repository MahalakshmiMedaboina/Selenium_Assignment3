package base;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import utilities.WaitUtil;

public class BaseClass {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
//    public void setup() {
    public void setup() throws Exception {

//        System.out.println("Launching Browser");
    	System.out.println("Launching Browser on Grid");

//        WebDriverManager.chromedriver().setup();
    	DesiredCapabilities cap = new DesiredCapabilities();
        cap.setBrowserName("chrome");   // you can change to firefox, edge


//        driver.set(new ChromeDriver());
        driver.set(new RemoteWebDriver(
                new URL("http://localhost:4444"),
                cap
            ));

//        driver.get().manage().window().maximize();
        
        driver.get().manage().window().maximize();
        driver.get().get("https://www.saucedemo.com/");

        // ✅ Implicit Wait added
        WaitUtil.applyImplicitWait(driver.get());
        System.out.println("Driver Type: " + driver.get().getClass()); // just to see the driver type
//
//        driver.get().get("https://www.saucedemo.com/");
    }

    @AfterMethod
    public void teardown() {

        System.out.println("Closing Browser");

        driver.get().quit();
    }

    public WebDriver getDriver() {
        return driver.get();
    }
}