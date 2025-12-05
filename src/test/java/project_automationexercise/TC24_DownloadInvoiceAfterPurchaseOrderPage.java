/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

import java.io.File;

public class TC24_DownloadInvoiceAfterPurchaseOrderPage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By firstAddToCart           = By.xpath("(//a[@data-product-id='1'])[1]");
    private final By continueShopping         = By.cssSelector(".btn-success.close-modal");
    private final By cartBtn                  = By.cssSelector("a[href='/view_cart']");
    private final By proceedToCheckout        = By.cssSelector(".check_out");
    private final By registerLoginBtn         = By.cssSelector("a[href='/login'] u");
    private final By signupName               = By.cssSelector("input[data-qa='signup-name']");
    private final By signupEmail              = By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton             = By.cssSelector("button[data-qa='signup-button']");
    private final By titleMr                  = By.id("id_gender1");
    private final By passwordField            = By.id("password");
    private final By days                     = By.id("days");
    private final By months                   = By.id("months");
    private final By years                    = By.id("years");
    private final By newsletter               = By.id("newsletter");
    private final By firstName                = By.id("first_name");
    private final By lastName                 = By.id("last_name");
    private final By address1                 = By.id("address1");
    private final By country                  = By.id("country");
    private final By state                    = By.id("state");
    private final By city                     = By.id("city");
    private final By zipcode                  = By.id("zipcode");
    private final By mobile                   = By.id("mobile_number");
    private final By createAccountBtn        = By.cssSelector("button[data-qa='create-account']");
    private final By accountCreated           = By.xpath("//b[text()='Account Created!']");
    private final By continueAfterCreate      = By.cssSelector("a[data-qa='continue-button']");
    private final By loggedInAs               = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By commentArea              = By.cssSelector(".form-control");
    private final By placeOrderBtn            = By.cssSelector("a[href='/payment']");
    private final By nameOnCard               = By.cssSelector("input[data-qa='name-on-card']");
    private final By cardNumber               = By.cssSelector("input[data-qa='card-number']");
    private final By cvc                      = By.cssSelector("input[data-qa='cvc']");
    private final By expiryMonth              = By.cssSelector("input[data-qa='expiry-month']");
    private final By expiryYear               = By.cssSelector("input[data-qa='expiry-year']");
    private final By payConfirmBtn            = By.id("submit");
    private final By orderSuccess             = By.xpath("//p[contains(text(),'Your order has been placed successfully')]");
    private final By downloadInvoiceBtn      = By.cssSelector("a[href='/download_invoice/']");
    private final By continueAfterInvoice     = By.cssSelector(".pull-right a[href='/']");
    private final By deleteAccountBtn         = By.cssSelector("a[href='/delete_account']");
    private final By accountDeleted           = By.xpath("//b[text()='Account Deleted!']");

    @Test
    public void testDownloadInvoiceAfterPurchaseOrder() throws InterruptedException {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();
        wait.until(ExpectedConditions.elementToBeClickable(registerLoginBtn)).click();

        String uniqueName = "User" + System.currentTimeMillis();
        String uniqueEmail = "inv" + System.currentTimeMillis() + "@test.com";

        driver.findElement(signupName).sendKeys(uniqueName);
        driver.findElement(signupEmail).sendKeys(uniqueEmail);
        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(titleMr)).click();
        driver.findElement(passwordField).sendKeys("Pass12345");
        driver.findElement(days).sendKeys("5");
        driver.findElement(months).sendKeys("May");
        driver.findElement(years).sendKeys("1990");
        driver.findElement(newsletter).click();
        driver.findElement(firstName).sendKeys("Invoice");
        driver.findElement(lastName).sendKeys("Test");
        driver.findElement(address1).sendKeys("456 Cairo Road");
        driver.findElement(country).sendKeys("India");
        driver.findElement(state).sendKeys("Cairo");
        driver.findElement(city).sendKeys("Cairo");
        driver.findElement(zipcode).sendKeys("11511");
        driver.findElement(mobile).sendKeys("01098765432");
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreated)).isDisplayed(),
                "Account not created");
        wait.until(ExpectedConditions.elementToBeClickable(continueAfterCreate)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInAs)).isDisplayed(),
                "User not logged in");

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();

        driver.findElement(commentArea).sendKeys("Download invoice test");
        wait.until(ExpectedConditions.elementToBeClickable(placeOrderBtn)).click();

        driver.findElement(nameOnCard).sendKeys("Invoice Test");
        driver.findElement(cardNumber).sendKeys("4242424242424242");
        driver.findElement(cvc).sendKeys("123");
        driver.findElement(expiryMonth).sendKeys("12");
        driver.findElement(expiryYear).sendKeys("2030");
        wait.until(ExpectedConditions.elementToBeClickable(payConfirmBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(orderSuccess)).isDisplayed(),
                "Order not placed successfully");

        // Download Invoice
        wait.until(ExpectedConditions.elementToBeClickable(downloadInvoiceBtn)).click();
        Thread.sleep(3000); // Wait for download to start

        File downloadDir = new File(System.getProperty("user.dir") + "/downloads");
        File[] files = downloadDir.listFiles((dir, name) -> name.startsWith("invoice"));
        Assert.assertNotNull(files, "Invoice file not found");
        Assert.assertTrue(files.length > 0, "Invoice was not downloaded");

        wait.until(ExpectedConditions.elementToBeClickable(continueAfterInvoice)).click();

        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeleted)).isDisplayed(),
                "Account not deleted");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-qa='continue-button']"))).click();
    }
}

 */