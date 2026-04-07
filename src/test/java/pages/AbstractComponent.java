package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

    WebDriver driver;

    // Constructor
    public AbstractComponent(WebDriver driver) {
        this.driver = driver;
    }

    // Common reusable method
    public void clickElement(WebElement element) {
        element.click();
    }
    
    public void waitForElement(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}