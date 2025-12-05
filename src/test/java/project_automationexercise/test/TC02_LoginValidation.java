package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.LoginSignupPage;

public class TC02_LoginValidation extends BaseTest {

    private LoginSignupPage loginSignupPage;

    @Test(priority = 1, description = "Login with valid email and valid password")
    public void testLoginWithValidCredentials() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("test7.script@gmail.com")
                .withPassword("Test12345!")
                .login()
                .logoutButton();
    }

    @Test(priority = 2, description = "Login with incorrect email and correct password")
    public void testLoginWithIncorrectEmail() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("wrong_email@test.com")
                .withPassword("Test12345")
                .login()
                .errorMessage();
    }

    @Test(priority = 3, description = "Login with correct email and incorrect password")
    public void testLoginWithIncorrectPassword() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("test7.script@gmail.com")
                .withPassword("WrongPass123")
                .login()
                .errorMessage();
    }

    @Test(priority = 4, description = "Login with empty fields")
    public void testLoginWithEmptyFields() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("")
                .withPassword("")
                .login();
        loginSignupPage.navigateToLoginPage();
    }
}