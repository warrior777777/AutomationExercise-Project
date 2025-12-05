package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.LoginSignupPage;

public class TC01_RegisterUser extends BaseTest {


    private LoginSignupPage loginSignupPage;
    @Test
    public void testCreateAccount(){
    loginSignupPage = new LoginSignupPage(driver);
    loginSignupPage
            .navigateToLoginPage();
    loginSignupPage
            .nameSignup("Testing")
            .emailSignup("test7.script7@gmail.com")
            .signupButton()
            .clickGender()
            .typePassword("Test12345!")
            .pickDay("31")
            .pickMonth("May")
            .pickYear("2001")
            .clickNews()
            .clickOffers()
            .typeFirstName("Automation")
            .typeLastName("Script")
            .typeCompany("Test Company")
            .typeAddress1("123 Street")
            .typeAddress2("Maadi")
            .pickCountry("United States")
            .typeState("New York")
            .typeCity("New York1")
            .code("12345")
            .typeNumPhone("01012345678")
            .createButton()
            .successMessageConfirm()
            .deleteMessageConfirm()
            .homePageCheck();
    }
}
