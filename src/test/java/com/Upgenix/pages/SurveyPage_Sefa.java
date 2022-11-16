package com.Upgenix.pages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


public class SurveyPage_Sefa {

//locate the login button for username and password
// button for password
// and login button
    @FindBy(id = "login")
    public WebElement loginButton;

    @FindBy (id = "password")
    public WebElement passwordButton;

    @FindBy (className = "btn btn-primary")
    public WebElement logInButton;





}
