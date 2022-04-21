package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ShoppingCart {
    @FindBy(id = "termsofservice")
    WebElement acceptTerms;
    @FindBy(id = "checkout")
    WebElement checkoutBtn;
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1;
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement postalCode;
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phone;
    @FindBy(xpath = "//div[@id=\"billing-buttons-container\"]//button[@name=\"save\"]")
    WebElement continue2ndStep;
    @FindBy(id = "shipping-method-please-wait")
    WebElement continueSteps;
    @FindBy(xpath = "//div[@id=\"confirm-order-buttons-container\"]/button")
    WebElement confirmOrder;

    WebDriver driver;

    public ShoppingCart(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
        driver.manage().window().maximize();
    }

    public void completeOrder(){
        acceptTerms.click();
        checkoutBtn.click();
        Select countrySelect = new Select(country);
        countrySelect.selectByValue("Egypt");
        city.sendKeys("Alexandria");
        address1.sendKeys("Alex,Build1");
        postalCode.sendKeys("123456");
        phone.sendKeys("0123456789");
        continue2ndStep.click();
        continueSteps.click();
        continueSteps.click();
        continueSteps.click();
        confirmOrder.click();
    }
}
