package com.automation.tests;

import com.automation.pages.CreateOrderPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateOrderTest extends TestBase{

    CreateOrderPage createOrderPage;

    @Test
    public void createSuccessfulOrder() throws InterruptedException {

        createOrderPage = new CreateOrderPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        createOrderPage.checkout();

        createOrderPage.billingAddressInput("NourEldeen", "Ahmed", "noureldeenahmed9@gmail.com", "test", "Egypt", "Cairo", "0", "address1", "address2", "12345", "01234567890", "12345678");
        Thread.sleep(2000);
        createOrderPage.shippingMethodInput("Ground");
        Thread.sleep(2000);
        createOrderPage.paymentMethodInput("Check");
        Thread.sleep(2000);
        createOrderPage.checkPaymentInfoInput();
        Thread.sleep(2000);
        createOrderPage.confirmOrder();
        Thread.sleep(1000);
        Assert.assertEquals(createOrderPage.getSuccessfulOrderMsg().getText(), "Your order has been successfully processed!", "Successful checkout");




    }

}
