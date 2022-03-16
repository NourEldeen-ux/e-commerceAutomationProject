package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Register")
    WebElement registerButton;

    @FindBy(id= "FirstName")
    WebElement firstnamefield;

    @FindBy(id = "LastName")
    WebElement lastnamefield;

    @FindBy(id="Email")
    WebElement emailfield;

    @FindBy(id="Password")
    WebElement passwordfield;

    @FindBy(id="ConfirmPassword")
    WebElement confirmPasswordfield;

    @FindBy(id="register-button")
    WebElement registerBtn;

    public void registeruser(String firstname, String lastname , String email , String password , String confirmPassword) {

        registerButton.click();
        firstnamefield.sendKeys(firstname);
        lastnamefield.sendKeys(lastname);
        emailfield.sendKeys(email);
        passwordfield.sendKeys(password);
        confirmPasswordfield.sendKeys(confirmPassword);
        registerBtn.click();

    }
}