package com.automation.tests;

import com.automation.pages.ChangeCurrencyPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ChangeCurrencyTest extends TestBase{
    ChangeCurrencyPage changeCurrencyPage;

   @Test
    public void changeCurrency(){
       changeCurrencyPage = new ChangeCurrencyPage(driver);
       driver.navigate().to("https://demo.nopcommerce.com/");

       Select se = new Select(driver.findElement(By.xpath("//select[@id=\"customerCurrency\"]")));
       se.selectByVisibleText("Euro");



   }



}
