package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class ProductsPage extends BasePage {

    private final By PRODUCTS_BTN             = By.cssSelector("a[href='/products']");
    private final By ALL_PRODUCTS_HEADER      = By.xpath("//h2[contains(text(), 'All Products')]");
    private final By SEARCH_FIELD             = By.cssSelector("#search_product");
    private final By SEARCH_BTN               = By.cssSelector("#submit_search");
    private final By SEARCHED_PRODUCTS_HEADER = By.xpath("//h2[contains(text(), 'Searched Products')]");
    private final By PRODUCT_LIST_ITEMS       = By.cssSelector(".features_items .col-sm-4");
    private final By FIRST_PRODUCT_ADD_BTN    = By.xpath("(//a[contains(text(),'Add to cart')])[1]");
    private final By FIRST_PRODUCT_VIEW_BTN   = By.cssSelector("a[href='/product_details/1']");
    private final By CONTINUE_SHOPPING_BTN    = By.cssSelector(".btn.btn-success.close-modal");
    private final By VIEW_CART_LINK           = By.cssSelector("a[href='/view_cart']");
    private final By MAIN_MENU_CART_BTN       = By.cssSelector("li a[href='/view_cart']");
    private final By VERIFY_MESSAGE_ADD_CART  = By.cssSelector(".modal-content");


    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    public ProductsPage navigateToProductsPage() {
        clickWhenReady(PRODUCTS_BTN);
        return this;
    }

    public ProductsPage verifyAllProductsPageVisible() {
        assertVisible(ALL_PRODUCTS_HEADER, "All Products page is not visible");
        return this;
    }

    public ProductsPage searchForProduct(String productName) {
        typeText(SEARCH_FIELD, productName);
        clickWhenReady(SEARCH_BTN);
        return this;
    }

    public ProductsPage verifySearchedProducts() {
        assertVisible(SEARCHED_PRODUCTS_HEADER, "'Searched Products' header is not visible");
        assertVisible(PRODUCT_LIST_ITEMS, "Product list is empty but expected to have items");
        return this;
    }

    public ProductsPage verifyNoProductsFound() {
        assertElementCount(PRODUCT_LIST_ITEMS, 0, "Expected no products, but found some!");
        return this;
    }

    public ProductsPage addFirstProductToCart() {
        clickWithScrollJS(FIRST_PRODUCT_ADD_BTN);
        return this;
    }
    public ProductsPage clickFirstProductView() {
        clickWithJS(FIRST_PRODUCT_VIEW_BTN);
        return this;
    }

    public ProductsPage verifyAddedProduct() {
        assertVisible(VERIFY_MESSAGE_ADD_CART, "verify message is not visible");
        clickWhenReady(CONTINUE_SHOPPING_BTN);
        return this;
    }

    public ProductsPage clickViewCart() {
        clickWhenReady(VIEW_CART_LINK);
        return this;
    }

    public ProductsPage navigateToCartPage() {
        clickWhenReady(MAIN_MENU_CART_BTN);
        return this;
    }
}


