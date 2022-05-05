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

public class AddToShoppingCartStepDefinition {

    LoginPage loginPage;
    BooksPage booksPage;

    @And("user navigate to books pages")
    public void userNavigateToBooksPages() {
        loginPage = new LoginPage(driver);
        loginPage.clickOnBooksCat();
    }

    @And("user add items to shopping cart")
    public void userAddItemsToShoppingCart() {
        booksPage = new BooksPage(driver);
        booksPage.addItemsToCart();
    }

    @And("user navigate to shopping cart")
    public void userNavigateToShoppingCart() {
        booksPage.openShoppingCartPage();

    }

    @Then("added items should appear at shopping cart")
    public void addedItemsShouldAppearAtShoppingCart() {
        List<WebElement> itemsName = driver.findElements(By.xpath("//a[@class=\"product-name\"]"));
        Assert.assertEquals(itemsName.get(0).getText(),"Fahrenheit 451 by Ray Bradbury");
        Assert.assertEquals(itemsName.get(1).getText(),"First Prize Pies");
        Assert.assertEquals(itemsName.get(2).getText(),"Pride and Prejudice");
    }
}
