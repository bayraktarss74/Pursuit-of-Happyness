package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalenderPage_aliH {
    public CalenderPage_aliH(){

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@href = '/web#menu_id=120&action=136']")
    public WebElement calenderTab;

    @FindBy (xpath = "//button[.= 'Week']")
    public WebElement weekButton;

    @FindBy (xpath = "//button[.= 'Day']")
    public WebElement dayButton;

    @FindBy (xpath = "//button[.= 'Month']")
    public WebElement monthButton;



}
