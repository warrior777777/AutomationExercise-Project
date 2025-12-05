/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC10_VerifySubscriptionInHomePagePage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By subscriptionText         = By.xpath("//h2[text()='Subscription']");
    private final By subscriptionEmailInput   = By.id("subscribe_email");
    private final By subscriptionArrowBtn     = By.id("subscribe");
    private final By successMessage           = By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");

    @Test
    public void testVerifySubscriptionInHomePage() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        driver.findElement(By.tagName("body")).sendKeys(org.openqa.selenium.Keys.END);

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(subscriptionText)).isDisplayed(),
                "SUBSCRIPTION text not visible in footer");

        driver.findElement(subscriptionEmailInput).sendKeys("testsub@test.com");

        wait.until(ExpectedConditions.elementToBeClickable(subscriptionArrowBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed(),
                "Success message 'You have been successfully subscribed!' not visible");
    }
}

 */