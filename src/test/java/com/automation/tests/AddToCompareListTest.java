package com.automation.tests;

import com.automation.pages.AddToCompareListPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCompareListTest extends TestBase{

    AddToCompareListPage addToCompareListPage;

    @Test
    public void addToCompareList(){
        addToCompareListPage = new AddToCompareListPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        addToCompareListPage.clickAddToCompareList();
        Assert.assertTrue(addToCompareListPage.getAddedToComparelistMsg().getText().contains("The product has been added to your"));

    }
}
