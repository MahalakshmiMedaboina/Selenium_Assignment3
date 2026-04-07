package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import utilities.WaitUtil;

public class BaseClass {

    public static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    @BeforeMethod
    public void setup() {

        System.out.println("Launching Browser");

        WebDriverManager.chromedriver().setup();

        driver.set(new ChromeDriver());

        driver.get().manage().window().maximize();

        // ✅ Implicit Wait added
        WaitUtil.applyImplicitWait(driver.get());

        driver.get().get("https://www.saucedemo.com/");
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