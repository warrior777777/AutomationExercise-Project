/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC21_AddReviewOnProductPage extends BasePage {

    private final By productsBtn              = By.cssSelector("a[href='/products']");
    private final By allProductsHeader        = By.xpath("//h2[text()='All Products']");
    private final By firstViewProductBtn      = By.xpath("(//a[@href='/product_details/1'])[1]");
    private final By writeYourReviewHeader    = By.xpath("//a[text()='Write Your Review']");
    private final By reviewNameField          = By.id("name");
    private final By reviewEmailField         = By.id("email");
    private final By reviewTextArea           = By.id("review");
    private final By reviewSubmitBtn          = By.id("button-review");
    private final By reviewSuccessMessage     = By.xpath("//span[text()='Thank you for your review.']");

    @Test
    public void testAddReviewOnProduct() {

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeader)).isDisplayed(),
                "All Products page not loaded");

        wait.until(ExpectedConditions.elementToBeClickable(firstViewProductBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(writeYourReviewHeader)).isDisplayed(),
                "Write Your Review section not visible");

        driver.findElement(reviewNameField).sendKeys("Ahmed Tester");
        driver.findElement(reviewEmailField).sendKeys("ahmed@test.com");
        driver.findElement(reviewTextArea).sendKeys("Great product, fast delivery, highly recommended!");

        wait.until(ExpectedConditions.elementToBeClickable(reviewSubmitBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(reviewSuccessMessage)).isDisplayed(),
                "Thank you for your review message not visible");
    }
}

 */