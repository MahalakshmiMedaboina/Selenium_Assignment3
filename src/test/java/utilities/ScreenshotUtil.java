package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static String takeScreenshot(WebDriver driver, String testName) throws IOException {

        TakesScreenshot ts = (TakesScreenshot) driver;

        File source = ts.getScreenshotAs(OutputType.FILE);

        String path = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";

        File dest = new File(path);

        FileUtils.copyFile(source, dest);

        return path;
    }
}