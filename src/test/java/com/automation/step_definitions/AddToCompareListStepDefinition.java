package com.automation.step_definitions;

import com.automation.pages.BooksPage;
import com.automation.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

import static com.automation.step_definitions.Hooks.driver;

public class AddToCompareListStepDefinition {
    BooksPage booksPage;
    LoginPage loginPage;

    @And("user add items to compare list")
    public void userAddItemsToCompareList() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnBooksCat();
        booksPage = new BooksPage(driver);
        booksPage.addItemsToCompare();
    }

    @And("user navigate to compare list")
    public void userNavigateToCompareList() {
        booksPage.openComparePage();
    }

    @Then("added items should appear at compare list")
    public void addedItemsShouldAppearAtCompareList() {
        WebElement compareListTitle = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(compareListTitle.getText(), "Compare products");

        List<WebElement> itemsName = driver.findElements(By.xpath("//tr[@class=\"product-name\"]//a"));
        Assert.assertEquals(itemsName.get(0).getText(),"Fahrenheit 451 by Ray Bradbury");
        Assert.assertEquals(itemsName.get(1).getText(),"First Prize Pies");
        Assert.assertEquals(itemsName.get(2).getText(),"Pride and Prejudice");
    }
}
