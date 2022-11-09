package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.EmployeePage_Kadir;
import com.Upgenix.pages.MainPage_Kadir;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Map;

public class EmployeesStepDefs_Kadir {

    private MainPage_Kadir mainPage = new MainPage_Kadir();
    private EmployeePage_Kadir employeePage = new EmployeePage_Kadir();
    private WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);

    @Given("Posmanager is logged in")
    public void posmanager_is_logged_in(List<List<String>> userCredentials) {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
        mainPage.userNameInput.sendKeys(userCredentials.get(0).get(0));
        mainPage.passwordInput.sendKeys(userCredentials.get(0).get(1)+ Keys.ENTER);

    }

    @Given("User clicks the Employee link")
    public void user_clicks_the_employee_link() {
        mainPage.employeeLink.click();

    }
    @Given("User click Create Button")
    public void user_click_create_button() {
        wait.until(ExpectedConditions.visibilityOf(employeePage.createButton));
        employeePage.createButton.click();
    }
    @Then("User should see the New Employee Form")
    public void user_should_see_the_new_employee_form() {
        Assert.assertTrue(employeePage.employeeForm.isDisplayed());
    }

    @Given("User leaves blank Name Field and clicks Save button")
    public void user_leaves_blank_name_field_and_clicks_save_button() {
        employeePage.saveButton.click();
    }

    @Then("User should see the error message")
    public void user_should_see_the_error_message() {
        String expected = "The following fields are invalid:";
        try {
            String actual = employeePage.errorMessage.getText();
            Assert.assertEquals(expected,actual);
        }catch (NoSuchElementException e){
            Assert.fail();
        }


    }

    @Given("User types empty space Name Field and clicks Save button")
    public void user_types_empty_space_name_field_and_clicks_save_button() {
        employeePage.nameField.sendKeys(" ");
        employeePage.saveButton.click();
    }
}
