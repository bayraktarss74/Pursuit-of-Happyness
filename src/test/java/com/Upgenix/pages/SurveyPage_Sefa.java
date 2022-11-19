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

        PageFactory.initElements(Driver.getDriver(), this);

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

    @FindBy(xpath = "/html/body/div[1]/div[2]/div[1]/div[2]/div[1]/div/div[2]/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    public WebElement errorMessage;

    @FindBy (xpath = "(//*[contains(@id,'o_field_input')])[2]")
    public WebElement titleField;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[2]/div[2]/div/p")
    public WebElement surveyMessage;


    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[55]/div[2]/h4/span")
    public WebElement createdName;


    @FindBy (xpath ="//input[@class='o_searchview_input']")
    public WebElement surveySearchInput;

    @FindBy (xpath = "/html/body/div[1]/div[2]/div[2]/div/div/div/div[1]/div[2]")
    public WebElement createdSurvey;


}
