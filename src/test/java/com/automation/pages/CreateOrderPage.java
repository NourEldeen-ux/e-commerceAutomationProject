package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class CreateOrderPage extends PageBase{
    public CreateOrderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;

    @FindBy (id = "add-to-cart-button-4")
    WebElement addToCartBtn;

    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingcartbtn;

    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement termsofservicecheckbox;

    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutbtn;

    @FindBy(css = ".button-1.checkout-as-guest-button")
    WebElement guestBtn;

    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNamelbl;

    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNamelbl;

    @FindBy(id = "BillingNewAddress_Email")
    WebElement emaillbl;

    @FindBy(id = "BillingNewAddress_Company")
    WebElement companylbl;

    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement countrylbl;

    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement stateOrProvincelbl;

    @FindBy(id = "BillingNewAddress_City")
    WebElement citylbl;

    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address1lbl;

    @FindBy(id = "BillingNewAddress_Address2")
    WebElement address2lbl;

    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zibOrPostalCodelbl;

    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberlbl;

    @FindBy(id = "BillingNewAddress_FaxNumber")
    WebElement faxNumberlbl;

    @FindBy(xpath = "//*[@id=\'billing-buttons-container\']/input")
    WebElement continueBtn;

    @FindBy(css = "button[class=\"button-1 new-address-next-step-button\"]")
    WebElement billingAddressContinueButton;

    @FindBy(id = "shippingoption_0")
    WebElement groundShipping;

    @FindBy(id = "shippingoption_1")
    WebElement nextDayShipping;

    @FindBy(id = "shippingoption_2")
    WebElement secondDayShipping;

    @FindBy(css = "button[class=\"button-1 shipping-method-next-step-button\"]")
    WebElement shippingMethodContinueButton;

    @FindBy(id = "paymentmethod_0")
    WebElement moneyOrderPaymentMethod;

    @FindBy(id = "paymentmethod_1")
    WebElement creditCardPaymentMethod;

    @FindBy(css = "button[class=\"button-1 payment-method-next-step-button\"]")
    WebElement paymentMethodContinueButton;

    @FindBy(css = "button[class=\"button-1 payment-info-next-step-button\"]")
    WebElement paymentInfoContinueButton;

    @FindBy(css = "button[class=\"button-1 confirm-order-next-step-button\"]")
    WebElement confirmOrderButton;

    @FindBy(xpath = "//strong[text()=\"Your order has been successfully processed!\"]")
    WebElement successfulOrder;


    public void checkout(){
        macAppel.click();
        addToCartBtn.click();
        shoppingcartbtn.click();
        termsofservicecheckbox.click();
        checkoutbtn.click();
        guestBtn.click();
    }

public void billingAddressInput (String firstName,String lastName, String email, String company, String country, String city,String state, String address1, String address2, String zipOrPostalCode,String phoneNumber , String faxNumber ) throws InterruptedException {

        firstNamelbl.sendKeys(firstName);
        lastNamelbl.sendKeys(lastName);
        emaillbl.sendKeys(email);
        Select countrySelector = new Select(countrylbl);
        countrySelector.selectByVisibleText(country);

        Select stateSelector = new Select(stateOrProvincelbl);
        stateSelector.selectByValue("0");

        citylbl.sendKeys(city);
        address1lbl.sendKeys(address1);
        address2lbl.sendKeys(address2);
        zibOrPostalCodelbl.sendKeys(zipOrPostalCode);
        phoneNumberlbl.sendKeys(phoneNumber);
        faxNumberlbl.sendKeys(faxNumber);
        billingAddressContinueButton.click();
        Thread.sleep(500);
    }


    public void shippingMethodInput (String shipping) throws InterruptedException {

        if ( shipping == "Ground") {
            groundShipping.click();
        } else if ( shipping == "Next Day Air") {
            nextDayShipping.click();
        } else {
            secondDayShipping.click();
        }

        shippingMethodContinueButton.click();
        Thread.sleep(500);
    }

    public void paymentMethodInput (String payment) throws InterruptedException {

        if ( payment == "Check") {
            moneyOrderPaymentMethod.click();
        } else if ( payment == "Credit Card"){
            creditCardPaymentMethod.click();
        }

        paymentMethodContinueButton.click();
        Thread.sleep(1000);
    }

    public void checkPaymentInfoInput () throws InterruptedException {

        paymentInfoContinueButton.click();
        Thread.sleep(500);
    }

    public void confirmOrder() throws InterruptedException {
        confirmOrderButton.click();
        Thread.sleep(500);
    }

    public WebElement getSuccessfulOrderMsg() {
        return successfulOrder;
    }
}
