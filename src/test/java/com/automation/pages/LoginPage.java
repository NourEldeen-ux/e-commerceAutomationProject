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
    WebElement emailField;

    @FindBy(id = "Password")
    WebElement passwordField;

    @FindBy(xpath = "//button[normalize-space()=\"Log in\"]")
    WebElement loginBtn;

    @FindBy(xpath = "//a[normalize-space()='Forgot password?']")
    WebElement forgetPassword;

    @FindBy(xpath = "//body/div[6]/div[2]/ul[1]/li[5]/a[1]")
    WebElement booksCat;

    public void login(String email , String password){
         loginButton.click();
         emailField.sendKeys(email);
         passwordField.sendKeys(password);
         loginBtn.click();
     }

    public void enterEmail(String email){
        emailField.sendKeys(email);
    }
    public void enterPassword(String password){
        passwordField.sendKeys(password);
    }
    public void clickLogIn(){
        loginButton.click();
    }
    public void clickForgetPassword(){
        forgetPassword.click();
    }
    public void clickOnBooksCat(){
        booksCat.click();
    }

}
