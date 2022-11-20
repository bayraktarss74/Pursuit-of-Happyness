package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InventoryPage_Hamdi {

    public InventoryPage_Hamdi(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "login")
    public WebElement userNameField;
    @FindBy(id = "password")
    public WebElement userPasswordField;
    @FindBy(xpath = "//button[@class=\"btn btn-primary\"]")
    public WebElement submitButton;

    @FindBy(xpath = "//a[@data-menu=\"347\"]")
    public WebElement inventoryButton;

    @FindBy(xpath = "//a[@data-menu=\"378\"]")
    public WebElement productButton;

    @FindBy(xpath = "//button[@accesskey=\"c\"]")
    public WebElement createButton;

    @FindBy(xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveButton;

    @FindBy(xpath = "//input[@name=\"name\"]")
    public WebElement productNameBox;

    @FindBy (xpath = "//input[@class=\"o_searchview_input\"]")
    public WebElement searchBox;

    @FindBy (className = "o_notification_title")
    public WebElement warningTag;

}
