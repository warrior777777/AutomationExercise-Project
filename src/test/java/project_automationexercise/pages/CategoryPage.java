package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class CategoryPage extends BasePage {

    private final By CATEGORY_SIDEBAR = By.cssSelector(".left-sidebar");
    private final By CATEGORY_TITLE = By.cssSelector(".title.text-center");
    private final By WOMEN_CATEGORY_BTN = By.xpath("//a[contains(@href, '#Women')]");
    private final By MEN_CATEGORY_BTN = By.xpath("//a[contains(@href, '#Men')]");
    private final By WOMEN_DRESS_SUBCATEGORY = By.cssSelector("a[href='/category_products/1']");
    private final By MEN_TSHIRT_SUBCATEGORY = By.cssSelector("a[href='/category_products/3']");
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

    public CategoryPage clickDressSubCategory() {
        clickWhenReady(WOMEN_DRESS_SUBCATEGORY);
        return this;
    }

    public CategoryPage verifyDressCount(int expectedCount) {
        assertElementCount(VERIFY_ALL_PRODUCT_CARDS,expectedCount,"more or less than 3" );
        return this;
    }
    public CategoryPage verifyDressSubCategoryNotVisible() {
        assertNotVisible(WOMEN_DRESS_SUBCATEGORY, "error dress sub category should not be visible");
        return this;
    }
    public CategoryPage verifyTshirtSubCategoryNotVisible() {
        assertNotVisible(MEN_TSHIRT_SUBCATEGORY, "error t shirt sub category should not be visible");
        return this;
    }

    public CategoryPage clickTshirtSubCategory() {
        clickWhenReady(MEN_TSHIRT_SUBCATEGORY);
        return this;
    }
    public CategoryPage verifyTshirtCount(int expectedCount) {
        assertElementCount(VERIFY_ALL_PRODUCT_CARDS,expectedCount,"more or less than 6");
        return this;
    }

}


