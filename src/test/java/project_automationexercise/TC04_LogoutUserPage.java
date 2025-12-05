/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC04_LogoutUserPage extends BasePage {

    private final String VALID_EMAIL = "testmail7@test.com";
    private final String VALID_PASSWORD = "Password123";

    private final By homePageVerify       = By.cssSelector("img[alt='Website for automation practice']");
    private final By loginSignupBtn       = By.cssSelector("a[href='/login']");
    private final By loginFormHeader      = By.xpath("//h2[text()='Login to your account']");
    private final By loginEmailField      = By.cssSelector("input[data-qa='login-email']");
    private final By loginPasswordField   = By.cssSelector("input[data-qa='login-password']");
    private final By loginButton          = By.cssSelector("button[data-qa='login-button']");
    private final By loggedInAs           = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By logoutBtn            = By.cssSelector("a[href='/logout']");
    private final By loginPageAgain       = By.xpath("//h2[text()='Login to your account']");

    @Test
    public void testLogoutUser() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");
        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loginFormHeader)).isDisplayed(),
                "Login to your account text not visible");

        driver.findElement(loginEmailField).sendKeys(VALID_EMAIL);
        driver.findElement(loginPasswordField).sendKeys(VALID_PASSWORD);

        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInAs)).isDisplayed(),
                "Logged in as username not visible");

        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loginPageAgain)).isDisplayed(),
                "User not redirected to login page after logout");
    }
}

 */