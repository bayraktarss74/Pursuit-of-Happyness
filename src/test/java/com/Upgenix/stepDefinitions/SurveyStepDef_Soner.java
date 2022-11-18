package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.SurveyPage_Sefa;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SurveyStepDef_Soner {


    SurveyPage_Sefa surveyPage_sefa=new SurveyPage_Sefa();


    @When("User locates surveys button on the screen and clicks on the surveys button")
    public void user_locates_surveys_button_on_the_screen_and_clicks_on_the_surveys_button() {

        surveyPage_sefa.surveyButton.click();
    }

    @Then("User reaches Surveys-New with survey form below")
    public void user_reaches_surveys_new_with_survey_form_below() {

        String expectedTitle="Surveys - Odoo";
        String actualTitle= Driver.getDriver().getTitle();
        assertEquals(expectedTitle,actualTitle);

    }
    @Then("User locates create button on the screen and clicks on create button")
    public void user_locates_create_button_on_the_screen_and_clicks_on_create_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(surveyPage_sefa.createButton));
        surveyPage_sefa.createButton.click();

    }


    @And("user should write the valid posid {string} in email box")
    public void userShouldWriteTheValidPosidInEmailBox(String arg0) {
        surveyPage_sefa.email.sendKeys(arg0);

    }

    @And("user should write the valid pospass{string} in password box")
    public void userShouldWriteTheValidPospassInPasswordBox(String arg0) {
        surveyPage_sefa.passwordButton.sendKeys(arg0);
    }
}
