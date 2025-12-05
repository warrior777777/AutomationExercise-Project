/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC05_RegisterUserWithExistingEmailPage extends BasePage {

    private final String EXISTING_EMAIL = "testmail7@test.com";

    private final By homePageVerify       = By.cssSelector("img[alt='Website for automation practice']");
    private final By loginSignupBtn       = By.cssSelector("a[href='/login']");
    private final By newUserSignupText    = By.xpath("//h2[text()='New User Signup!']");
    private final By signupNameField      = By.cssSelector("input[data-qa='signup-name']");
    private final By signupEmailField     = By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton         = By.cssSelector("button[data-qa='signup-button']");
    private final By emailExistsError     = By.xpath("//p[text()='Email Address already exist!']");

    @Test
    public void testRegisterWithExistingEmail() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(newUserSignupText)).isDisplayed(),
                "New User Signup! text not visible");

        driver.findElement(signupNameField).sendKeys("Any Name");
        driver.findElement(signupEmailField).sendKeys(EXISTING_EMAIL);

        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(emailExistsError)).isDisplayed(),
                "Error message 'Email Address already exist!' not visible");
    }
}

 */