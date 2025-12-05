/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC08_VerifyAllProductsAndProductDetailPage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By productsBtn              = By.cssSelector("a[href='/products']");
    private final By allProductsHeader        = By.xpath("//h2[text()='All Products']");
    private final By productsList             = By.cssSelector(".features_items .col-sm-4");
    private final By firstProductViewBtn      = By.xpath("(//a[@class='btn btn-default add-to-cart' and contains(@href,'product_details')])[1]");
    private final By productName              = By.xpath("//div[@class='product-information']//h2");
    private final By productCategory         = By.xpath("//div[@class='product-information']//p[contains(text(),'Category:')]");
    private final By productPrice            = By.xpath("//div[@class='product-information']//span/span");
    private final By productAvailability     = By.xpath("//div[@class='product-information']//p[contains(text(),'Availability:')]");
    private final By productCondition        = By.xpath("//div[@class='product-information']//p[contains(text(),'Condition:')]");
    private final By productBrand            = By.xpath("//div[@class='product-information']//p[contains(text(),'Brand:')]");

    @Test
    public void testVerifyAllProductsAndProductDetail() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeader)).isDisplayed(),
                "All Products page not loaded");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productsList)).isDisplayed(),
                "Products list is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstProductViewBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productName)).isDisplayed(),
                "Product name not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productCategory)).isDisplayed(),
                "Product category not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productPrice)).isDisplayed(),
                "Product price not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productAvailability)).isDisplayed(),
                "Product availability not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productCondition)).isDisplayed(),
                "Product condition not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(productBrand)).isDisplayed(),
                "Product brand not visible");
    }
}

 */