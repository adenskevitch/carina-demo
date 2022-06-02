package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.demo.pages.HomePage;
import com.qaprosoft.carina.demo.pages.LoginPage;
import com.qaprosoft.carina.demo.pages.ProductListPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.zebrunner.agent.core.webdriver.RemoteWebDriverFactory.getDriver;

public class AmazonTest extends AbstractTest {

    @Test(testName = "Search verification")
    public void searchProductVerification() {
        String productName = "iphone";
        HomePage homePage = new HomePage(getDriver());
        ProductListPage productPage = homePage.inputToSearchFieldText(productName).clickOnSearchButton();
        SoftAssert sa = new SoftAssert();
        productPage.getProducts()
                .forEach(product -> sa.assertTrue(product.getText().toLowerCase().contains(productName)));
        sa.assertAll();
    }

    @Test(testName = "Fail login test")
    public void failLoginVerify() {
        String invalidEmail = "qweqweqwe";
        WebDriver driver = getDriver();
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = homePage.clickOnAccountBar();
        loginPage.inputToEmailFieldText(invalidEmail).clickOnContinueButton();
        String errorMessage = loginPage.getErrorMessageText();
        Assert.assertEquals("We cannot find an account with that email address", errorMessage);
    }
}
