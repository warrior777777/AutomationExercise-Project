/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC23_VerifyAddressDetailsInCheckoutPagePage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By loginSignupBtn           = By.cssSelector("a[href='/login']");
    private final By signupName               = By.cssSelector("input[data-qa='signup-name']");
    private final By signupEmail              = By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton             = By.cssSelector("button[data-qa='signup-button']");
    private final By titleMr                  = By.id("id_gender1");
    private final By passwordField            = By.id("password");
    private final By days                     = By.id("days");
    private final By months                   = By.id("months");
    private final By years                    = By.id("years");
    private final By firstName                = By.id("first_name");
    private final By lastName                 = By.id("last_name");
    private final By company                  = By.id("company");
    private final By address1                 = By.id("address1");
    private final By address2                 = By.id("address2");
    private final By country                  = By.id("country");
    private final By state                    = By.id("state");
    private final By city                     = By.id("city");
    private final By zipcode                  = By.id("zipcode");
    private final By mobile                   = By.id("mobile_number");
    private final By createAccountBtn        = By.cssSelector("button[data-qa='create-account']");
    private final By accountCreated           = By.xpath("//b[text()='Account Created!']");
    private final By continueAfterCreate      = By.cssSelector("a[data-qa='continue-button']");
    private final By loggedInAs               = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By firstAddToCart           = By.xpath("(//a[@data-product-id='1'])[1]");
    private final By continueShopping         = By.cssSelector(".btn-success.close-modal");
    private final By cartBtn                  = By.cssSelector("a[href='/view_cart']");
    private final By proceedToCheckout        = By.cssSelector(".check_out");

    // Address locators in checkout page
    private final By deliveryAddressTitle    = By.xpath("//h3[text()='Review Your Order']/following-sibling::div//li[contains(text(),'Mr.')]");
    private final By deliveryAddressName      = By.xpath("//ul[@class='address item box']//li[contains(text(),'Mr.')]/following-sibling::li[1]");
    private final By deliveryAddressLine1     = By.xpath("//ul[@class='address item box']//li[contains(text(),'Mr.')]/following-sibling::li[3]");
    private final By deliveryCityStateZip     = By.xpath("//ul[@class='address item box']//li[contains(text(),'Mr.')]/following-sibling::li[5]");
    private final By deliveryCountry          = By.xpath("//ul[@class='address item box']//li[contains(text(),'Mr.')]/following-sibling::li[6]");

    private final By billingAddressTitle      = By.xpath("//h3[text()='Review Your Order']/following::ul[@class='address alternate_item']//li[contains(text(),'Mr.')]");
    private final By billingAddressName       = By.xpath("//ul[@class='address alternate_item']//li[contains(text(),'Mr.')]/following-sibling::li[1]");
    private final By billingAddressLine1      = By.xpath("//ul[@class='address alternate_item']//li[contains(text(),'Mr.')]/following-sibling::li[3]");
    private final By billingCityStateZip      = By.xpath("//ul[@class='address alternate_item']//li[contains(text(),'Mr.')]/following-sibling::li[5]");
    private final By billingCountry           = By.xpath("//ul[@class='address alternate_item']//li[contains(text(),'Mr.')]/following-sibling::li[6]");

    private final By deleteAccountBtn         = By.cssSelector("a[href='/delete_account']");
    private final By accountDeleted           = By.xpath("//b[text()='Account Deleted!']");

    @Test
    public void testVerifyAddressDetailsInCheckoutPage() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();

        String uniqueName = "TestUser" + System.currentTimeMillis();
        String uniqueEmail = "user" + System.currentTimeMillis() + "@test.com";

        driver.findElement(signupName).sendKeys(uniqueName);
        driver.findElement(signupEmail).sendKeys(uniqueEmail);
        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(titleMr)).click();
        driver.findElement(passwordField).sendKeys("Pass12345");
        driver.findElement(days).sendKeys("10");
        driver.findElement(months).sendKeys("May");
        driver.findElement(years).sendKeys("1995");
        driver.findElement(firstName).sendKeys("Test");
        driver.findElement(lastName).sendKeys("User");
        driver.findElement(company).sendKeys("Test Corp");
        driver.findElement(address1).sendKeys("123 Automation Street");
        driver.findElement(address2).sendKeys("Near Testing Center");
        driver.findElement(country).sendKeys("Canada");
        driver.findElement(state).sendKeys("Ontario");
        driver.findElement(city).sendKeys("Toronto");
        driver.findElement(zipcode).sendKeys("M5V 2T6");
        driver.findElement(mobile).sendKeys("01234567890");
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreated)).isDisplayed(),
                "Account not created");
        wait.until(ExpectedConditions.elementToBeClickable(continueAfterCreate)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInAs)).isDisplayed(),
                "User not logged in");

        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();
        wait.until(ExpectedConditions.elementToBeClickable(proceedToCheckout)).click();

        // Verify Delivery Address matches registration
        Assert.assertTrue(driver.findElement(deliveryAddressName).getText().contains("Test User"),
                "Delivery address name doesn't match");
        Assert.assertTrue(driver.findElement(deliveryAddressLine1).getText().contains("123 Automation Street"),
                "Delivery address line 1 doesn't match");
        Assert.assertTrue(driver.findElement(deliveryCityStateZip).getText().contains("Toronto Ontario M5V 2T6"),
                "Delivery city/state/zip doesn't match");
        Assert.assertTrue(driver.findElement(deliveryCountry).getText().contains("Canada"),
                "Delivery country doesn't match");

        // Verify Billing Address matches registration
        Assert.assertTrue(driver.findElement(billingAddressName).getText().contains("Test User"),
                "Billing address name doesn't match");
        Assert.assertTrue(driver.findElement(billingAddressLine1).getText().contains("123 Automation Street"),
                "Billing address line 1 doesn't match");
        Assert.assertTrue(driver.findElement(billingCityStateZip).getText().contains("Toronto Ontario M5V 2T6"),
                "Billing city/state/zip doesn't match");
        Assert.assertTrue(driver.findElement(billingCountry).getText().contains("Canada"),
                "Billing country doesn't match");

        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeleted)).isDisplayed(),
                "Account not deleted");
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[data-qa='continue-button']"))).click();
    }
}

 */