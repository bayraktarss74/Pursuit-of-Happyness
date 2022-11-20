package com.Upgenix.pages;


import com.Upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Calendar_Ali_G {

    public Calendar_Ali_G(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement emailInput;

    @FindBy(id = "password")
    public WebElement passwordInput;

    @FindBy(xpath = "//button[.='Log in']")
    public WebElement logInButton;

    @FindBy(xpath = "//a[@data-action-id='136']")
    public WebElement calendarButton;

    @FindBy (xpath = "//button[text()='Day']")
    public WebElement dayButton;

    @FindBy (xpath = "//button[text()='Month']")
    public WebElement monthButton;

    @FindBy (xpath = "//button[text()='Week']")
    public WebElement weekButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement cretaBox;

    @FindBy (xpath = "//div[@class='form-group']/input")
    public WebElement inputSummary;

    @FindBy(xpath = "//button[.='Create']")
    public WebElement createButton;

    @FindBy(xpath = "//h4[@class='modal-title']")
    public WebElement opentitle;

    @FindBy(xpath = "//button[.='Edit']")
    public WebElement editButton;

    @FindBy (xpath = "//button/span[.='Save']")
    public WebElement saveButton;

    @FindBy (xpath = "//button[.='Delete']")
    public WebElement deleteButton;

    @FindBy (xpath = "//h4[.='Confirmation']")
    public WebElement confirmPage;

    @FindBy (xpath = "//button[.='Ok']")
    public WebElement okButton;

    @FindBy(xpath = "//div[@class='fc-event-container']/a")
    public WebElement eventContainer;

    @FindBy (xpath = "//table/tbody/tr[@data-time='10:00:00']/td[2]")
    public WebElement eventTime;

    @FindBy(xpath = "//*[@id='o_field_input_43']")
    public WebElement inputSummaryEdit;

    @FindBy(xpath = "//h3[text()='Responsible']")
    public WebElement responsibleDisplay;

}
