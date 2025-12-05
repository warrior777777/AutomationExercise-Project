package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.ProductsPage;

public class TC09_SearchProductValidation extends BaseTest {

    private ProductsPage productsPage;

    @Test(priority = 1, description = "Search Product - Positive: Search for existing product")
    public void testSearchExistingProduct() {
        productsPage = new ProductsPage(driver);
        productsPage
                .navigateToProductsPage()
                .verifyAllProductsPageVisible()
                .searchForProduct("Dress")
                .verifySearchedProducts();
    }

    @Test(priority = 2, description = "Search Product - Negative: Search for non-existent product")
    public void testSearchNonExistentProduct() {
        productsPage = new ProductsPage(driver);
        productsPage
                .navigateToProductsPage()
                .searchForProduct("SuperMegaNonExistentItem123")
                .verifyNoProductsFound();
    }

    @Test(priority = 3, description = "Search Product - Negative: SQL Injection Attempt")
    public void testSearchSQLInjection() {
        productsPage = new ProductsPage(driver);
        productsPage
                .navigateToProductsPage()
                .searchForProduct("' OR '1'='1")
                .verifyNoProductsFound();
    }

    @Test(priority = 4, description = "Search Product - Negative: Empty Search")
    public void testSearchEmpty() {
        productsPage = new ProductsPage(driver);
        productsPage
                .navigateToProductsPage()
                .searchForProduct("")
                .verifyAllProductsPageVisible();
    }
}