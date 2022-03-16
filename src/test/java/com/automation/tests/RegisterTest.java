package com.automation.tests;

import com.automation.pages.RegisterPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterPage registerPage;

@Test
public void RegisterUser(){

        registerPage = new RegisterPage(driver);
        driver.navigate().to("https://demo.nopcommerce.com/");

        //Change the email in parameter before running this test case to make the test pass
        registerPage.registeruser("nour", "ahmed", "elnoninobaggio111@gmail.com", "nour1234", "nour1234");

        String expectedResult = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        String ActualResult = "Your registration completed";

        Assert.assertEquals(ActualResult,expectedResult);

    }
}
