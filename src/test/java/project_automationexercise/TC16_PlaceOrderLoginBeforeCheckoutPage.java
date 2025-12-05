/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC16_PlaceOrderLoginBeforeCheckoutPage extends BasePage {

    private final String VALID_EMAIL = "testmail7@test.com";
    private final String VALID_PASSWORD = "Password123";

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By loginSignupBtn           = By.cssSelector("a[href='/login']");
    private final By loginEmailField          = By.cssSelector("input[data-qa='login-email']");
    private final By loginPasswordField       = By.cssSelector("input[data-qa='login-password']");
    private final By loginButton              = By.cssSelector("button[data-qa='login-button']");
    private final By loggedInAs               = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By firstAddToCart           = By.xpath("(//a[@data-product-id='1'])[1]");
    private final By secondAddToCart          = By.xpath("(//a[@data-product-id='2'])[1]");
    private final By continueShopping         = By.cssSelector(".btn-success.close-modal");
    private final By cartBtn                  = By.cssSelector("a[href='/view_cart']");
    private final By proceedToCheckout        = By.cssSelector(".check_out");
    private final By commentArea              = By.cssSelector(".form-control");
    private final By placeOrderBtn            = By.cssSelector("a[href='/payment']");
    private final By nameOnCard               = By.cssSelector("input[data-qa='name-on-card']");
    private final By cardNumber               = By.cssSelector("input[data-qa='card-number']");
    private final By cvc                      = By.cssSelector("input[data-qa='cvc']");
    private final By expiryMonth              = By.cssSelector("input[data-qa='expiry-month']");
    private final By expiryYear               = By.cssSelector("input[data-qa='expiry-year']");
    private final By payConfirmBtn            = By.id("submit");
    private final By orderSuccess             = By.xpath("//p[contains(text(),'Your order has been placed successfully')]");
    private final By deleteAccountBtn         = By.cssSelector("a[href='/delete_account']");
    private final By accountDeleted           = By.xpath("//b[text()='Account Deleted!']");

    @Test
    public void testPlaceOrderLoginBeforeCheckout() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();

        driver.findElement(loginEmailField).sendKeys(VALID_EMAIL);
        driver.findElement(loginPasswordField).sendKeys(VALID_PASSWORD);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInAs)).isDisplayed(),
                "User not logged in");

        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();
        wait.until(ExpectedConditions.elementToBeClickable(secondAddToCart)).click();

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();

        driver.findElement(commentArea).sendKeys("Login before checkout - automated order");
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();

        driver.findElement(nameOnCard).sendKeys("Test User");
        driver.findElement(cardNumber).sendKeys("4242424242424242");
        driver.findElement(cvc).sendKeys("123");
        driver.findElement(expiryMonth).sendKeys("11");
        driver.findElement(expiryYear).sendKeys("2029");
        wait.until(ExpectedConditions.elementToBeClickable(payConfirmBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(orderSuccess)).isDisplayed(),
                "Order not placed successfully");

        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeleted)).isDisplayed(),
                "Account not deleted");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-qa='continue-button']"))).click();
    }
}

 */