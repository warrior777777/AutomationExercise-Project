package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.CartPage;
import project_automationexercise.pages.ProductsPage;

public class TC22_AddMultipleProductsAndVerify extends BaseTest {

    private ProductsPage productsPage;
    private CartPage cartPage;

    @Test(priority = 1, description = "Positive: Add multiple different products to cart")
    public void testAddMultipleDifferentProducts() {
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);

        productsPage
                .navigateToProductsPage()
                .addFirstProductToCart()
                .verifyAddedProductAndContinue();

        productsPage
                .searchForProduct("T-shirt")
                .verifySearchedProducts()
                .addSecondProductToCart()
                .verifyAddedProductAndViewCart();
        cartPage
                .verifyCartPageVisible()
                .verifyCartHasItem(2);
    }
}
