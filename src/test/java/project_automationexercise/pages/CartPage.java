package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class CartPage extends BasePage {

    private final By CART_ITEMS_ROWS = By.xpath("//tbody/tr");
    private final By SHOPPING_CART_TEXT = By.xpath("//li[@class='active' and contains(text(), 'Shopping Cart')]");
    private final By EMPTY_CART_MSG = By.cssSelector("#empty_cart");
    private final By DELETE_PRODUCT_BTN = By.cssSelector(".cart_quantity_delete");
    private final By PROCEED_CHECK_OUT_BTN = By.cssSelector(".btn.btn-default.check_out");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public CartPage verifyCartPageVisible() {
        assertVisible(SHOPPING_CART_TEXT, "all products page is not visible");
        return this;
    }

    public CartPage verifyCartHasItem(int expectedCount) {
        assertElementCount(CART_ITEMS_ROWS, expectedCount,
                "Expected" + expectedCount + "item(s) in cart");
        return this;
    }

    public CartPage verifyCartIsEmpty() {
        assertVisible(EMPTY_CART_MSG, "empty cart is not visible");
        assertElementCount(CART_ITEMS_ROWS, 0, "Cart is not empty");
        return this;
    }

    public CartPage clickProceedToCheckOut() {
        clickWhenReady(PROCEED_CHECK_OUT_BTN);
        return this;
    }

    public CartPage removeProduct() {
        clickWhenReady(DELETE_PRODUCT_BTN);
        return this;
    }
}

