/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC09_SearchProductPage extends BasePage {

    private final By homePageVerify        = By.cssSelector("img[alt='Website for automation practice']");
    private final By productsBtn           = By.cssSelector("a[href='/products']");
    private final By allProductsHeader     = By.xpath("//h2[text()='All Products']");
    private final By searchInput           = By.id("search_product");
    private final By searchButton          = By.id("submit_search");
    private final By searchedProductsText  = By.xpath("//h2[text()='Searched Products']");
    private final By searchedProductsList  = By.cssSelector(".features_items .productinfo");

    @Test
    public void testSearchProduct() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(allProductsHeader)).isDisplayed(),
                "All Products page not loaded");

        driver.findElement(searchInput).sendKeys("t-shirt");

        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(searchedProductsText)).isDisplayed(),
                "SEARCHED PRODUCTS text not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(searchedProductsList)).size() > 0,
                "No products found related to search keyword");

        Assert.assertTrue(driver.findElement(searchedProductsList).getText().toLowerCase().contains("t-shirt"),
                "Search results do not contain the searched keyword");
    }
}

 */