package com.automation.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends PageBase {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "gender-male")
    WebElement genderMaleRadioButton;
    @FindBy(id = "gender-female")
    WebElement genderFemaleRadioButton;
    @FindBy(id = "FirstName")
    WebElement firstNameText;
    @FindBy(id = "LastName")
    WebElement lastNameText;

    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;
    @FindBy(name = "DateOfBirthMonth")
    WebElement dateOfBirthMonth;
    @FindBy(name = "DateOfBirthYear")
    WebElement dateOfBirthYear;

    @FindBy(id = "Email")
    WebElement emailEditText;
    @FindBy(id = "Company")
    WebElement companyNameEditText;
    @FindBy(id = "Newsletter")
    WebElement newsletterCheckBox;
    @FindBy(id = "Password")
    WebElement passwordEditText;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordEditText;
    @FindBy(id = "register-button")
    WebElement registerButton;

    public void setGender(String gender){
        if (gender.equalsIgnoreCase("male")){
            genderMaleRadioButton.click();
        }else if (gender.equalsIgnoreCase("female")){
            genderFemaleRadioButton.click();
        }
    }
    public void registeruser(String firstname, String lastname , String email , String password , String confirmPassword) {

        registerButton.click();
        firstNameText.sendKeys(firstname);
        lastNameText.sendKeys(lastname);
        emailEditText.sendKeys(email);
        passwordEditText.sendKeys(password);
        confirmPasswordEditText.sendKeys(confirmPassword);
        registerButton.click();

    }

    public void setFirstName(String firstName){
        firstNameText.sendKeys(firstName);
    }
    public void setLastName(String lastName){
        lastNameText.sendKeys(lastName);
    }


    public void setDayOfBirth(int day){
        Select daySelect = new Select(dateOfBirthDay);
        daySelect.selectByValue(String.valueOf(5));
    }
    public void setMonthOfBirth(String month){
        Select monthSelect = new Select(dateOfBirthMonth);
        monthSelect.selectByVisibleText(month);
    }
    public void setYearOfBirth(int year){
        Select yearSelect = new Select(dateOfBirthYear);
        yearSelect.selectByValue(String.valueOf(year));
    }

    public void setEmail(String email){
        emailEditText.sendKeys(email);
    }

    public void setCompanyName(String company){
        companyNameEditText.sendKeys(company);
    }

    public void selectNewsLetter(){
        if (!newsletterCheckBox.isSelected()){
            newsletterCheckBox.click();
        }
    }

    public void setPassword(String password){
        passwordEditText.sendKeys(password);
    }

    public void confirmPassword(String password){
        confirmPasswordEditText.sendKeys(password);
    }

    public void clickRegisterButton(){
        registerButton.click();
    }
}