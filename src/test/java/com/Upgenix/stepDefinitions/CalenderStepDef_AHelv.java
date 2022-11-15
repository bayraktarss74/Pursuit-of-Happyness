package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.CalenderPage_aliH;
import com.Upgenix.pages.LoginPage_AliH;
import com.Upgenix.utilities.BrowserUtils;
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
    @Given("User logged in as a {string}")
    public void user_logged_in_as_a(String string) {

       Driver.getDriver().get("https://qa.upgenix.net/web/login/");
       loginPage_aliH.login("salesmanager15@info.com", "salesmanager");

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
        if(calenderPage_aliH.weekButton.getAttribute("class").contains("active")){
            System.out.println("PASS");
        }else{
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
        if(calenderPage_aliH.dayButton.getAttribute("class").contains("active")){
            System.out.println("PASS");
        }else{
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
        if(calenderPage_aliH.monthButton.getAttribute("class").contains("active")){
            System.out.println("PASS");
        }else{
            System.out.println("FAILED");
        }

        Assert.assertTrue(calenderPage_aliH.monthButton.getAttribute("class").contains("active"));

    }

    @Given("User clicks on Week button")
    public void user_clicks_on_week_button() {
        calenderPage_aliH.weekButton.click();
    }

    @Given("User clicks on {string} timeBox")
    public void user_clicks_on_time_box(String string) {

        String timeBoxLocator = "//tr[@data-time ='"+ string +"']//td[@class = 'fc-widget-content']";
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

    @Given("User clicks on {string} timeBox for event")
    public void user_clicks_on_time_box_for_event(String string) {

        String eventLocator = "//div[contains(text(),'15:30')]/../..";
        wait.until(ExpectedConditions.elementToBeClickable(Driver.getDriver().findElement(By.xpath(eventLocator))));
        Driver.getDriver().findElement(By.xpath(eventLocator)).click();
    }


}
