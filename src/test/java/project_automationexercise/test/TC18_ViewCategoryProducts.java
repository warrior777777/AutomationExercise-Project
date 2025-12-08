package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.CategoryPage;

public class TC18_ViewCategoryProducts extends BaseTest {

    private CategoryPage categoryPage;

    @Test(priority = 1, description = "Positive: Verify All Women Category Links")
    public void testWomenCategoryFullCoverage() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyCategoryPageVisible()
                .clickWomenCategory()
                .clickWomanDress()
                .verifyTitleContain("WOMEN - DRESS PRODUCTS")
                .verifyProductCount(3, "Dress")
                .clickWomenCategory()
                .clickWomenTops()
                .verifyTitleContain("WOMEN - TOPS PRODUCTS")
                .verifyProductCount(6, "Tops")
                .clickWomenCategory()
                .clickWomenSaree()
                .verifyTitleContain("WOMEN - SAREE PRODUCTS")
                .verifyProductCount(3, "Saree");
    }

    @Test(priority = 2, description = "Positive: Verify All Men Category Links")
    public void testMenCategoryFullCoverage() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyCategoryPageVisible()
                .clickMenCategory()
                .clickMenTshirt()
                .verifyTitleContain("MEN - TSHIRT PRODUCTS")
                .verifyProductCount(6, "Tshirt")
                .clickMenCategory()
                .clickMenJeans()
                .verifyTitleContain("MEN - JEANS PRODUCTS")
                .verifyProductCount(3, "Jeans");
    }

    @Test(priority = 3, description = "Positive: Verify All Kids Category Links")
    public void testKidsCategoryFullCoverage() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyCategoryPageVisible()
                .clickKidsCategory()
                .clickKidsDress()
                .verifyTitleContain("KIDS - DRESS PRODUCTS")
                .verifyProductCount(6, "Dress Kids")
                .clickKidsCategory()
                .clickKidsTopsShirt()
                .verifyTitleContain("KIDS - TOPS & SHIRTS PRODUCTS")
                .verifyProductCount(7, "Tops And Shirt");
    }

    @Test(priority = 4, description = "Negative: All SubCategory should be hidden initially")
    public void testInitialStateHiddenSubCategories() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyCategoryPageVisible()
                .verifyWomenSubCategoryNotVisible()
                .verifyMenSubCategoryNotVisible()
                .verifyKidsSubCategoryNotVisible();
    }

    @Test(priority = 5, description = "Negative: Verify Isolation (Opening Women should not show Men/Kids)")
    public void testCategoryIsolationWomenActive() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .clickWomenCategory()
                .verifyMenSubCategoryNotVisible()
                .verifyKidsSubCategoryNotVisible();
    }

    @Test(priority = 6, description = "Negative: Verify Isolation (Opening Men should not show Women/Kids)")
    public void testCategoryIsolationMenActive() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .clickMenCategory()
                .verifyWomenSubCategoryNotVisible()
                .verifyKidsSubCategoryNotVisible();
    }

    @Test(priority = 7, description = "Negative: Verify Isolation (Opening Kids should not show Women/Men)")
    public void testCategoryIsolationKidsActive() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .clickKidsCategory()
                .verifyWomenSubCategoryNotVisible()
                .verifyMenSubCategoryNotVisible();
    }
}
