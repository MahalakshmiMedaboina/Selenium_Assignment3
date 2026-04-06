package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
}