package project_automationexercise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import project_automationexercise.base.BasePage;

public class addProductInCart extends BasePage {

    private final By ProductBTN = By.cssSelector("a[href='/products']");
    private final By FirstProductBTN = By.cssSelector("a[data-product-id='11']");
    private final By SecondProductBTN = By.cssSelector("a[data-product-id='12']");
    private final By continueShoppingBTN = By.cssSelector(".btn.btn-success.close-modal.btn-block");
    private final By viewCartBTN = By.cssSelector("a[href='/view_cart']");
    private final By verifyFirstProduct = By.xpath("//tr[@id='product-12']");
    private final By verifySecondProduct = By.xpath("//tr[@id='product-11']");
    private final By verifyTableProduct = By.cssSelector(".features_items");
    private final By tableCartInfo = By.cssSelector("#cart_info");

    public addProductInCart(WebDriver driver) {
        super(driver);
    }

    public void navigateToProductPage() {
        clickAndScrollWithJS(ProductBTN);
    }

    public void productIsVisible() {
        assertVisible(verifyTableProduct, "table product is not visible");
    }

    public void clickFirstProduct() {
        clickAndScrollWithJS(FirstProductBTN);
    }

    public void clickToShopping() {
        clickWhenReady(continueShoppingBTN);
    }

    public void clickSecondProduct() {
        clickAndScrollWithJS(SecondProductBTN);
    }

    public void clickViewCart() {
        clickWhenReady(viewCartBTN);
    }

    public void cartIsVisible() {
        assertVisible(tableCartInfo, "table cart is not visible");
    }

    public void bothProductVerify() {
        assertVisible(verifyFirstProduct, "first product is visible");
        assertVisible(verifySecondProduct, "second product is visible");
    }
}
