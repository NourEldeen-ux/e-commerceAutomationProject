package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToCompareListPage extends PageBase{

    public AddToCompareListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(linkText = "Apple MacBook Pro 13-inch")
    WebElement macAppel;

    @FindBy (css = "div[class='compare-products'] button[type='button']")
    WebElement comparelistbtn;

    @FindBy (xpath = "//p[@class=\"content\"]")
    WebElement addedToComparelistMsg;

    public void clickAddToCompareList(){
        macAppel.click();
        comparelistbtn.click();
    }

    public WebElement getAddedToComparelistMsg() {
        return addedToComparelistMsg;
    }

}
