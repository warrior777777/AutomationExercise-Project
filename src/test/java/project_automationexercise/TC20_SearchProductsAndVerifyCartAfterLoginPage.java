/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC20_SearchProductsAndVerifyCartAfterLoginPage extends BasePage {

    private final String VALID_EMAIL = "testmail7@test.com";
    private final String VALID_PASSWORD = "Password123";

    private final By productsBtn              = By.cssSelector("a[href='/products']");
    private final By allProductsHeader        = By.xpath("//h2[text()='All Products']");
    private final By searchInput              = By.id("search_product");
    private final By searchButton             = By.id("submit_search");
    private final By searchedProductsText    = By.xpath("//h2[text()='Searched Products']");
    private final By searchedProductsList     = By.cssSelector(".features_items .productinfo");
    private final By firstSearchedAddToCart   = By.xpath("(//div[@class='productinfo text-center']/a[contains(@data-product-id,'')])[1]");
    private final By secondSearchedAddToCart  = By.xpath("(//div[@class='productinfo text-center']/a[contains(@data-product-id,'')])[2]");
    private final By continueShopping         = By.cssSelector(".btn-success.close-modal");
    private final By viewCartBtn              = By.cssSelector("a[href='/view_cart'] u");
    private final By cartProductRows          = By.cssSelector("#cart_info_table tbody tr");
    private final By loginSignupBtn           = By.cssSelector("a[href='/login']");
    private final By loginEmailField          = By.cssSelector("input[data-qa='login-email']");
    private final By loginPasswordField       = By.cssSelector("input[data-qa='login-password']");
    private final By loginButton              = By.cssSelector("button[data-qa='login-button']");

    @Test
    public void testSearchProductsAndVerifyCartAfterLogin() {

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeader)).isDisplayed(),
                "All Products page not loaded");

        driver.findElement(searchInput).sendKeys("t-shirt");
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(searchedProductsText)).isDisplayed(),
                "SEARCHED PRODUCTS text not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchedProductsList)).size() > 0,
                "No searched products visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstSearchedAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(continueShopping)).click();

        wait.until(ExpectedConditions.elementToBeClickable(secondSearchedAddToCart)).click();
        wait.until(ExpectedConditions.elementToBeClickable(viewCartBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cartProductRows)).size() >= 2,
                "Products not added to cart");

        wait.until(ExpectedConditions.elementToBeClickable(loginSignupBtn)).click();

        driver.findElement(loginEmailField).sendKeys(VALID_EMAIL);
        driver.findElement(loginPasswordField).sendKeys(VALID_PASSWORD);
        wait.until(ExpectedConditions.elementToBeClickable(loginButton)).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("a[href='/view_cart']"))).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cartProductRows)).size() >= 2,
                "Products disappeared from cart after login");
    }
}

 */