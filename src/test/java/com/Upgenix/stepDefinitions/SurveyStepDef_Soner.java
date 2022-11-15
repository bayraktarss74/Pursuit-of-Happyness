package com.Upgenix.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

public class SurveyStepDef_Soner {

    @Given("User is on Upgenix Homepage")
    public void user_is_on_upgenix_homepage() {

        com.Upgenix.utilities.Driver.getDriver().get("https://qa.upgenix.net/web/login");


    }
    @When("User locates email and password section")
    public void user_locates_email_and_password_section() {



    }
    @When("User enters valid username and password")
    public void user_enters_valid_username_and_password() {

    }
    @Then("User sees posmanager panel")
    public void user_sees_posmanager_panel() {

    }


}
