package project_automationexercise.base;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import project_automationexercise.utils.AllureAttachment;


import java.time.Duration;
import java.time.LocalDateTime;


public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void assertVisible(By locator, String message) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        Assert.assertTrue(driver.findElement(locator).isDisplayed(), message);
    }

    public void assertNotVisible(By locator, String message) {
        Assert.assertTrue(wait.until(ExpectedConditions.invisibilityOfElementLocated(locator)), message);
    }

    public void hoverOverElement(By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        new Actions(driver).moveToElement(element).perform();
    }

    public void assertTextNotContains(By locator, String unexpectedText, String message) {
        String actualText = wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).getText();
        Assert.assertFalse(actualText.contains(unexpectedText), message);

    }

    public void selectFromList(By locator, String visibleText) {
        WebElement dropdownElement = driver.findElement(locator);
        Select select = new Select(dropdownElement);
        select.selectByVisibleText(visibleText);
    }

    public void typeText(By locator, String text) {
        WebElement field = wait.until(ExpectedConditions.elementToBeClickable(locator));
        field.clear();
        field.sendKeys(text);
    }

    public void clickWhenReady(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void assertTextContain(By locator, String expectedText) {
        try {
            wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, expectedText));
        } catch (TimeoutException e) {
            String actualText = driver.findElement(locator).getText();
            String errorMessage = String.format(
                    "Text mismatch for element defined by [%s]. Expected to contain: [%s], but found: [%s]",
                    locator.toString(), expectedText, actualText);
            Assert.fail(errorMessage);
        }
    }

    public void takeScreenshot(String name) {
        AllureAttachment.addScreenshot(name + " - " + LocalDateTime.now());
    }

    public void assertElementCount(By locator, int expectedCount, String elementName) {
        try {
            wait.until(ExpectedConditions.numberOfElementsToBe(locator, expectedCount));
        } catch (TimeoutException e) {
            int actualCount = driver.findElements(locator).size();
            String errorMessage = String.format(
                    "Element count mismatch for '%s' (Locator: %s). Expected: %d, but found: %d",
                    elementName, locator.toString(), expectedCount, actualCount);
            Assert.fail(errorMessage);
        }
    }

    public void clickJS(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);

    }

    public void clickWithScrollJS(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", element);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void clickAndScrollWithJS(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    public void scrollAndClick(By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        new Actions(driver)
                .moveToElement(element)
                .click()
                .perform();
    }

    public String getValidationMessage(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator))
                .getAttribute("validationMessage");
    }

    public void alertConfirm() {
        wait.until(ExpectedConditions.alertIsPresent()).accept();
    }

    public void verifyFieldIsRequiredErrorMessage(By locator) {
        String message = getValidationMessage(locator);
        Assert.assertFalse(message.isEmpty(), "Expected validation message for " + locator + " but found none.");
    }

}