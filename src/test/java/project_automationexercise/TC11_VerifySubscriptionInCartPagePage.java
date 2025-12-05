/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC11_VerifySubscriptionInCartPagePage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By cartBtn                  = By.cssSelector("a[href='/view_cart']");
    private final By subscriptionText         = By.xpath("//h2[text()='Subscription']");
    private final By subscriptionEmailInput   = By.id("susbscribe_email");
    private final By subscriptionArrowBtn     = By.id("subscribe");
    private final By successMessage           = By.xpath("//div[contains(text(),'You have been successfully subscribed!')]");

    @Test
    public void testVerifySubscriptionInCartPage() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();

        driver.findElement(By.tagName("body")).sendKeys(org.openqa.selenium.Keys.END);

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(subscriptionText)).isDisplayed(),
                "SUBSCRIPTION text not visible in Cart page footer");

        driver.findElement(subscriptionEmailInput).sendKeys("testcart@test.com");

        wait.until(ExpectedConditions.elementToBeClickable(subscriptionArrowBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(successMessage)).isDisplayed(),
                "Success message 'You have been successfully subscribed!' not visible");
    }
}

 */