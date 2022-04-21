package com.automation.step_definitions;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static com.automation.step_definitions.Hooks.driver;

public class SelectDifferentCategoriesStepDefinition {

    HomePage homePage;

    @And("user hover on electronic category")
    public void userHoverOnElectronicCategory() {
        homePage = new HomePage(driver);
        homePage.hoverOnElectronicsCat();
    }

    @And("user click on cellPhone category")
    public void userClickOnCellPhoneCategory() {
        homePage.clickOnCellPhoneCat();
    }

    @Then("cell phones page should appear to the user")
    public void cellPhonesAppear() {
        String expectedUrl = "https://demo.nopcommerce.com/cell-phones";
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl);
    }
}
