package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.*;


public class SurveyPage_Sefa {

    public SurveyPage_Sefa() {

        PageFactory.initElements(Driver.getDriver(),this);

    }


        //locate the login button for username and password
// button for password
// and login button
        @FindBy(id = "login")
        public WebElement email;

        @FindBy(id = "password")
        public WebElement passwordButton;

        @FindBy(className = "btn btn-primary")
        public WebElement logInButton;

        @FindBy(xpath = "//a[@data-menu='475']")
        public WebElement surveyButton;

        @FindBy(xpath = "//button[@class='btn btn-primary btn-sm o-kanban-button-new']")
        public WebElement createButton;

        @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
        public WebElement saveButton;


    }
