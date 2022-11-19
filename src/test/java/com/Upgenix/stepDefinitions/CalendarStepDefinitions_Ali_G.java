package com.Upgenix.stepDefinitions;


import com.Upgenix.pages.Calendar_Ali_G;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CalendarStepDefinitions_Ali_G {

   Calendar_Ali_G cal=new Calendar_Ali_G();
    WebDriverWait wait=new WebDriverWait(Driver.getDriver(),11);

    @Given("User is on the login page and log in successfully")
    public void user_is_on_the_login_page_and_log_in_successfully(List<List<String>> Credentials ) {
        Driver.getDriver().get("https://qa.upgenix.net/web/login");
        cal.emailInput.sendKeys(Credentials.get(0).get(0));
        cal.passwordInput.sendKeys((Credentials.get(0).get(1)));
        cal.logInButton.click();
    }

    @When("User clicks the Calendar button")
    public void user_clicks_the_calendar_button() {
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        cal.calendarButton.click();
    }

    @Then("User first lands on weekly display")
    public void user_first_lands_on_weekly_display() {
        wait.until(ExpectedConditions.attributeContains(cal.weekButton,"class","active"));
        Assert.assertTrue(cal.weekButton.getAttribute("class").contains("active"));
    }

    @When("Users first lands on weekly display")
    public void users_first_lands_on_weekly_display()  {
        wait.until(ExpectedConditions.attributeContains(cal.weekButton,"class","active"));
        Assert.assertTrue(cal.weekButton.getAttribute("class").contains("active"));
    }

    @When("User clicks the Day button. Sees the daily calendar display.")
    public void clicks_the_day_button_sees_the_daily_calendar_display() {
        cal.dayButton.click();
        wait.until(ExpectedConditions.attributeContains(cal.dayButton,"class","active"));
        Assert.assertTrue(cal.dayButton.getAttribute("class").contains("active"));
    }

    @When("User clicks the Month button.")
    public void user_clicks_the_month_button() {
        cal.monthButton.click();
    }

    @Then("User sees the monthly calendar display.")
    public void user_sees_the_monthly_calendar_display()  {
        wait.until(ExpectedConditions.attributeContains(cal.monthButton,"class","active"));
        Assert.assertTrue(cal.monthButton.getAttribute("class").contains("active"));
    }

    @When("User sees a small window with  Create header.")
    public void user_sees_a_small_window_with_create_header() {
        wait.until(ExpectedConditions.visibilityOf(cal.cretaBox));
        Assert.assertTrue(cal.cretaBox.isDisplayed());
    }

    @When("User types {string} in the Summary part of the small window to create an event. And click create button.")
    public void user_types_in_the_summary_part_of_the_small_window_to_create_an_event_and_click_create_button(String subject) {
        wait.until(ExpectedConditions.visibilityOf(cal.inputSummary));
        cal.inputSummary.sendKeys(subject);
        cal.createButton.click();
    }

    @Then("User sees the added event on daily calendar display.")
    public void user_sees_the_added_event_on_daily_calendar_display() {
        wait.until(ExpectedConditions.attributeContains(cal.dayButton,"class","active"));
        String subject="User Stories";
        Assert.assertTrue(cal.eventContainer.getText().contains(subject));
    }

    @When("User clicks the Day button. Sees the daily calendar display. User clicks created event on the daily display.")
    public void user_clicks_the_day_button_sees_the_daily_calendar_display_user_clicks_created_event_on_the_daily_display()  {
        cal.dayButton.click();
        wait.until(ExpectedConditions.attributeContains(cal.dayButton,"class","active"));
        Assert.assertTrue(cal.dayButton.getAttribute("class").contains("active"));
        wait.until(ExpectedConditions.elementToBeClickable(cal.eventContainer));
        cal.eventContainer.click();
    }

    @When("User sees the small window with Open  header. User clicks the Edit button.")
    public void user_sees_the_small_window_with_open_header_user_clicks_the_edit_button() {
        wait.until(ExpectedConditions.visibilityOf(cal.opentitle));
        Assert.assertTrue(cal.opentitle.isDisplayed());
        cal.editButton.click();
    }

    @When("User sees the window with Open header.")
    public void user_sees_the_window_with_open_header() {
        wait.until(ExpectedConditions.visibilityOf(cal.opentitle));
        Assert.assertTrue(cal.opentitle.isDisplayed());
    }

    @And("User can edit the subject by typing {string} and save it by clicking the Save button.")
    public void userCanEditTheSubjectByTypingAndSaveItByClickingTheSaveButton(String subject) {
        wait.until(ExpectedConditions.visibilityOf(cal.inputSummaryEdit));
        cal.inputSummaryEdit.clear();
        cal.inputSummaryEdit.sendKeys(subject);
        cal.saveButton.click();
    }

    @Then("User sees the edited event on the daily display.")
    public void userSeesTheEditedEventOnTheDailyDisplay() throws InterruptedException {
        Thread.sleep(3333);
        String edittedSubject="User Stories about related to failed Test Cases";
        Assert.assertTrue(cal.eventContainer.getText().contains(edittedSubject));
    }

    @When("User sees the window with Confirmation header. User clicks the Ok button.")
    public void user_sees_the_window_with_confirmation_header_user_clicks_the_ok_button() {
        wait.until(ExpectedConditions.visibilityOf(cal.confirmPage));
        Assert.assertTrue(cal.confirmPage.isDisplayed());
        cal.okButton.click();
    }

    @Then("User sees that the created event is deleted successfully.")
    public void user_sees_that_the_created_event_is_deleted_successfully() {
        Assert.assertTrue(String.valueOf(ExpectedConditions.invisibilityOf(cal.responsibleDisplay)),true);
    }

    @And("User clicks  on time {string} box on daily display.")
    public void userClicksOnTimeBoxOnDailyDisplay(String eventTime) {
        wait.until(ExpectedConditions.elementToBeClickable(cal.eventTime));
        cal.eventTime.click();
    }

    @When("User clicks the Calendar button.")
    public void userClicksTheCalendarButton()  {
        wait.until(ExpectedConditions.titleIs("#Inbox - Odoo"));
        cal.calendarButton.click();
    }

    @And("User first lands on weekly display.")
    public void userFirstLandsOnWeeklyDisplay() {
        wait.until(ExpectedConditions.attributeContains(cal.weekButton,"class","active"));
        Assert.assertTrue(cal.weekButton.getAttribute("class").contains("active"));
    }

    @And("User clicks the Day button. User sees the daily calendar display. And User clicks created event on the daily display.")
    public void userClicksTheDayButtonUserSeesTheDailyCalendarDisplayAndUserClicksCreatedEventOnTheDailyDisplay()  {
        cal.dayButton.click();
        wait.until(ExpectedConditions.attributeContains(cal.dayButton,"class","active"));
        Assert.assertTrue(cal.dayButton.getAttribute("class").contains("active"));
        cal.eventContainer.click();
    }

    @And("User sees the small window with Open  header. User clicks the Delete button.")
    public void userSeesTheSmallWindowWithOpenHeaderUserClicksTheDeleteButton() {
        wait.until(ExpectedConditions.visibilityOf(cal.opentitle));
        Assert.assertTrue(cal.opentitle.isDisplayed());
        cal.deleteButton.click();
    }


}
