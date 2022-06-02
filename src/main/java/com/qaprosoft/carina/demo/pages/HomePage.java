package com.qaprosoft.carina.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(css = "#twotabsearchtextbox")
    private static WebElement searchField;

    @FindBy(css = "#nav-search-submit-button")
    private static WebElement searchButton;

    @FindBy(xpath = "//span[contains(@id,'nav-link-accountList')]")
    private static WebElement accountBar;

    public HomePage(WebDriver driver) {
        super(driver, "https://www.amazon.com");
        openPage("https://www.amazon.com");
    }

    public HomePage inputToSearchFieldText(String searchText) {
        inputTextTo(searchField, searchText);
        return this;
    }

    public ProductListPage clickOnSearchButton() {
        clickOnElement(searchButton);
        ProductListPage productListPage = new ProductListPage(driver);
        return productListPage;
    }

    public LoginPage clickOnAccountBar() {
        clickOnElement(accountBar);
        LoginPage loginPage = new LoginPage(driver);
        return loginPage;
    }
}
