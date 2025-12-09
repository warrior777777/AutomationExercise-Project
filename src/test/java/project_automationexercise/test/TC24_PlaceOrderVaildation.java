package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.*;

public class TC24_PlaceOrderVaildation extends BaseTest {

    private LoginSignupPage loginSignupPage;
    private ProductsPage productsPage;
    private CheckoutPage checkoutPage;
    private PaymentPage paymentPage;
    private CartPage cartPage;

    @Test(priority = 1, description = "Positive: Place Order: Login before Checkout (Full Flow)")
    public void testPlaceOrderSuccess() {
        loginSignupPage = new LoginSignupPage(driver);
        productsPage = new ProductsPage(driver);
        cartPage = new CartPage(driver);
        checkoutPage = new CheckoutPage(driver);
        paymentPage = new PaymentPage(driver);
        loginSignupPage
                .navigateToLoginPage()
                .withEmail("test7.script@gmail.com")
                .withPassword("Test12345!")
                .login();
        productsPage
                .navigateToProductsPage()
                .addFirstProductToCart()
                .verifyAddedProductAndContinue()
                .addSecondProductToCart()
                .clickViewCart();
        cartPage
                .verifyCartHasItem(2)
                .clickProceedToCheckOut();
        checkoutPage
                .verifyAddressDetailsVisible()
                .verifyReviewOrderVisible()
                .enterComment("Please deliver between 9 AM and 5 PM.")
                .clickPlaceOrder();
        paymentPage
                .fillPaymentDetails("Test User", "1234567890123456", "311", "12", "2028")
                .clickPayAndConfirm()
                .verifyOrderSuccessMessage();
    }

    @Test(priority = 2, description = "Negative: Try to Pay with Empty Card Details")
    public void testPaymentWithEmptyFields() {
        paymentPage = new PaymentPage(driver);
        paymentPage
                .clickPayWithoutData()
                .verifyPaymentFieldRequired();
    }

    @Test(priority = 3, description = "Negative: Verify Comment is Optional (Boundary Test)")
    public void testPlaceOrderWithoutComment() {
        checkoutPage = new CheckoutPage(driver);
        paymentPage = new PaymentPage(driver);
        checkoutPage
                .verifyAddressDetailsVisible()
                .clickPlaceOrder();
        paymentPage
                .fillPaymentDetails("User", "411111111111", "123", "10", "2025");
    }
}