package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class BrandPage extends BasePage {


    private final By BRAND_SIDEBAR = By.cssSelector(".brands_products");
    private final By BRAND_PAGE_TITLE = By.cssSelector(".features_items .title");
    private final By PRODUCTS_BTN = By.cssSelector("a[href='/products']");
    private final By VERIFY_ALL_PRODUCT_CARDS = By.xpath("//div[@class='features_items']//div[@class='col-sm-4']");
    private final By POLO_BRAND_BTN = By.cssSelector("a[href='/brand_products/Polo']");
    private final By H_AND_M_BRAND_BTN = By.cssSelector("a[href='/brand_products/H&M']");
    private final By MADAME_BRAND_BTN = By.cssSelector("a[href='/brand_products/Madame']");
    private final By MAST_HARBOUR_BRAND_BTN = By.cssSelector("a[href='/brand_products/Mast & Harbour']");
    private final By BABYHUG_BRAND_BTN = By.cssSelector("a[href='/brand_products/Babyhug']");
    private final By ALLEN_SOLLY_BRAND_BTN = By.cssSelector("a[href='/brand_products/Allen Solly Junior']");
    private final By KOOKIE_KIDS_BRAND_BTN = By.cssSelector("a[href='/brand_products/Kookie Kids']");
    private final By BIBA_BRAND_BTN = By.cssSelector("a[href='/brand_products/Biba']");


    public BrandPage(WebDriver driver) {
        super(driver);
    }

    public BrandPage navigateToProductsPage() {
        clickWhenReady(PRODUCTS_BTN);
        return this;
    }

    public BrandPage verifyBrandSidebarVisible() {
        assertVisible(BRAND_SIDEBAR, "Brand sidebar is not visible");
        return this;
    }

    public BrandPage clickPoloBrand() {
        clickWithScrollJS(POLO_BRAND_BTN);
        return this;
    }

    public BrandPage clickHnMBrand() {
        clickWithScrollJS(H_AND_M_BRAND_BTN);
        return this;
    }

    public BrandPage clickMadameBrand() {
        clickWithScrollJS(MADAME_BRAND_BTN);
        return this;
    }

    public BrandPage clickMastAndHarbourBrand() {
        clickWithScrollJS(MAST_HARBOUR_BRAND_BTN);
        return this;
    }

    public BrandPage clickBabyhugBrand() {
        clickWithScrollJS(BABYHUG_BRAND_BTN);
        return this;
    }

    public BrandPage clickAllenSollyBrand() {
        clickWithScrollJS(ALLEN_SOLLY_BRAND_BTN);
        return this;
    }

    public BrandPage clickKookieKidsBrand() {
        clickWithScrollJS(KOOKIE_KIDS_BRAND_BTN);
        return this;
    }

    public BrandPage clickBibaBrand() {
        clickWithScrollJS(BIBA_BRAND_BTN);
        return this;
    }

    public BrandPage verifyTitleContain(String expectedTitle) {
        // Uses BasePage method to verify text presence
        assertTextContain(BRAND_PAGE_TITLE, expectedTitle);
        return this;
    }

    public BrandPage verifyProductCount(int expectedCount, String brandName) {
        // Uses BasePage method to verify exact count of products
        assertElementCount(VERIFY_ALL_PRODUCT_CARDS, expectedCount, brandName + " Products");
        return this;
    }

    public BrandPage verifyTitleDoesNotContain(String unexpectedText) {
        assertTextNotContains(BRAND_PAGE_TITLE, unexpectedText, "Error: Title contains '" + unexpectedText + "' but it should not.");
        return this;
    }

    public BrandPage verifyBrandHeaderNotVisible() {
        assertTextNotContains(BRAND_PAGE_TITLE, "BRAND -", "Brand header is visible initially");
        return this;
    }
}