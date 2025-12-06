package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.ContactUsPage;

public class TC23_ContactUsValidation extends BaseTest {

    private ContactUsPage contactUsPage;

    @Test(priority = 1, description = "Send valid contact message")
    public void testSendValidContactMessage() {
        contactUsPage = new ContactUsPage(driver);

        contactUsPage
                .navigateToContactUsPage()
                .verifyContactFormVisible()
                .fillName("Script")
                .fillEmail("test@example.com")
                .fillSubject("Test Subject")
                .fillMessage("This is a test message for automation.")
                .clickSubmit()
                .alertConfirm();

    }

    @Test(priority = 2, description = "Send contact message without email")
    public void testSendMessageWithoutEmail() {
        contactUsPage = new ContactUsPage(driver);

        contactUsPage
                .navigateToContactUsPage()
                .fillName("Script")
                .fillEmail("")
                .fillSubject("Test")
                .fillMessage("Test message")
                .clickSubmit()
                .verifyEmailFieldRequired();
    }

    @Test(priority = 3, description = "Send empty contact form")
    public void testSendEmptyContactForm() {
        contactUsPage = new ContactUsPage(driver);

        contactUsPage
                .navigateToContactUsPage()
                .clickSubmit()
                .verifyEmailFieldRequired();
    }
}