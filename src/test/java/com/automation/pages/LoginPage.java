package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class=\"ico-login\"]")
    WebElement loginButton;

    @FindBy(id = "Email")
    WebElement emailfield;

    @FindBy(id = "Password")
    WebElement passwordfield;

    @FindBy(xpath = "//button[normalize-space()=\"Log in\"]")
    WebElement loginbtn;


    public void login(String email , String password){
         loginButton.click();
         emailfield.sendKeys(email);
         passwordfield.sendKeys(password);
         loginbtn.click();
     }






}
