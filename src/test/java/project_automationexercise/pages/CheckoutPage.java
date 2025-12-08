package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class CheckoutPage extends BasePage {

    private final By ADDRESS_DELIVERY_SECTION = By.id("address_delivery");
    private final By ADDRESS_INVOICE_SECTION = By.id("address_invoice");
    private final By REVIEW_ORDER_SECTION = By.id("cart_info");
    private final By COMMENT_TEXT_AREA = By.name("message");
    private final By PLACE_ORDER_BTN = By.xpath("//a[@href='/payment']");

    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    public CheckoutPage verifyAddressDetailsVisible() {
        assertVisible(ADDRESS_DELIVERY_SECTION, "Delivery Address section is missing");
        assertVisible(ADDRESS_INVOICE_SECTION, "Invoice Address section is missing");
        return this;
    }

    public CheckoutPage verifyReviewOrderVisible() {
        assertVisible(REVIEW_ORDER_SECTION, "Review Order section is missing");
        return this;
    }

    public CheckoutPage enterComment(String comment) {
        typeText(COMMENT_TEXT_AREA, comment);
        return this;
    }

    public PaymentPage clickPlaceOrder() {
        clickWhenReady(PLACE_ORDER_BTN);
        return new PaymentPage(driver);
    }
}