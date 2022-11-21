package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.SalesPage_Mustafa;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesStepDefs_Mustafa {

    SalesPage_Mustafa salesPageMustafa = new SalesPage_Mustafa();

    @Given("user is on the dashboard page")
    public void user_is_on_the_dashboard_page() {
        SalesPage_Mustafa.goTo();
        SalesPage_Mustafa.isAtDashboardPage();
    }

    @When("user clicks {string} from the top menu")
    public void user_clicks_from_the_top_menu(String string) throws InterruptedException {
        SalesPage_Mustafa.goToSalesPage();

    }

    @When("user clicks the {string} from the left-side menu-Orders segment")
    public void user_clicks_the_from_the_left_side_menu_orders_segment(String string) throws InterruptedException {
        SalesPage_Mustafa.goToCustomersPage();

    }

    @When("user click the {string} button from the top left-side menu")
    public void user_click_the_button_from_the_top_left_side_menu(String string) throws InterruptedException {
        SalesPage_Mustafa.goToCreateMenu();

    }

    @Then("user can reach New Customer Form")
    public void user_can_reach_new_customer_form() {
        SalesPage_Mustafa.newCustomerFormVerification();

    }

    @When("user ensure that customer name field is blank")
    public void user_ensure_that_customer_name_field_is_blank() {
        SalesPage_Mustafa.nameBoxIsEmpty();
    }

    @And("user clicks the below {string} button on top the window")
    public void userClicksTheBelowButtonOnTopTheWindow(String string) {
        SalesPage_Mustafa.setSaveBtn();
    }

    @Then("user verifies an error message {string} is displayed")
    public void verifiesAnErrorMessageIsDisplayed(String message) {
        SalesPage_Mustafa.alertMessage();
    }


    @When("user enter the customer name field as {string}")
    public void user_enter_the_customer_name_field_as(String CustomerName) {
        SalesPage_Mustafa.newUser();
    }

    @Then("user see the page title includes the customer name after creating a new customer")
    public void user_see_the_page_title_includes_the_customer_name_after_creating_a_new_customer() throws InterruptedException {
        SalesPage_Mustafa.newUserInTitle();
    }

    @When("user enters the customer's name in the Search Box")
    public void user_enters_the_customer_s_name_in_the_search_box() {
        SalesPage_Mustafa.searchBox();
    }

    @Then("user verifies the created new customer data will be displayed in the Customers module")
    public void user_verifies_the_created_new_customer_data_will_be_displayed_in_the_customers_module() throws InterruptedException {
        SalesPage_Mustafa.newCustomerData();
    }


}