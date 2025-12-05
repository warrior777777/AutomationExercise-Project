/*package project_automationexercise;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC19_ViewAndCartBrandProductsPage extends BasePage {

    private final By productsBtn              = By.cssSelector("a[href='/products']");
    private final By brandsSection            = By.xpath("//h2[text()='Brands']");
    private final By poloBrand                = By.xpath("//a[@href='/brand_products/Polo']");
    private final By poloBrandPageTitle       = By.xpath("//h2[@class='title text-center' and contains(text(),'Brand - Polo Products')]");
    private final By madameBrand              = By.xpath("//a[@href='/brand_products/Madame']");
    private final By madameBrandPageTitle     = By.xpath("//h2[@class='title text-center' and contains(text(),'Brand - Madame Products')]");

    @Test
    public void testViewAndCartBrandProducts() {

        wait.until(ExpectedConditions.elementToBeClickable(productsBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(brandsSection)).isDisplayed(),
                "Brands section not visible on left sidebar");

        wait.until(ExpectedConditions.elementToBeClickable(poloBrand)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(poloBrandPageTitle)).isDisplayed(),
                "Brand page for Polo not displayed");

        Assert.assertTrue(driver.getCurrentUrl().contains("brand_products/Polo"),
                "Not navigated to Polo brand page");

        wait.until(ExpectedConditions.elementToBeClickable(madameBrand)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(madameBrandPageTitle)).isDisplayed(),
                "Brand page for Madame not displayed");

        Assert.assertTrue(driver.getCurrentUrl().contains("brand_products/Madame"),
                "Not navigated to Madame brand page");
    }
}

 */