package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCartPage extends PageBase{

    public AddToCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;

    @FindBy (id = "add-to-cart-button-4")
    WebElement addToCartBtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToCartMsg;

    public void clickAddToCart(){
        macAppel.click();
        addToCartBtn.click();
    }

    public WebElement getAddedToCartMsg() {
        return addedToCartMsg;
    }

}
