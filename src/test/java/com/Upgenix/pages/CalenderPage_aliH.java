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

    @FindBy(xpath = "//h4[.='Create']")
    public WebElement createHeader;

    @FindBy(xpath = "//input[@class='o_input']")
    public WebElement eventSummary;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement createEventButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement eventHeader;

    @FindBy (xpath ="//span[.='Edit']/..")
    public WebElement eventEditButton;

    @FindBy (xpath = "//input[@class='o_field_char o_field_widget o_input o_required_modifier']")
    public WebElement changeEventName;

    @FindBy (xpath = "//span[.='Delete']/..")
    public WebElement deleteEventButton;

    @FindBy (xpath = "//span[.='Save']/..")
    public WebElement eventSaveButton;

    @FindBy (xpath = "//span[.='Ok']/..")
    public WebElement deleteEventOkButton;



}
