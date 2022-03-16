package com.automation.tests;

import com.automation.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

      LoginPage loginPage;

    public LoginTest(WebDriver driver) {
        super();
    }

    @Test
    public void login(){

    loginPage= new LoginPage(driver);
    driver.navigate().to("https://demo.nopcommerce.com/");
    loginPage.login("noureldeenahmed9@gmail.com","nour1234");

    }

}
