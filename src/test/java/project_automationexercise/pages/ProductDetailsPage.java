package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class ProductDetailsPage extends BasePage {
    private final By REVIEW_HEADER             = By.cssSelector("a[href='#reviews']");
    private final By NAME_FIELD                = By.cssSelector("#name");
    private final By EMAIL_FIELD               = By.cssSelector("#email");
    private final By REVIEW_FIELD              = By.cssSelector("#review");
    private final By SUBMIT_BTN                = By.cssSelector("#button-review");
    private final By REVIEW_HAS_BEEN_DELIVERED = By.xpath("//span[normalize-space()='Thank you for your review.']");

    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }
    public ProductDetailsPage verifyReviewHeaderVisible() {
        assertVisible(REVIEW_HEADER, "write your review header is not visible");
        return this;
    }
    public ProductDetailsPage fillName(String name) {
        typeText(NAME_FIELD,name);
        return this;
    }
    public ProductDetailsPage fillEmail(String email) {
        typeText(EMAIL_FIELD,email);
        return this;
    }
    public ProductDetailsPage fillReview(String review) {
        typeText(REVIEW_FIELD,review);
        return this;
    }
    public ProductDetailsPage clickSubmit() {
        clickWhenReady(SUBMIT_BTN);
        return this;
    }
    public ProductDetailsPage verifySuccessReview() {
        assertVisible(REVIEW_HAS_BEEN_DELIVERED,"success message is not visible");
        return this;
    }
    public ProductDetailsPage verifyNameFieldRequired() {
        verifyFieldIsRequiredErrorMessage(NAME_FIELD);
        return this;
    }
    public ProductDetailsPage verifyEmailFieldRequired() {
        verifyFieldIsRequiredErrorMessage(EMAIL_FIELD);
        return this;
    }
    public ProductDetailsPage verifyReviewFieldRequired(){
        verifyFieldIsRequiredErrorMessage(REVIEW_FIELD);
        return this;
    }

}

