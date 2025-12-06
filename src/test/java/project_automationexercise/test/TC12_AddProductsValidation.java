package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.CartPage;
import project_automationexercise.pages.ProductsPage;

public class TC12_AddProductsValidation extends BaseTest {

    private ProductsPage productsPage;
    private CartPage cartPage;

    @Test(priority = 1, description = "Positive: Add Product and Verify in Cart")
    public void testAddProductToCart() {
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);

        productsPage
                .navigateToProductsPage()
                .addFirstProductToCart()
                .verifyAddedProductAndContinue()
                .clickViewCart();

        cartPage
                .verifyCartPageVisible()
                .verifyCartHasItem(1);
    }

    @Test(priority = 2, description = "Negative: Verify Cart is Empty Initially")
    public void testCartIsEmptyInitially() {
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);

        productsPage
                .navigateToCartPage();

        cartPage
                .verifyCartPageVisible()
                .verifyCartIsEmpty();
    }

    @Test(priority = 3, description = "Logic Flow: Add Product then Remove it")
    public void testAddAndRemoveProduct() {
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);

        productsPage
                .navigateToProductsPage()
                .addFirstProductToCart()
                .clickViewCart();

        cartPage
                .verifyCartPageVisible()
                .removeProduct()
                .verifyCartIsEmpty();
    }

    @Test(priority = 4, description = "UI Flow: Continue Shopping Button")
    public void testContinueShoppingFlow() {
        productsPage = new ProductsPage(driver);

        productsPage
                .navigateToProductsPage()
                .addFirstProductToCart()
                .verifyAddedProductAndContinue()
                .verifyAllProductsPageVisible();
    }
}