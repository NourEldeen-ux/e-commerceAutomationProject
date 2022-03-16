package com.automation.tests;

import com.automation.pages.SearchProductPage;
import com.automation.step_definitions.Hooks;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.PublicKey;

public class SearchProductTest extends TestBase {

    SearchProductPage searchProductPage;

    @Test
    public void searchForProduct() {
        searchProductPage = new SearchProductPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        searchProductPage.searchProduct("laptop");
    }

    @Test
    public void FindRelativeResults() {
        searchProductPage = new SearchProductPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        searchProductPage.searchProduct("laptop");
        int count = driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count; x++) {
            System.out.println(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("laptop"));
        }
    }
}