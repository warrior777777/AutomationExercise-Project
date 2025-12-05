/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC22_AddToCartFromRecommendedItemsPage extends BasePage {

    private final By recommendedItemsSection   = By.xpath("//h2[text()='Recommended Items']");
    private final By firstRecommendedAddToCart  = By.xpath("(//div[@class='recommended_items']//a[@data-product-id])[1]");
    private final By viewCartInModal            = By.cssSelector(".modal-body a[href='/view_cart'] u");
    private final By cartProductRows            = By.cssSelector("#cart_info_table tbody tr");

    @Test
    public void testAddToCartFromRecommendedItems() {

        // Scroll to bottom to load recommended items
        driver.findElement(By.tagName("body")).sendKeys(org.openqa.selenium.Keys.END);
        // Small wait to ensure section is loaded
        wait.until(ExpectedConditions.visibilityOfElementLocated(recommendedItemsSection));

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(recommendedItemsSection)).isDisplayed(),
                "Recommended Items section not visible");

        wait.until(ExpectedConditions.elementToBeClickable(firstRecommendedAddToCart)).click();

        // Click "View Cart" from the modal popup
        wait.until(ExpectedConditions.elementToBeClickable(viewCartInModal)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(cartProductRows)).size() > 0,
                "Recommended product not added to cart or not visible in cart page");
    }
}

 */