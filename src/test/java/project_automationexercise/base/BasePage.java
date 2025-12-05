package project_automationexercise.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import project_automationexercise.utils.AllureAttachment;


import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

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

    public void takeScreenshot(String name) {
        AllureAttachment.addScreenshot(name + " - " + LocalDateTime.now());
    }
    public void  assertElementCount(By locator, int expectedCount, String message){
        List<WebElement> elements = driver.findElements(locator);
        Assert.assertEquals(elements.size(), expectedCount, message);
    }
    public void clickWithScrollJS (By locator) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",element);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void clickWithJS(By locator) {
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
    public void verifyFieldIsRequiredErrorMessage(By locator) {
        String message = getValidationMessage(locator);
        Assert.assertFalse(message.isEmpty(), "Expected validation message for " + locator + " but found none.");
    }

}