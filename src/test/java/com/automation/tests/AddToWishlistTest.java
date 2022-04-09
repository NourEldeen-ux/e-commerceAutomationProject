package com.automation.tests;

import com.automation.pages.AddToWishlistPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToWishlistTest extends TestBase{

    AddToWishlistPage addToWishlistPage;

    @Test
    public void addToWishlist(){
        addToWishlistPage = new AddToWishlistPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        addToWishlistPage.clickAddToWishlist();
        Assert.assertTrue(addToWishlistPage.getAddedToWishlistMsg().getText().contains("The product has been added to your"));

    }

}
