package project_automationexercise.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import project_automationexercise.utils.AllureAttachment;

import java.time.Duration;

public class BaseTest {

    private static final ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();

    protected WebDriver driver;

    public WebDriver getDriver() {
        return tlDriver.get();
    }

    @BeforeMethod
    @Parameters({"browser"})
    public void setUp(@Optional("edge") String browser) {
        WebDriver currentDriver;
        boolean isHeadless = Boolean.parseBoolean(System.getProperty("headless"));

        if (browser.equalsIgnoreCase("chrome")) {
            ChromeOptions options = new ChromeOptions();
            if (isHeadless) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }
            currentDriver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("firefox")) {
            FirefoxOptions options = new FirefoxOptions();
            if (isHeadless) {
                options.addArguments("-headless");
                options.addArguments("--window-size=1920,1080");
            }
            currentDriver = new FirefoxDriver(options);

        } else {
            EdgeOptions options = new EdgeOptions();
            if (isHeadless) {
                options.addArguments("--headless=new");
                options.addArguments("--window-size=1920,1080");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-dev-shm-usage");
            }
            currentDriver = new EdgeDriver(options);
        }

        tlDriver.set(currentDriver);

        this.driver = currentDriver;

        AllureAttachment.setDriver(getDriver());

        if (!isHeadless) {
            getDriver().manage().window().maximize();
        }

        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        getDriver().get("https://automationexercise.com/");
    }

    @AfterMethod
    public void tearDown(ITestResult result) {
        WebDriver driver = tlDriver.get();
        if (ITestResult.FAILURE == result.getStatus()) {
            AllureAttachment.addScreenshot("Screenshot Failure - " + result.getName());
        }
        if (driver != null) {
            driver.quit();
        }
        tlDriver.remove();
    }
}