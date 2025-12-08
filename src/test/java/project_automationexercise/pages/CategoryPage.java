package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class CategoryPage extends BasePage {

    private final By CATEGORY_SIDEBAR = By.cssSelector(".left-sidebar");
    private final By CATEGORY_TITLE = By.cssSelector(".title.text-center");
    private final By WOMEN_CATEGORY_BTN = By.xpath("//a[contains(@href, '#Women')]");
    private final By MEN_CATEGORY_BTN = By.xpath("//a[contains(@href, '#Men')]");
    private final By KIDS_CATEGORY_BTN = By.xpath("//a[contains(@href, '#Kids')]");
    private final By WOMEN_DRESS_SUBCATEGORY = By.cssSelector("a[href='/category_products/1']");
    private final By WOMEN_TOPS_SUBCATEGORY = By.cssSelector("a[href='/category_products/2']");
    private final By WOMEN_SAREE_SUBCATEGORY = By.cssSelector("a[href='/category_products/7']");
    private final By MEN_TSHIRT_SUBCATEGORY = By.cssSelector("a[href='/category_products/3']");
    private final By MEN_JEANS_SUBCATEGORY = By.cssSelector("a[href='/category_products/6']");
    private final By KIDS_DRESS_SUBCATEGORY = By.cssSelector("a[href='/category_products/4']");
    private final By KIDS_TOPS_SHIRT_SUBCATEGORY = By.cssSelector("a[href='/category_products/5']");
    private final By PRODUCTS_BTN = By.cssSelector("a[href='/products']");
    private final By VERIFY_ALL_PRODUCT_CARDS = By.xpath("//div[@class='features_items']//div[@class='col-sm-4']");

    public CategoryPage(WebDriver driver) {
        super(driver);
    }

    public CategoryPage navigateToProductsPage() {
        clickWhenReady(PRODUCTS_BTN);
        return this;
    }

    public CategoryPage verifyCategoryPageVisible() {
        assertVisible(CATEGORY_SIDEBAR, "category side bar is not visible");
        assertVisible(CATEGORY_TITLE, "category title is not visible");
        return this;
    }

    public CategoryPage clickWomenCategory() {
        clickWhenReady(WOMEN_CATEGORY_BTN);
        return this;
    }

    public CategoryPage clickMenCategory() {
        clickWhenReady(MEN_CATEGORY_BTN);
        return this;
    }

    public CategoryPage clickKidsCategory() {
        clickWhenReady(KIDS_CATEGORY_BTN);
        return this;
    }

    public CategoryPage clickWomanDress() {
        clickWhenReady(WOMEN_DRESS_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickWomenTops() {
        clickWhenReady(WOMEN_TOPS_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickWomenSaree() {
        clickWhenReady(WOMEN_SAREE_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickMenTshirt() {
        clickWhenReady(MEN_TSHIRT_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickMenJeans() {
        clickWhenReady(MEN_JEANS_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickKidsDress() {
        clickWhenReady(KIDS_DRESS_SUBCATEGORY);
        return this;
    }

    public CategoryPage clickKidsTopsShirt() {
        clickWhenReady(KIDS_TOPS_SHIRT_SUBCATEGORY);
        return this;
    }

    public CategoryPage verifyProductCount(int expectedCount, String productType) {
        assertElementCount(VERIFY_ALL_PRODUCT_CARDS, expectedCount, productType + " product type");
        return this;
    }
    public CategoryPage verifyTitleContain(String expectedTitle){
        assertTextContain(CATEGORY_TITLE, expectedTitle);
        return this;
    }
    public CategoryPage verifyWomenSubCategoryNotVisible() {
        assertNotVisible(WOMEN_DRESS_SUBCATEGORY, "women subcategory dress is visible");
        assertNotVisible(WOMEN_TOPS_SUBCATEGORY, "women subcategory tops is visible");
        assertNotVisible(WOMEN_SAREE_SUBCATEGORY,"women subcategory saree is visible");
        return this;
    }

    public CategoryPage verifyMenSubCategoryNotVisible() {
        assertNotVisible(MEN_TSHIRT_SUBCATEGORY, "men subcategory Tshirts is visible");
        assertNotVisible(MEN_JEANS_SUBCATEGORY, "men subcategory jeans is visible");
        return this;
    }

    public CategoryPage verifyKidsSubCategoryNotVisible() {
        assertNotVisible(KIDS_DRESS_SUBCATEGORY, "kids subcategory dress is visible but should be hidden");
        assertNotVisible(KIDS_TOPS_SHIRT_SUBCATEGORY,"kids subcategory tops and shirt is visible");
        return this;
    }
}


