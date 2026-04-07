package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

public class WaitUtil {

    public static void applyImplicitWait(WebDriver driver) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
}