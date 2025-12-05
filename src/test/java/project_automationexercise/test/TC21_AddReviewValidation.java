package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.ProductDetailsPage;
import project_automationexercise.pages.ProductsPage;

public class TC21_AddReviewValidation extends BaseTest {

    private ProductsPage productsPage;
    private ProductDetailsPage productDetailsPage;

    @Test(priority = 1, description = "Positive: Add Review with Valid Data")
    public void testAddReviewSuccess() {
        productsPage = new ProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);

        productsPage
                .navigateToProductsPage()
                .clickFirstProductView();

        productDetailsPage
                .verifyReviewHeaderVisible()
                .fillName("Tester")
                .fillEmail("Testing@test.com")
                .fillReview("Great product! Highly recommended.")
                .clickSubmit()
                .verifySuccessReview();
    }

    @Test(priority = 2, description = "Negative: Add Review with Empty Review Text")
    public void testAddReviewEmptyText() {
        productsPage = new ProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);

        productsPage
                .navigateToProductsPage()
                .clickFirstProductView();

        productDetailsPage
                .verifyReviewHeaderVisible()
                .fillName("Tester")
                .fillEmail("Testing@test.com")
                .fillReview("")
                .clickSubmit()
                .verifyReviewFieldRequired();
    }

    @Test(priority = 3, description = "Negative: Add Review with Empty Name")
    public void testAddReviewEmptyName() {
        productsPage = new ProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);

        productsPage
                .navigateToProductsPage()
                .clickFirstProductView();

        productDetailsPage
                .fillName("")
                .fillEmail("Testing@test.com")
                .fillReview("This is a test review")
                .clickSubmit()
                .verifyNameFieldRequired();
    }

    @Test(priority = 4, description = "Negative: Add Review with Invalid Email Format")
    public void testAddReviewInvalidEmail() {
        productsPage = new ProductsPage(driver);
        productDetailsPage = new ProductDetailsPage(driver);

        productsPage
                .navigateToProductsPage()
                .clickFirstProductView();

        productDetailsPage
                .fillName("Tester")
                .fillEmail("no-domain")
                .fillReview("This is a test review")
                .clickSubmit()
                .verifyEmailFieldRequired();
    }
}