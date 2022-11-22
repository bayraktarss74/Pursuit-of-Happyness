package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.EmpPageHkmt;
import com.Upgenix.utilities.ConfigurationReader;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;


public class Emp_Step_Def_Hkmt {

    private EmpPageHkmt emp = new EmpPageHkmt();


    @Given("login")
    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa.env"));
        emp.username.sendKeys(ConfigurationReader.getProperty("qa.email"));
        emp.password.sendKeys(ConfigurationReader.getProperty("qa.password"));
        emp.signinbttn.click();
        Assert.assertTrue(Driver.getDriver().getTitle(), Driver.getDriver().getTitle().equalsIgnoreCase("Odoo") );
    }

    @When("User click employees button")
    public void user_click_employees_button() {
        emp.employeeBttn.click();

    }

    @When("User click create button")
    public void user_click_create_button() {
        emp.createBttn.click();

    }

    @Then("User should see the title as New - Odoo")
    public void user_should_see_the_title_as_new_odoo() {
        Assert.assertTrue(Driver.getDriver().getTitle(), Driver.getDriver().getTitle().equalsIgnoreCase("Odoo") );

    }

    @When("User write nothing")
    public void user_write_nothing() {
        emp.inputEmpName.sendKeys("");

    }

    @When("User click save button")
    public void user_click_save_button() {
        emp.saveBttn.click();

    }

    @Then("User should see error mesage")
    public void user_should_see_error_mesage() {
        emp.errorMsg.isDisplayed();

    }

    @When("User write a name")
    public void user_write_a_name() {
        emp.inputEmpName.sendKeys("ibo");

    }

    @Then("User should see created mesage")
    public void user_should_see_created_mesage() {
        emp.createMsg.isDisplayed();

    }

    @When("User click search input")
    public void user_click_search_input() {
        emp.empSearch.click();

    }

    @When("User enter the name and click")
    public void user_enter_the_name_and_click() {
        emp.empSearch.sendKeys("ibo", Keys.ENTER);

    }

    @Then("User should see the entered employee name in the employees list")
    public void user_should_see_the_entered_employee_name_in_the_employees_list() {
        Assert.assertEquals(emp.listedEmpName, "ibo");

    }
}
