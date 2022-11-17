package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class SurveyPage_Sefa {

    public SurveyPage_Sefa (){

        PageFactory.initElements(Driver.getDriver(),this);


    }



//locate the login button for username and password
// button for password
// and login button
    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy (id = "password")
    public WebElement passwordButton;

    @FindBy (className = "btn btn-primary")
    public WebElement logInButton;

    @FindBy (className ="oe_menu_text" )
    public WebElement surveyButton;

    @FindBy(className = "btn btn-primary btn-sm o-kanban-button-new")
    public WebElement createButton;

    @FindBy(className = "btn btn-primary btn-sm o_form_button_save")
    public WebElement saveButton;









}
