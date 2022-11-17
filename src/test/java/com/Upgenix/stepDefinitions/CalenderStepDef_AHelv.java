package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.CalenderPage_aliH;
import com.Upgenix.pages.LoginPage_AliH;
import com.Upgenix.utilities.BrowserUtils;
import com.Upgenix.utilities.ConfigurationReader;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderStepDef_AHelv {

    CalenderPage_aliH calenderPage_aliH = new CalenderPage_aliH();
    LoginPage_AliH loginPage_aliH = new LoginPage_AliH();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    String eventTime = ConfigurationReader.getProperty("eventTime");
    String shortEventTime = ConfigurationReader.getProperty("eventTime").substring(0, 5);
    String timeBoxLocator = "//tr[@data-time ='" + eventTime + "']//td[@class = 'fc-widget-content']";

    @Given("User logged in as a posmanager")
    public void user_logged_in_as_a() {

        Driver.getDriver().get(ConfigurationReader.getProperty("qa.env"));
        loginPage_aliH.login(ConfigurationReader.getProperty("qa.user"), ConfigurationReader.getProperty("qa.pass"));

    }

    @When("User clicks on calendar tab")
    public void user_clicks_on_calendar_tab() {

        BrowserUtils.sleep(3);
        calenderPage_aliH.calenderTab.click();

    }

    @Then("User should see weekly display")
    public void user_should_see_weekly_display() {

        wait.until(ExpectedConditions.visibilityOf(calenderPage_aliH.weekButton));
        BrowserUtils.sleep(1);
        if (calenderPage_aliH.weekButton.getAttribute("class").contains("active")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }

        Assert.assertTrue(calenderPage_aliH.weekButton.getAttribute("class").contains("active"));
    }

    @Given("User clicks on Day button")
    public void user_clicks_on_day_button() {

        calenderPage_aliH.dayButton.click();

    }

    @Given("User should see daily display")
    public void user_should_see_daily_display() {

        BrowserUtils.sleep(2);
        if (calenderPage_aliH.dayButton.getAttribute("class").contains("active")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }

        Assert.assertTrue(calenderPage_aliH.dayButton.getAttribute("class").contains("active"));

    }

    @Given("User clicks on Month button")
    public void user_clicks_on_month_button() {
        calenderPage_aliH.monthButton.click();
    }

    @Given("User should see monthly display")
    public void user_should_see_monthly_display() {

        BrowserUtils.sleep(2);
        if (calenderPage_aliH.monthButton.getAttribute("class").contains("active")) {
            System.out.println("PASS");
        } else {
            System.out.println("FAILED");
        }

        Assert.assertTrue(calenderPage_aliH.monthButton.getAttribute("class").contains("active"));

    }

    @Given("User clicks on Week button")
    public void user_clicks_on_week_button() {
        calenderPage_aliH.weekButton.click();
    }

    @Given("User clicks on a timeBox")
    public void user_clicks_on_time_box() {

        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath(timeBoxLocator))));
        Driver.getDriver().findElement(By.xpath(timeBoxLocator)).click();
    }

    @Given("User should see createEventBox")
    public void user_should_see_create_event_box() {
        wait.until(ExpectedConditions.visibilityOf(calenderPage_aliH.createHeader));
        Assert.assertTrue(calenderPage_aliH.createHeader.isDisplayed());
    }

    @Given("User enters {string} as summary of the event")
    public void user_enters_a_summary_of_the_event(String string) {

        calenderPage_aliH.eventSummary.sendKeys(string);
    }

    @Given("User clicks on create button")
    public void user_clicks_on_create_button() {
        calenderPage_aliH.createEventButton.click();
    }

    @Given("User should see {string} inside the header")
    public void user_should_see_inside_the_header(String string) {

        System.out.println(calenderPage_aliH.eventHeader.getText());
        Assert.assertTrue(calenderPage_aliH.eventHeader.getText().contains(string));
    }

    @Given("User clicks on an event timeBox")
    public void user_clicks_on_time_box_for_event() {

        System.out.println("shortEventTime = " + shortEventTime);
        String eventLocator = "//div[contains(text(),'" + shortEventTime + "')]/../..";
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath(eventLocator))));
        Driver.getDriver().findElement(By.xpath(eventLocator)).click();
    }

    @Given("User clicks on edit button")
    public void user_clicks_on_edit_button() {
        wait.until(ExpectedConditions.elementToBeClickable(calenderPage_aliH.eventEditButton));
        calenderPage_aliH.eventEditButton.click();
    }

    @Given("User change the summary of event to {string}")
    public void user_change_the_summary_of_event_to_another_meeting(String string) {
        wait.until(ExpectedConditions.visibilityOf(calenderPage_aliH.changeEventName));
        calenderPage_aliH.changeEventName.clear();
        calenderPage_aliH.changeEventName.sendKeys(string);
    }

    @Given("clicks save button")
    public void clicks_save_button() {
        calenderPage_aliH.eventSaveButton.click();
    }

    @Given("User clicks on delete button")
    public void user_clicks_on_delete_button() {
        wait.until(ExpectedConditions.elementToBeClickable(calenderPage_aliH.deleteEventButton));
        calenderPage_aliH.deleteEventButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(calenderPage_aliH.deleteEventOkButton));
        calenderPage_aliH.deleteEventOkButton.click();
    }

    @Then("User should verify the event is deleted")
    public void user_should_verify_the_event_is_deleted() {

        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath(timeBoxLocator))));
        Driver.getDriver().findElement(By.xpath(timeBoxLocator)).click();

        wait.until(ExpectedConditions.visibilityOf(calenderPage_aliH.createHeader));
        if (calenderPage_aliH.createHeader.isDisplayed()) {
            System.out.println("deleting performed");
        } else {
            System.out.println("deleting failed");
        }
        Assert.assertTrue(calenderPage_aliH.createHeader.isDisplayed());

    }


}
