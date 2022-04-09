package com.automation.tests;

import com.automation.pages.AddToCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends TestBase{

     AddToCartPage addToCartPage;

     @Test
     public void addToCart(){
         addToCartPage = new AddToCartPage(driver);
         driver.navigate().to("https://demo.nopcommerce.com/");

         addToCartPage.clickAddToCart();
         Assert.assertTrue(addToCartPage.getAddedToCartMsg().getText().contains("The product has been added to your"));



     }

}
