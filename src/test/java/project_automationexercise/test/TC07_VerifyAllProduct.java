package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.addProductInCart;


public class TC07_VerifyAllProduct extends BaseTest {

    private addProductInCart addProductInCart;

    @Test
    public void verifyAllProduct() {
        addProductInCart = new addProductInCart(driver);
        addProductInCart
                .navigateToProductPage();
        addProductInCart
                .productIsVisible();
        addProductInCart
                .clickFirstProduct();
        addProductInCart
                .clickToShopping();
        addProductInCart
                .clickSecondProduct();
        addProductInCart
                .clickViewCart();
        addProductInCart
                .cartIsVisible();
        addProductInCart
                .bothProductVerify();
    }
}
