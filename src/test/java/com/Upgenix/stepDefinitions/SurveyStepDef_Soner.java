package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.SurveyPage_Sefa;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import com.github.javafaker.Faker;
import static org.junit.Assert.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SurveyStepDef_Soner {


    SurveyPage_Sefa surveyPage_sefa = new SurveyPage_Sefa();



    private WebDriverWait wait= new WebDriverWait(Driver.getDriver(),20);
    private Faker faker=new Faker();
    private String name="";

    @When("User locates surveys button on the screen and clicks on the surveys button")
    public void user_locates_surveys_button_on_the_screen_and_clicks_on_the_surveys_button() {

        surveyPage_sefa.surveyButton.click();
    }

    @Then("User reaches Surveys-New with survey form below")
    public void user_reaches_surveys_new_with_survey_form_below() {

        String expectedTitle = "Surveys - Odoo";
        String actualTitle = Driver.getDriver().getTitle();
        assertEquals(expectedTitle, actualTitle);

    }

    @Then("User locates create button on the screen and clicks on create button")
    public void user_locates_create_button_on_the_screen_and_clicks_on_create_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
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

    @When("User is on the new survey page locates save button and clicks")
    public void userIsOnTheNewSurveyPageLocatesSaveButtonAndClicks() {

        surveyPage_sefa.saveButton.click();

    }

    @Then("User receives The following fields are invalid message.")
    public void userReceivesTheFollowingFieldsAreInvalidTitle() {

        String expectedMessage = "The following fields are invalid:";
        String actualMessage = surveyPage_sefa.errorMessage.getText();
        Assert.assertEquals(expectedMessage, actualMessage);
    }

    @Given("User locates the title button and and sends key to the title section for a name")
    public void userLocatesTheTitleButtonAndAndSendsKeyToTheTitleSectionForAName() {
        name=faker.name().fullName();
        surveyPage_sefa.titleField.sendKeys(name);


    }


    @Then("User locates save button and clicks on it")
    public void userLocatesSaveButtonAndClicksOnIt() {
        surveyPage_sefa.saveButton.click();

    }

    @Then("user locates the message below as {string}")
    public void userLocatesTheMessageBelowAs(String arg0) {

        String expectedMessage="Survey created";
        String actualMessage=surveyPage_sefa.surveyMessage.getText();
        Assert.assertEquals(expectedMessage,actualMessage);

    }


    @Then("User fills Search Input with the created Survey's name and press Enter")
    public void userFillsSearchInputWithTheCreatedSurveySNameAndPressEnter() {

     wait.until(ExpectedConditions.visibilityOf(surveyPage_sefa.surveySearchInput));
     surveyPage_sefa.surveySearchInput.sendKeys(name+ Keys.ENTER);

    }

    @Then("User should see created survey is listed")
    public void userShouldSeeCreatedSurveyIsListed() {

        String expectedName=name;
        try{
            wait.until(ExpectedConditions.textToBePresentInElement(surveyPage_sefa.createdSurvey, name));
            String actualName=surveyPage_sefa.createdName.getTagName();
            Assert.assertEquals(expectedName,actualName);
        }catch (NoSuchElementException e){
            Assert.fail();
        }

    }
}
