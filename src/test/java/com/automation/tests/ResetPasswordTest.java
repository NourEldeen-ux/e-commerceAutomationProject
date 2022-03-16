package com.automation.tests;

import com.automation.pages.ResetPasswordPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ResetPasswordTest extends TestBase{

         ResetPasswordPage resetPasswordPage;

    @Test
    public void resetEmail(){

        resetPasswordPage = new ResetPasswordPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");
        resetPasswordPage.resetPassword("elnoninobaggio@gmail.com");
        String expectedResult = driver.findElement(By.xpath("//p[@class=\"content\"]")).getText();
        String actualResult = "Email with instructions has been sent to you.";

        Assert.assertEquals(expectedResult,actualResult);

    }










}
