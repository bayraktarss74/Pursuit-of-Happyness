package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.SurveyPage_Sefa;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SurveyStepDef_Soner {



    SurveyPage_Sefa surveyPage_sefa=new SurveyPage_Sefa();



    @When("User locates surveys button on the screen and clicks on the surveys button")
    public void user_locates_surveys_button_on_the_screen_and_clicks_on_the_surveys_button() {

        surveyPage_sefa.surveyButton.click();


    }
    @Then("User locates create button on the screen and clicks on create button")
    public void user_locates_create_button_on_the_screen_and_clicks_on_create_button() {
        surveyPage_sefa.createButton.click();

    }
    @Then("User reaches Surveys-New with survey form below")
    public void user_reaches_surveys_new_with_survey_form_below() {

    String expectedTitle="New - Odoo";
    String actualTitle= Driver.getDriver().getTitle();
    assertEquals(expectedTitle,actualTitle);

    }

    @When("User is on the new survey page locates save button and clicks")
    public void user_is_on_the_new_survey_page_locates_save_button_and_clicks() {

    }
    @Then("User receives The following fields are invalid title.")
    public void user_receives_the_following_fields_are_invalid_title() {

    }

    @When("User locates the title button and and sends key to the title section with a {string} for name")
    public void userLocatesTheTitleButtonAndAndSendsKeyToTheTitleSectionWithAForName(String arg0) {

    }

    @Then("User locates save button and clicks on it")
    public void userLocatesSaveButtonAndClicksOnIt() {
    }

    @Then("user locates the message below as {string}")
    public void userLocatesTheMessageBelowAs(String arg0) {
    }

    @Then("User scrools down to see {string} name that is given for the survey below")
    public void userScroolsDownToSeeNameThatIsGivenForTheSurveyBelow(String arg0) {
    }
}
