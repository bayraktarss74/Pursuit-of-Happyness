package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.InventoryPage_Hamdi;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import static com.Upgenix.utilities.ConfigurationReader.*;
import static com.Upgenix.utilities.Driver.*;
import static org.junit.Assert.*;

public class InventoryStepDefinitions_Hamdi {

    InventoryPage_Hamdi ewm_hamdi = new InventoryPage_Hamdi();
    WebDriverWait wait = new WebDriverWait(getDriver(), 15);
    Faker faker = new Faker();

    final String id = String.valueOf(faker.idNumber());

    @Given("user should be on the login page")
    public void user_should_be_on_the_login_page() {
        getDriver().get(getProperty("qa.env"));
    }
    @Given("user should write the valid {string} in email box")
    public void user_should_write_the_valid_in_email_box(String string) {
        ewm_hamdi.userNameField.sendKeys(string);
    }
    @Given("user should write the valid {string} in password box")
    public void user_should_write_the_valid_in_password_box(String string) {
        ewm_hamdi.userPasswordField.sendKeys(string);
    }

    @And("user should click the submit button")
    public void userShouldClickTheSubmitButton() {
        ewm_hamdi.submitButton.click();
    }

    @Given("user should click on the Inventory tag")
    public void user_should_click_on_the_ınventory_tag() {
        ewm_hamdi.inventoryButton.click();
    }
    @Given("user should see the page title like {string}")
    public void user_should_see_the_page_title_like(String string) {
        wait.until(ExpectedConditions.titleIs(string));
        assertEquals(string,getDriver().getTitle());
    }
    @Given("user should click on the Products tag")
    public void user_should_click_on_the_products_tag() {
        ewm_hamdi.productButton.click();
    }
    @Given("user should click on the {string} button on the page")
    public void user_should_click_on_the_button_on_the_page(String string) {
        ewm_hamdi.createButton.click();
    }

    @When("user should click to the save button")
    public void user_should_click_to_the_create_button() {
        ewm_hamdi.saveButton.click();
    }
    @Then("user should see the {string} warning")
    public void user_should_see_the_warning(String string) {
        assertEquals(string,ewm_hamdi.warningTag.getText());
    }

    @When("user write a product name as {string} in to product box")
    public void user_write_a_product_name_as_in_to_product_box(String string) {
        ewm_hamdi.productNameBox.sendKeys(string);
    }

    @Then("user see that page title includes {string}")
    public void user_see_that_page_title_includes(String string) {
        wait.until(ExpectedConditions.titleIs(string+" - Odoo"));
        assertTrue(getDriver().getTitle().contains(string));
    }

    @And("user write the {string} in the search box")
    public void userWriteTheInTheSearchBox(String string) {
        ewm_hamdi.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("user should see the {string} on the page")
    public void user_should_see_the_on_the_page(String string) throws InterruptedException {
        Thread.sleep(1000);
        String controlProductName = getDriver().findElement(By.xpath("//*[@class=\"o_kanban_record_title\"]")).getText();
        assertEquals(string, controlProductName);
    }

}
