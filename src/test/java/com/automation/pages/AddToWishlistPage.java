package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishlistPage extends PageBase {

    public AddToWishlistPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;

    @FindBy (id = "add-to-wishlist-button-4")
    WebElement wishlistbtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToWishlistMsg;

    public void clickAddToWishlist(){
        macAppel.click();
        wishlistbtn.click();
    }

    public WebElement getAddedToWishlistMsg() {
        return addedToWishlistMsg;
    }

}
