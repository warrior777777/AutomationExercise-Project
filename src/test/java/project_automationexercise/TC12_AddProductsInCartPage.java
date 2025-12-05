/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC12_AddProductsInCartPage extends BasePage {

    private final By homePageVerify          = By.cssSelector("img[alt='Website for automation practice']");
    private final By productsBtn             = By.cssSelector("a[href='/products']");
    private final By firstProductHover       = By.xpath("(//div[@class='productinfo text-center'])[1]/img");
    private final By firstAddToCartBtn       = By.xpath("(//a[@data-product-id='1'])[1]");
    private final By continueShoppingBtn     = By.cssSelector(".btn-success.close-modal");
    private final By secondProductHover      = By.xpath("(//div[@class='productinfo text-center'])[2]/img");
    private final By secondAddToCartBtn      = By.xpath("(//a[@data-product-id='2'])[1]");
    private final By viewCartBtn             = By.cssSelector("a[href='/view_cart'] u");
    private final By cartProductRows         = By.cssSelector("#cart_info_table tbody tr");
    private final By firstProductPrice       = By.xpath("//tr[@id='product-1']//td[@class='cart_price']/p");
    private final By firstProductQuantity    = By.xpath("//tr[@id='product-1']//button[@class='disabled']");
    private final By firstProductTotal       = By.xpath("//tr[@id='product-1']//td[@class='cart_total']/p");
    private final By secondProductPrice      = By.xpath("//tr[@id='product-2']//td[@class='cart_price']/p");
    private final By secondProductQuantity   = By.xpath("//tr[@id='product-2']//button[@class='disabled']");
    private final By secondProductTotal      = By.xpath("//tr[@id='product-2']//td[@class='cart_total']/p");

    @Test
    public void testAddProductsInCart() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

       // new Actions(driver)
       //         .moveToElement(driver.findElement(firstProductHover))
       //         .perform();

       // WebElement firstAddToCartBtn = driver.findElement(firstAddToCartBtn);
       // JavascriptExecutor Js = (JavascriptExecutor) driver;
       // Js.executeScript("arguments[0].scrollIntoView(true),Click();");

        WebElement firstProduct = driver.findElement(firstProductHover);
        JavascriptExecutor Js = (JavascriptExecutor) driver;
        Js.executeScript("arguments[0].scrollIntoView(true);",firstProduct);
        Js.executeScript("arguments[0].click();", firstProduct);


       // scrollToElementAndHover(firstProductHover);
      //  clickWithJS(firstAddToCartBtn);
       // wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(firstAddToCartBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(continueShoppingBtn)).click();

        new Actions(driver).moveToElement(driver.findElement(secondProductHover)).perform();

        wait.until(ExpectedConditions.elementToBeClickable(secondAddToCartBtn)).click();

        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cartProductRows)).size() == 2,
                "Both products are not added to cart");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductPrice)).isDisplayed(),
                "First product price not visible");

        Assert.assertEquals(driver.findElement(firstProductQuantity).getText(), "1",
                "First product quantity is not 1");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(firstProductTotal)).isDisplayed(),
                "First product total price not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(secondProductPrice)).isDisplayed(),
                "Second product price not visible");

        Assert.assertEquals(driver.findElement(secondProductQuantity).getText(), "1",
                "Second product quantity is not 1");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(secondProductTotal)).isDisplayed(),
                "Second product total price not visible");
    }
}

 */