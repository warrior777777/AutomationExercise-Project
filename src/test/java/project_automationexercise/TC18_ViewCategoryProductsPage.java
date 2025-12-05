/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC18_ViewCategoryProductsPage extends BasePage {

    private final By homePageVerify           = By.cssSelector("img[alt='Website for automation practice']");
    private final By categorySection          = By.cssSelector(".left-sidebar h2");
    private final By womenCategory            = By.xpath("//a[@href='#Women']");
    private final By womenDressSubcategory    = By.xpath("//a[@href='/category_products/1']");
    private final By womenTopsProductsTitle   = By.xpath("//h2[@class='title text-center' and text()='Women - Tops Products']");
    private final By menCategory              = By.xpath("//a[@href='#Men']");
    private final By menJeansSubcategory      = By.xpath("//a[@href='/category_products/6']");

    @Test
    public void testViewCategoryProducts() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(categorySection)).isDisplayed(),
                "Categories section not visible on left sidebar");

        wait.until(ExpectedConditions.elementToBeClickable(womenCategory)).click();

        wait.until(ExpectedConditions.elementToBeClickable(womenDressSubcategory)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(womenTopsProductsTitle)).isDisplayed(),
                "Women - Tops Products page not displayed");

        wait.until(ExpectedConditions.elementToBeClickable(menCategory)).click();

        wait.until(ExpectedConditions.elementToBeClickable(menJeansSubcategory)).click();

        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("category_products"),
                "User not navigated to subcategory page after clicking Men -> Jeans");
    }
}

 */