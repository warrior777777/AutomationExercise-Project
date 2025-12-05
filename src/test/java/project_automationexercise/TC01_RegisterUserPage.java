/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC01_RegisterUserPage extends BasePage {

    private final String NAME = "Automation Script";
    private final String EMAIL = "testmail7@test.com";
    private final String PASSWORD = "Password123";


    private final By homePageVerify          = By.cssSelector("img[alt='Website for automation practice']");
    private final By loginSignupBtn          = By.cssSelector("a[href='/login']");
    private final By newUserSignupText       = By.xpath("//h2[text()='New User Signup!']");
    private final By signupNameField         = By.cssSelector("input[data-qa='signup-name']");
    private final By signupEmailField       = By.cssSelector("input[data-qa='signup-email']");
    private final By signupButton            = By.cssSelector("button[data-qa='signup-button']");
    private final By accountInfoTitle        = By.xpath("//b[text()='Enter Account Information']");
    private final By titleMr                 = By.id("id_gender1");
    private final By passwordField           = By.id("password");
    private final By daysDropdown            = By.id("days");
    private final By monthsDropdown          = By.id("months");
    private final By yearsDropdown          = By.id("years");
    private final By newsletterCheckbox      = By.id("newsletter");
    private final By offersCheckbox          = By.id("optin");
    private final By firstNameField          = By.id("first_name");
    private final By lastNameField           = By.id("last_name");
    private final By companyField            = By.id("company");
    private final By address1Field           = By.id("address1");
    private final By address2Field           = By.id("address2");
    private final By countryDropdown         = By.id("country");
    private final By stateField              = By.id("state");
    private final By cityField               = By.id("city");
    private final By zipcodeField            = By.id("zipcode");
    private final By mobileField             = By.id("mobile_number");
    private final By createAccountBtn       = By.cssSelector("button[data-qa='create-account']");
    private final By accountCreatedText      = By.xpath("//b[text()='Account Created!']");
    private final By continueBtn             = By.cssSelector("a[data-qa='continue-button']");
    private final By loggedInAs              = By.xpath("//a[contains(text(),'Logged in as')]");
    private final By deleteAccountBtn        = By.cssSelector("a[href='/delete_account']");
    private final By accountDeletedText      = By.xpath("//b[text()='Account Deleted!']");

    @Test
    public void testRegisterUser() {


        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");
        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(newUserSignupText)).isDisplayed(),
                "New User Signup! text not visible");
        driver.findElement(signupNameField).sendKeys(NAME);
        driver.findElement(signupEmailField).sendKeys(EMAIL);
        wait.until(ExpectedConditions.elementToBeClickable(signupButton)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountInfoTitle)).isDisplayed(),
                "Enter Account Information not visible");
        wait.until(ExpectedConditions.elementToBeClickable(titleMr)).click();
        driver.findElement(passwordField).sendKeys(PASSWORD);
        driver.findElement(daysDropdown).sendKeys("31");
        driver.findElement(monthsDropdown).sendKeys("May");
        driver.findElement(yearsDropdown).sendKeys("2001");
        driver.findElement(newsletterCheckbox).click();
        driver.findElement(offersCheckbox).click();
        driver.findElement(firstNameField).sendKeys("Automation");
        driver.findElement(lastNameField).sendKeys("Script");
        driver.findElement(companyField).sendKeys("Test Company");
        driver.findElement(address1Field).sendKeys("123 Cairo Street");
        driver.findElement(address2Field).sendKeys("Near Maadi");
        driver.findElement(countryDropdown).sendKeys("United States");
        driver.findElement(stateField).sendKeys("Cairo");
        driver.findElement(cityField).sendKeys("Cairo");
        driver.findElement(zipcodeField).sendKeys("12345");
        driver.findElement(mobileField).sendKeys("01012345678");
        wait.until(ExpectedConditions.elementToBeClickable(createAccountBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedText)).isDisplayed(),
                "Account Created! message not visible");
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(loggedInAs)).isDisplayed(),
                "Logged in as username not visible");
        wait.until(ExpectedConditions.elementToBeClickable(deleteAccountBtn)).click();
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(accountDeletedText)).isDisplayed(),
                "Account Deleted! message not visible");
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
    }
}

 */