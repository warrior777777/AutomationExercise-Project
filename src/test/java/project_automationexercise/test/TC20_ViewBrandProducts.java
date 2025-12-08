package project_automationexercise.test;

import org.testng.annotations.Test;
import project_automationexercise.base.BaseTest;
import project_automationexercise.pages.BrandPage;

public class TC20_ViewBrandProducts extends BaseTest {

    private BrandPage brandPage;

    @Test(priority = 1, description = "Positive: Verify Major Fashion Brands (Polo, H&M)")
    public void testMajorBrandsFullCoverage() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .verifyBrandSidebarVisible()
                .clickPoloBrand()
                .verifyTitleContain("BRAND - POLO PRODUCTS")
                .verifyProductCount(6, "Polo")
                .clickHnMBrand()
                .verifyTitleContain("BRAND - H&M PRODUCTS")
                .verifyProductCount(5, "H&M");
    }

    @Test(priority = 2, description = "Positive: Verify Ladieswear Brands (Madame, Biba)")
    public void testLadiesBrandsFullCoverage() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .verifyBrandSidebarVisible()
                .clickMadameBrand()
                .verifyTitleContain("BRAND - MADAME PRODUCTS")
                .verifyProductCount(5, "Madame")
                .clickBibaBrand()
                .verifyTitleContain("BRAND - BIBA PRODUCTS")
                .verifyProductCount(5, "Biba");
    }

    @Test(priority = 3, description = "Positive: Verify Lifestyle Brands (Mast & Harbour)")
    public void testLifestyleBrandsFullCoverage() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .verifyBrandSidebarVisible()
                .clickMastAndHarbourBrand()
                .verifyTitleContain("BRAND - MAST & HARBOUR PRODUCTS")
                .verifyProductCount(3, "Mast & Harbour");
    }

    @Test(priority = 4, description = "Positive: Verify Kids Brands (Babyhug, Allen Solly, Kookie Kids)")
    public void testKidsBrandsFullCoverage() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .verifyBrandSidebarVisible()
                .clickBabyhugBrand()
                .verifyTitleContain("BRAND - BABYHUG PRODUCTS")
                .verifyProductCount(4, "Babyhug")
                .clickAllenSollyBrand()
                .verifyTitleContain("BRAND - ALLEN SOLLY JUNIOR PRODUCTS")
                .verifyProductCount(3, "Allen Solly")
                .clickKookieKidsBrand()
                .verifyTitleContain("BRAND - KOOKIE KIDS PRODUCTS")
                .verifyProductCount(3, "Kookie Kids");
    }

    @Test(priority = 5, description = "Negative: Brand Header should not be visible initially")
    public void testInitialStateNoBrandSelected() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .verifyBrandSidebarVisible()
                .verifyBrandHeaderNotVisible();
    }

    @Test(priority = 6, description = "Negative: Verify Isolation (Polo Page should not show H&M Title)")
    public void testBrandIsolationPoloActive() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .clickPoloBrand()
                .verifyTitleContain("POLO")
                .verifyTitleDoesNotContain("H&M");
    }

    @Test(priority = 7, description = "Negative: Verify Isolation (Babyhug Page should not show Polo Title)")
    public void testBrandIsolationBabyhugActive() {
        brandPage = new BrandPage(driver);
        brandPage
                .navigateToProductsPage()
                .clickBabyhugBrand()
                .verifyTitleContain("BABYHUG")
                .verifyTitleDoesNotContain("POLO");
    }
}