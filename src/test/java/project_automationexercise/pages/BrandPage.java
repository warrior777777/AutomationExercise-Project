package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class BrandPage extends BasePage {

    private final By BRANDS_SIDEBAR = By.cssSelector(".brands_products");
    private final By BRANDS_TITLE = By.cssSelector("div[class='brands_products'] h2");
    private final By POLO_BRAND_BTN = By.xpath("//a[@href='/brand_products/Polo']");
    private final By MADME_BRAND_BTN = By.cssSelector("a[href='/brand_products/Madame']");
    private final By HARBOUR_BRAND_BTN = By.cssSelector("a[href='/brand_products/Mast & Harbour']");
    private final By VERIFY_ALL_PRODUCT_CARDS = By.xpath("//div[@class='features_items']//div[@class='col-sm-4']");
    private final By HEADER_TITLE_DYNAMIC = By.cssSelector(".title.text-center");


    public BrandPage(WebDriver driver) {
        super(driver);
    }
    public BrandPage verifyBrandSidebarVisible() {
        assertVisible(BRANDS_SIDEBAR, "brand side bar is not visible");
        assertVisible(BRANDS_TITLE, "brand titer is not visible");
        return this;
    }
    public BrandPage clickToPolo() {
        clickWithScrollJS(POLO_BRAND_BTN);
        return this;
    }

    public BrandPage clickToMadme() {
        clickWhenReady(MADME_BRAND_BTN);
        return this;
    }

    public BrandPage clickToHarbour() {
        clickWhenReady(HARBOUR_BRAND_BTN);
        return this;
    }
    public BrandPage verifyProductCount(int expectedCount) {
        assertElementCount(VERIFY_ALL_PRODUCT_CARDS,expectedCount,"product count mismatch for the selected brand");
        return this;
    }
    public BrandPage verifySpecificBrandTitle(String unexpectedText) {
        assertTextNotContains(HEADER_TITLE_DYNAMIC,unexpectedText,"found unexpected brand title");
        return this;
    }

}
