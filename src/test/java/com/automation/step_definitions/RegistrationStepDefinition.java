package com.automation.step_definitions;

import com.automation.pages.HomePage;
import com.automation.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static com.automation.step_definitions.Hooks.driver;

public class RegistrationStepDefinition {

    HomePage homePage;
    RegisterPage registerPage;

    @And("user clicked on register link")
    public void clickOnRegisterButton() {
        homePage = new HomePage(driver);
        homePage.registerClick();
    }

    @When("user selected gender")
    public void selectGender(){
        registerPage = new RegisterPage(driver);
        registerPage.setGender("male");
    }

    @And("user entered first name")
    public void enterFirstName(){
        registerPage.setFirstName("NourElden");
    }
    @And("user entered last name")
    public void enterLastName(){
        registerPage.setLastName("Ahmed");
    }

    @And("user selected birth of date")
    public void enterBirthOfDate(){
        registerPage.setDayOfBirth(19);
        registerPage.setMonthOfBirth("August");
        registerPage.setYearOfBirth(1995);
    }

    @And("user entered email for registration")
    public void enterEmail(){
        registerPage.setEmail("nour@test.com");
    }
    @And("user entered company name")
    public void enterCompanyName(){
        registerPage.setCompanyName("Cairo");
    }
    @And("user entered password for registration")
    public void enterPassword(){
        registerPage.setPassword("123456789");
    }
    @And("user confirmed password for registration")
    public void confirmPassword(){
        registerPage.confirmPassword("123456789");
    }

    @And("user clicked on register button")
    public void userClickedOnRegisterButton() {
        registerPage.clickRegisterButton();
    }


    @Then("user should have a success message for registration")
    public void userShouldHaveASuccessMessageForRegistration() {
        WebElement registerTitle = driver.findElement(By.xpath("//h1"));
        Assert.assertEquals(registerTitle.getText(), "Register");

        String registerMessage = driver.findElement(By.xpath("//div[@class=\"result\"]")).getText();
        Assert.assertEquals(registerMessage, "Your registration completed");
    }

}
