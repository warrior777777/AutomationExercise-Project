package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class PaymentPage extends BasePage {

    private final By NAME_ON_CARD_INPUT = By.name("name_on_card");
    private final By CARD_NUMBER_INPUT = By.name("card_number");
    private final By CVC_INPUT = By.name("cvc");
    private final By EXPIRY_MONTH_INPUT = By.name("expiry_month");
    private final By EXPIRY_YEAR_INPUT = By.name("expiry_year");
    private final By PAY_BUTTON = By.id("submit");
    private final By SUCCESS_MESSAGE = By.xpath("//p[contains(text(),'Congratulations! Your order has been confirmed!')] | //div[contains(@class,'alert-success')]"); // Locator strategies differ sometimes

    public PaymentPage(WebDriver driver) {
        super(driver);
    }

    public PaymentPage fillPaymentDetails(String name, String number, String cvc, String month, String year) {
        typeText(NAME_ON_CARD_INPUT, name);
        typeText(CARD_NUMBER_INPUT, number);
        typeText(CVC_INPUT, cvc);
        typeText(EXPIRY_MONTH_INPUT, month);
        typeText(EXPIRY_YEAR_INPUT, year);
        return this;
    }

    public PaymentPage clickPayAndConfirm() {
        clickWhenReady(PAY_BUTTON);
        return this;
    }

    public PaymentPage verifyOrderSuccessMessage() {
        assertVisible(SUCCESS_MESSAGE, "Order success message not displayed!");
        return this;
    }

    public PaymentPage verifyPaymentFieldRequired() {
        verifyFieldIsRequiredErrorMessage(NAME_ON_CARD_INPUT);
        return this;
    }

    public PaymentPage clickPayWithoutData() {
        clickWhenReady(PAY_BUTTON);
        return this;
    }

}