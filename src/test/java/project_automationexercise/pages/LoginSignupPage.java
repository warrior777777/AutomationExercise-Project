package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;


public class LoginSignupPage extends BasePage {

    private final By LOGIN_SIGNUP_BTN = By.cssSelector("a[href='/login']");

    private final By LOGIN_EMAIL        = By.cssSelector("input[data-qa='login-email']");
    private final By LOGIN_PASSWORD     = By.cssSelector("input[placeholder='Password']");
    private final By LOGIN_BUTTON       = By.cssSelector("button[data-qa='login-button']");
    private final By LOGIN_ERROR        = By.xpath("//p[normalize-space()='Your email or password is incorrect!']");
    private final By SIGNUP_NAME        = By.cssSelector("input[placeholder='Name']");
    private final By SIGN_EMAIL         = By.cssSelector("input[data-qa='signup-email']");
    private final By SIGNUP_BUTTON      = By.cssSelector("button[data-qa='signup-button']");
    private final By LOGOUT_BTN         = By.cssSelector("a[href='/logout']");
    private final By EMAIL_EXISTS_ERROR = By.xpath("//p[text()='Email Address already exist!']");
    private final By GENDER_BTN         = By.cssSelector("#id_gender1");
    private final By PASSWORD_FIELD     = By.cssSelector("#password");
    private final By DAY_MENU           = By.cssSelector("#days");
    private final By MONTH_MENU         = By.cssSelector("#months");
    private final By YEAR_MENU          = By.cssSelector("#years");
    private final By NEWS_BUTTON        = By.cssSelector("#newsletter");
    private final By OFFERS_BUTTON      = By.cssSelector("#optin");
    private final By FNAME_FIELD        = By.cssSelector("#first_name");
    private final By LNAME_FIELD        = By.cssSelector("#last_name");
    private final By COMPANY_FIELD      = By.cssSelector("#company");
    private final By ADDRESS1_FIELD     = By.cssSelector("#address1");
    private final By ADDRESS2_FIELD     = By.cssSelector("#address2");
    private final By COUNTRY_MENU       = By.cssSelector("#country");
    private final By STATE_FIELD        = By.cssSelector("#state");
    private final By CITY_FIELD         = By.cssSelector("#city");
    private final By CODE_FIELD         = By.cssSelector("#zipcode");
    private final By MOBILNUM_FILED     = By.cssSelector("#mobile_number");
    private final By CREATE_BUTTON      = By.cssSelector("button[data-qa='create-account']");
    private final By SUCCESS_MESSAGE    = By.cssSelector(".col-sm-9.col-sm-offset-1");
    private final By CONTINUE_BUTTON    = By.cssSelector(".btn.btn-primary");
    private final By DELETE_BUTTON      = By.cssSelector("a[href='/delete_account']");
    private final By CONFIRM_DELETE     = By.cssSelector(".col-sm-9.col-sm-offset-1");
    private final By SIGNUP_BUTTON_CHECK = By.cssSelector("a[href='/login']");


    public void navigateToLoginPage() {
        clickWhenReady(LOGIN_SIGNUP_BTN);
    }

    public LoginSignupPage(WebDriver driver) {
        super(driver);
    }
    public LoginSignupPage withEmail (String email) {
        typeText(LOGIN_EMAIL,email);
    return this;
    }
    public LoginSignupPage withPassword (String password) {
        typeText(LOGIN_PASSWORD,password);
        return this;
    }
    public LoginSignupPage login() {
        clickWhenReady(LOGIN_BUTTON);
        return this;
    }
    public void errorMessage () {
        assertVisible(LOGIN_ERROR,"error message is not visible");
    }
    public LoginSignupPage nameSignup (String name) {
        typeText(SIGNUP_NAME,name);
        return this;
    }
    public LoginSignupPage emailSignup(String email) {
        typeText(SIGN_EMAIL,email);
        return this;
    }
    public LoginSignupPage logoutButton(){
        assertVisible(LOGOUT_BTN, " logout button is not visible");
        clickWhenReady(LOGOUT_BTN);
        return this;
    }
    public LoginSignupPage signupButton() {
        assertVisible(SIGNUP_BUTTON, "signup button is not visible");
        clickWhenReady(SIGNUP_BUTTON);
        return this;
    }

    public LoginSignupPage clickGender() {
        clickWhenReady(GENDER_BTN);
        return this;
    }
    public LoginSignupPage typePassword (String password) {
        typeText(PASSWORD_FIELD, password);
        return this;
    }

    public LoginSignupPage pickDay (String day) {
        selectFromList(DAY_MENU, day);
        return this;
    }

    public LoginSignupPage pickMonth (String month) {
        selectFromList(MONTH_MENU, month);
        return this;
    }
    public LoginSignupPage pickYear (String year) {
        selectFromList(YEAR_MENU, year);
        return this;
    }
    public LoginSignupPage clickNews() {
        clickWhenReady(NEWS_BUTTON);
        return this;
    }
    public LoginSignupPage clickOffers() {
        clickWhenReady(OFFERS_BUTTON);
        return this;
    }
    public LoginSignupPage typeFirstName(String name){
        typeText(FNAME_FIELD, name);
        return this;
    }

    public LoginSignupPage typeLastName(String name){
        typeText(LNAME_FIELD, name);
        return this;
    }
    public LoginSignupPage typeCompany(String name) {
        typeText(COMPANY_FIELD, name);
        return this;
    }
    public LoginSignupPage typeAddress1(String address) {
        typeText(ADDRESS1_FIELD, address);
        return this;
    }
    public LoginSignupPage typeAddress2(String address){
        typeText(ADDRESS2_FIELD, address);
        return this;
    }
    public LoginSignupPage pickCountry(String country){
        selectFromList(COUNTRY_MENU, country);
        return this;
    }
    public LoginSignupPage typeState(String state){
        typeText(STATE_FIELD, state);
        return this;
    }
    public LoginSignupPage typeCity(String city){
        typeText(CITY_FIELD, city);
        return this;
    }
    public LoginSignupPage code(String code){
        typeText(CODE_FIELD, code);
        return this;
    }
    public LoginSignupPage typeNumPhone(String number){
        typeText(MOBILNUM_FILED, number);
        return this;
    }
    public LoginSignupPage createButton(){
        assertVisible(CREATE_BUTTON,"create account button is not visible");
        clickWhenReady(CREATE_BUTTON);
        return this;
    }

    public  LoginSignupPage successMessageConfirm(){
        assertVisible(SUCCESS_MESSAGE, "Success message is not visible");
        clickWhenReady(CONTINUE_BUTTON);
        return this;
    }
    public LoginSignupPage deleteMessageConfirm(){
        clickWhenReady(DELETE_BUTTON);
        assertVisible(CONFIRM_DELETE, "delete message is not visible");
        return this;
    }
    public LoginSignupPage homePageCheck(){
        assertVisible(SIGNUP_BUTTON_CHECK, "signup button is not visible");
        return this;
    }
}


