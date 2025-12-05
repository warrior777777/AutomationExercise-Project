package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.LoginSignupPage;


public class TC04_LoginUserWithIncorrectInfo extends BaseTest {

    private LoginSignupPage loginSignupPage;

    @Test
    public void loginWithInvalidInfo() {
        loginSignupPage = new LoginSignupPage(driver);
        loginSignupPage
                .navigateToLoginPage();
        loginSignupPage
                .withEmail("test@test.com")
                .withPassword("password12345")
                .login()
                .errorMessage();


    }


}

