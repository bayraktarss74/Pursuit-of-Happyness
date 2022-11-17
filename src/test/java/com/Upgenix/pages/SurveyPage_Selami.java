package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SurveyPage_Selami {
    {
            PageFactory.initElements(Driver.getDriver(),this);
        }

        @FindBy(id = "login")
        public WebElement userNameInput;

        @FindBy(id = "password")
        public WebElement passwordInput;

        @FindBy(xpath = "//a[@data-menu='157']")
        public WebElement employeeLink;

    }
