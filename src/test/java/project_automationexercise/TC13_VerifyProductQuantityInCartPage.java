/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC13_VerifyProductQuantityInCartPage extends BasePage {

    private final By homePageVerify         = By.cssSelector("img[alt='Website for automation practice']");
    private final By firstProductViewBtn    = By.xpath("(//a[@class='btn btn-default add-to-cart' and contains(@href,'product_details')])[1]");
    private final By productDetailTitle     = By.xpath("//div[@class='product-information']//h2");
    private final By quantityInput          = By.id("quantity");
    private final By addToCartBtn           = By.cssSelector("button.cart");
    private final By viewCartBtn            = By.cssSelector("a[href='/view_cart'] u");
    private final By cartQuantity           = By.xpath("//tr[@id='product-1']//button[@class='disabled']");

    @Test
    public void testVerifyProductQuantityInCart() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstProductViewBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productDetailTitle)).isDisplayed(),
                "Product detail page not opened");

        driver.findElement(quantityInput).clear();
        driver.findElement(quantityInput).sendKeys("4");

        wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();

        Assert.assertEquals(driver.findElement(cartQuantity).getText(), "4",
                "Product quantity in cart is not 4");
    }
}

 */