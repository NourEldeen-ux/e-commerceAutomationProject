package com.automation.step_definitions;

import com.automation.pages.CreateOrderPage;
import com.automation.pages.ShoppingCart;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.automation.step_definitions.Hooks.driver;

public class CreateSuccessfulOrderStepDefinition {
    ShoppingCart shoppingCart;
    CreateOrderPage createOrderPage;

    @And("user complete order")
    public void userCompleteOrder() throws InterruptedException {
        shoppingCart = new ShoppingCart(driver);
        createOrderPage = new CreateOrderPage(driver);
        createOrderPage.checkout();
        createOrderPage.billingAddressInput("NourEldeen", "Ahmed", "noureldeenahmed9@gmail.com", "test", "Egypt", "Cairo", "0", "address1", "address2", "12345", "01234567890", "12345678");
        createOrderPage.shippingMethodInput("Ground");
        createOrderPage.paymentMethodInput("Check");
        createOrderPage.checkPaymentInfoInput();
        createOrderPage.confirmOrder();
    }

    @Then("order placed successfully")
    public void orderPlacedSuccessfully() {
        Assert.assertEquals(createOrderPage.getSuccessfulOrderMsg().getText(), "Your order has been successfully processed!", "Successful checkout");
    }
}
