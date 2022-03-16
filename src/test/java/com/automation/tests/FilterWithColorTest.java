package com.automation.tests;

import com.automation.pages.FilterWithColorPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FilterWithColorTest extends TestBase{

      FilterWithColorPage filterWithColorPage;

      @Test
         public void filterWithColor(){
          filterWithColorPage = new FilterWithColorPage(driver);
          driver.navigate().to("https://demo.nopcommerce.com/");

          WebElement we = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Apparel\"]"));
          Actions action = new Actions(driver);
          action.moveToElement(we).perform();
          action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[normalize-space()=\"Shoes\"]"))).click().build().perform();

          driver.findElement(By.id("attribute-option-14")).click();
          Assert.assertTrue(driver.findElement(By.id("attribute-option-14")).isSelected());
      }

}
