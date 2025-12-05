/*package project_automationexercise;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import project_automationexercise.base.BasePage;

public class TC07_VerifyTestCasesPagePage extends BasePage {

    private final By homePageVerify     = By.cssSelector("img[alt='Website for automation practice']");
    private final By testCasesBtn       = By.cssSelector("a[href='/test_cases']");
    private final By testCasesPageTitle = By.xpath("//b[text()='Test Cases']");

    @Test
    public void testVerifyTestCasesPage() {

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(homePageVerify)).isDisplayed(),
                "Home page is not visible");

        wait.until(ExpectedConditions.elementToBeClickable(testCasesBtn)).click();

        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(testCasesPageTitle)).isDisplayed(),
                "Test Cases page not loaded successfully");
    }
}
 */