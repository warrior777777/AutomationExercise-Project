package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.BrandPage;
import project_automationexercise.pages.CategoryPage;

public class TC20_BrandProductsTests extends BaseTest {

    private BrandPage brandPage;
    private CategoryPage categoryPage;


    @Test(priority = 1, description = "Positive: Verify Brands Sidebar is visible")
    public void testBrandsSidebarVisibility() {
        categoryPage = new CategoryPage(driver);
        brandPage = new BrandPage(driver);

        categoryPage
                .navigateToProductsPage();
        brandPage
                .verifyBrandSidebarVisible();
    }

    @Test(priority = 2, description = "Positive: Navigate to Specific Brand (Polo) and verify products")
    public void testNavigatePoloBrand() {
        categoryPage = new CategoryPage(driver);
        brandPage = new BrandPage(driver);

        categoryPage
                .navigateToProductsPage();
        brandPage
                .clickToPolo()
                .verifyProductCount(6);
    }

    @Test(priority = 3, description = "Positive: Switch between Brands (Polo -> Madme -> Harbour) (Step 7 & 8 in logic)")
    public void testSwitchingBrands() {
        categoryPage = new CategoryPage(driver);
        brandPage = new BrandPage(driver);

        categoryPage
                .navigateToProductsPage();
        brandPage
                .clickToPolo()
                .verifyProductCount(6)
                .clickToMadme()
                .verifyProductCount(5)
                .clickToHarbour()
                .verifyProductCount(3);
    }

    @Test(priority = 4, description = "Negative: Verify Content (Polo page should not show MADME title)")
    public void testBrandContent() {
        categoryPage = new CategoryPage(driver);
        brandPage = new BrandPage(driver);

        categoryPage
                .navigateToProductsPage();
        brandPage.
                clickToPolo()
                .verifySpecificBrandTitle("Madme");
    }

    @Test(priority = 5, description = "Negetive: Verify Content (Polo)")
        public void testMultiBrandContent() {
            categoryPage = new CategoryPage(driver);
            brandPage = new BrandPage(driver);

            categoryPage
                    .navigateToProductsPage();
            brandPage
                    .clickToPolo()
                    .verifySpecificBrandTitle("Harbour")
                    .clickToMadme()
                    .verifySpecificBrandTitle("Polo")
                    .clickToHarbour()
                    .verifySpecificBrandTitle("Madme");
        }
    }



