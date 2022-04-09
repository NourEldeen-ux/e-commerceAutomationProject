package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectDifferentTagsPage extends PageBase {

    public SelectDifferentTagsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[normalize-space()='apparel']")
    WebElement tag;

    public void clickOnDifferentTag(){

        tag.click();

    }
}
