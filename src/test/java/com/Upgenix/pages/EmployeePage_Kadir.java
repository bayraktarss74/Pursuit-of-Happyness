package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeePage_Kadir {
    public EmployeePage_Kadir(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@accesskey ='c']")
    public WebElement createButton;

    @FindBy(className = "o_form_sheet")
    public WebElement employeeForm;

    @FindBy(xpath = "//button[@accesskey='s']")
    public WebElement saveButton;

    @FindBy(className = "o_notification_title")
    public WebElement errorMessage;

    @FindBy(xpath = "//input[@name='name']")
    public WebElement nameField;
}
