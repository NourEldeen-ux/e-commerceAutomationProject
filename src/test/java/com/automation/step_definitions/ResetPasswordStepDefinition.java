package com.automation.step_definitions;

import com.automation.pages.LoginPage;
import com.automation.pages.ResetPasswordPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.testng.Assert;

import static com.automation.step_definitions.Hooks.driver;

public class ResetPasswordStepDefinition {

    LoginPage loginPage;
    ResetPasswordPage resetPasswordPage;

    @And("user clicked on forgot password")
    public void userClickedOnForgotPassword() {
        loginPage = new LoginPage(driver);
        loginPage.clickLogIn();
        loginPage.clickForgetPassword();
    }

    @And("user entered email for reset password")
    public void userEnteredEmailForResetPassword() {
        resetPasswordPage = new ResetPasswordPage(driver);
        resetPasswordPage.enterEmail("noureldeen@test.com");
    }

    @And("user clicked on recover button")
    public void userClickedOnRecoverButton() {
        resetPasswordPage.clickOnRecoverBtn();
    }

    @Then("user should have a success message for recover")
    public void userShouldHaveASuccessMessageForRecover() {
        String resetMessage = driver.findElement(By.xpath("//div[@class=\"bar-notification success\"]")).getText();
        Assert.assertEquals(resetMessage, "Email with instructions has been sent to you.");
    }
}
