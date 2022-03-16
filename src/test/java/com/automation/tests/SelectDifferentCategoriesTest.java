package com.automation.tests;

import com.automation.pages.SelectDifferentCategoriesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SelectDifferentCategoriesTest extends TestBase{

    SelectDifferentCategoriesPage selectDifferentCategoriesPage;

    @Test
    public void selectDifferentCategories(){
        selectDifferentCategoriesPage = new SelectDifferentCategoriesPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");

        WebElement we = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Computers\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(we).perform();
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Desktops\"]"))).click().build().perform();

        Assert.assertTrue(driver.findElement(By.xpath("//h1[normalize-space()=\"Desktops\"]")).isDisplayed());
    }
}
