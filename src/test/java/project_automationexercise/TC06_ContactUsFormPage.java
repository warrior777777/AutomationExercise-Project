/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC06_ContactUsFormPage extends BasePage {

    private final By homePageVerify        = By.cssSelector("img[alt='Website for automation practice']");
    private final By contactUsBtn          = By.cssSelector("a[href='/contact_us']");
    private final By getInTouchHeader      = By.xpath("//h2[text()='Get In Touch']");
    private final By nameField             = By.cssSelector("input[data-qa='name']");
    private final By emailField            = By.cssSelector("input[data-qa='email']");
    private final By subjectField          = By.cssSelector("input[data-qa='subject']");
    private final By messageField          = By.cssSelector("textarea[data-qa='message']");
    private final By uploadFile            = By.name("upload_file");
    private final By submitBtn             = By.cssSelector("input[data-qa='submit-button']");
    private final By successMessage        = By.xpath("//div[@class='status alert alert-success']");
    private final By homeBtn               = By.cssSelector("a[href='/'] span");
    private final String EMAIL             = "test@gmail.com";
    private final String NAME              = "testy";



    @Test
    public void testContactUsForm() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");
        wait.until(ExpectedConditions.elementToBeClickable(contactUsBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(getInTouchHeader)).isDisplayed(),
                "GET IN TOUCH header not visible");
        driver.findElement(nameField).sendKeys(EMAIL);
        driver.findElement(emailField).sendKeys(NAME);
        driver.findElement(subjectField).sendKeys("Test Subject Automation");
        driver.findElement(messageField).sendKeys("This is an automated test message for Contact Us form.");
        driver.findElement(uploadFile).sendKeys(System.getProperty("user.dir") + "/src/test/resources/testfile.txt");
        wait.until(ExpectedConditions.elementToBeClickable(submitBtn)).click();
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed(),
                "Success message not visible");
        wait.until(ExpectedConditions.elementToBeClickable(homeBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Not redirected back to home page");
    }
}

 */