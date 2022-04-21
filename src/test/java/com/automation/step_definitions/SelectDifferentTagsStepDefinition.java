package com.automation.step_definitions;

import com.automation.pages.HomePage;
import com.automation.pages.SearchProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.automation.step_definitions.Hooks.driver;

public class SelectDifferentTagsStepDefinition {
    HomePage homePage;
    SearchProductPage searchProductPage;

    @And("user open search page")
    public void userOpenSearchPage() {
        homePage = new HomePage(driver);
        homePage.openSearchPage();
    }

    @And("user choose awesome tag")
    public void userChooseAwesomeTag() {
        searchProductPage = new SearchProductPage(driver);
        searchProductPage.selectAwesomeTag();

    }

    @Then("awesome products page should appear to the user")
    public void awesomeProductAppear() {
        String awesomeUrl = "https://demo.nopcommerce.com/awesome";
        Assert.assertEquals(driver.getCurrentUrl(), awesomeUrl);
    }
}
