package com.automation.tests;

import com.automation.pages.SelectDifferentTagsPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SelectDifferentTagsTest extends TestBase{

    SelectDifferentTagsPage selectDifferentTagsPage;

    @Test
    public void selectDifferentTags(){
        selectDifferentTagsPage = new SelectDifferentTagsPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");

        WebElement we = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Computers\"]"));
        Actions action = new Actions(driver);
        action.moveToElement(we).perform();
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Desktops\"]"))).click().build().perform();

        selectDifferentTagsPage.clickOnDifferentTag();



    }




}
