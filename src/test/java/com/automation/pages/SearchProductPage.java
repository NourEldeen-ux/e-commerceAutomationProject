package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchProductPage extends PageBase{

    public SearchProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="small-searchterms")
    WebElement searchfield;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    WebElement searchBtn;

    public void searchProduct(String keyword){
        searchfield.click();
        searchfield.sendKeys(keyword);
        searchBtn.click();

    }
}
