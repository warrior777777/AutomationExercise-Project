/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC17_RemoveProductsFromCartPage extends BasePage {

    private final By homePageVerify     = By.cssSelector("img[alt='Website for automation practice']");
    private final By firstAddToCart     = By.xpath("(//a[@data-product-id='1'])[1]");
    private final By continueShopping   = By.cssSelector(".btn-success.close-modal");
    private final By cartBtn            = By.cssSelector("a[href='/view_cart']");
    private final By cartPageTitle      = By.xpath("//h2[contains(text(),'Shopping Cart')]");
    private final By removeFirstProduct = By.xpath("(//a[@class='cart_quantity_delete'])[1]");
    private final By emptyCartMessage   = By.xpath("//span[@id='empty_cart']//p");

    @Test
    public void testRemoveProductFromCart() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();

        wait.until(ExpectedConditions.elementToBeClickable(cartBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(cartPageTitle)).isDisplayed(),
                "Cart page is not displayed");

        wait.until(ExpectedConditions.elementToBeClickable(removeFirstProduct)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(emptyCartMessage)).isDisplayed(),
                "Product is not removed from the cart");
    }
}

 */