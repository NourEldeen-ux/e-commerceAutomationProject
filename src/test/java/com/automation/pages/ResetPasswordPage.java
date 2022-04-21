package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResetPasswordPage extends PageBase{

    public ResetPasswordPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@class=\"ico-login\"]")
    WebElement loginButton;

    @FindBy(linkText = "Forgot password?")
    WebElement forgetPassword;

    @FindBy(id = "Email")
    WebElement emailField;

    @FindBy(xpath = "//button[@name=\"send-email\"]")
    WebElement recoverBtn;

    public void resetPassword(String email){

        loginButton.click();
        forgetPassword.click();
        emailField.sendKeys(email);
        recoverBtn.click();
    }


    public void enterEmail(String email){
        emailField.sendKeys(email);
    }

    public void clickOnRecoverBtn(){
        recoverBtn.click();
    }

}
