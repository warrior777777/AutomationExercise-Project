package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.CategoryPage;

public class TC18_ViewCategoryProducts extends BaseTest {

    private CategoryPage categoryPage;

    @Test(priority = 1, description = "Positive: View Products for Multiple Categories (Women & Men) and Sub-Categories")
    public void testViewCategoryProductsFullFlow() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyCategoryPageVisible()
                .clickWomenCategory()
                .clickDressSubCategory()
                .verifyDressCount(3)
                .clickMenCategory()
                .clickTshirtSubCategory()
                .verifyTshirtCount(6);
    }

    @Test(priority = 2, description = "Negative: Sub-category should not be visible without clicking Parent Category")
    public void testSubCategoryHiddenWithoutParentClick() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .verifyDressSubCategoryNotVisible();

    }

    @Test(priority = 3, description = "Negative: Men Sub-categories should not appear when Women Category is active")
    public void testMenSubCategoryHiddenInWomenContext() {
        categoryPage = new CategoryPage(driver);
        categoryPage
                .navigateToProductsPage()
                .clickWomenCategory()
                .verifyTshirtSubCategoryNotVisible();
    }

    }

