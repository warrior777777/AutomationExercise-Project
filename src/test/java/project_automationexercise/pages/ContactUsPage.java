package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class ContactUsPage extends BasePage {

    private final By CONTACT_US_BTN = By.cssSelector("a[href='/contact_us']");
    private final By CONTACT_FORM = By.cssSelector("#contact-page");
    private final By NAME_FIELD = By.cssSelector("input[data-qa='name']");
    private final By EMAIL_FIELD = By.cssSelector("input[data-qa='email']");
    private final By SUBJECT_FIELD = By.cssSelector("input[data-qa='subject']");
    private final By MESSAGE_FIELD = By.cssSelector("textarea[data-qa='message']");
    private final By SUBMIT_BTN = By.cssSelector("input[data-qa='submit-button']");
    private final By SUCCESS_MESSAGE = By.cssSelector(".status.alert.alert-success");

    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public ContactUsPage navigateToContactUsPage() {
        clickWhenReady(CONTACT_US_BTN);
        return this;
    }

    public ContactUsPage verifyContactFormVisible() {
        assertVisible(CONTACT_FORM, "Contact form is not visible");
        return this;
    }

    public ContactUsPage fillName(String name) {
        typeText(NAME_FIELD, name);
        return this;
    }

    public ContactUsPage fillEmail(String email) {
        typeText(EMAIL_FIELD, email);
        return this;
    }

    public ContactUsPage fillSubject(String subject) {
        typeText(SUBJECT_FIELD, subject);
        return this;
    }

    public ContactUsPage fillMessage(String message) {
        typeText(MESSAGE_FIELD, message);
        return this;
    }

    public ContactUsPage clickSubmit() {
        clickWhenReady(SUBMIT_BTN);
        return this;
    }

    public ContactUsPage verifySuccessMessage() {
        assertVisible(SUCCESS_MESSAGE, "Success message is not visible");
        return this;
    }

    public ContactUsPage verifyNameFieldRequired() {
        verifyFieldIsRequiredErrorMessage(NAME_FIELD);
        return this;
    }

    public ContactUsPage verifyEmailFieldRequired() {
        verifyFieldIsRequiredErrorMessage(EMAIL_FIELD);
        return this;
    }

    public ContactUsPage verifySubjectFieldRequired() {
        verifyFieldIsRequiredErrorMessage(SUBJECT_FIELD);
        return this;
    }

    public ContactUsPage verifyMessageFieldRequired() {
        verifyFieldIsRequiredErrorMessage(MESSAGE_FIELD);
        return this;
    }
}