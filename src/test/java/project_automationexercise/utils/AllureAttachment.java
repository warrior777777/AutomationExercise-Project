package project_automationexercise.utils;

import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AllureAttachment {

    private static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        AllureAttachment.driver = driver;
    }

    public static void addScreenshot(String name) {
        if (driver != null) {
            byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.getLifecycle().addAttachment(name, "image/png", ".png", screenshot);
        }
    }
}