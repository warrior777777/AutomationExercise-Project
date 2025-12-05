package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.LoginSignupPage;


public class TC03_LoginUserWithIncorrectCredentialsTest extends BaseTest {

    private LoginSignupPage loginSignupPage;
    @Test
    public void testInvalidLogin() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("test@example.com")
                .withPassword("password123")
                .login()
                .errorMessage();
    }
}