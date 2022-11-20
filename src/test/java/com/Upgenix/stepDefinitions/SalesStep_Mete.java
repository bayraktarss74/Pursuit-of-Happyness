package com.Upgenix.stepDefinitions;

import com.Upgenix.pages.SalesPage_Mete;
import com.Upgenix.utilities.ConfigurationReader;
import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SalesStep_Mete {

    SalesPage_Mete salesPage_mete = new SalesPage_Mete();
    Actions actions = new Actions(Driver.getDriver());
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa.env"));
    }

    @When("User enters valid username")
    public void userEntersValidUsername() {
        salesPage_mete.usernameBox.sendKeys(ConfigurationReader.getProperty("qa.user"));
    }

    @And("User enters valid password")
    public void userEntersValidPassword() {
        salesPage_mete.passwordBox.sendKeys(ConfigurationReader.getProperty("qa.pass"));
    }

    @And("User click the login button")
    public void userClickTheLoginButton() {
        salesPage_mete.loginButton.click();
    }

    @Then("User should see in title and it should contains {string}")
    public void userShouldSeeInTitleAndItShouldContains(String titleHomePage) {
        Assert.assertTrue(Driver.getDriver().getTitle().contains(titleHomePage));
    }

    @When("User go end click to Sales button in top on the homepage")
    public void userGoEndClickToSalesButtonInTopOnTheHomepage() {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.salesButton));
      actions.moveToElement(salesPage_mete.salesButton).click().perform();
    }

    @And("User go end click to Customers button")
    public void userGoEndClickToCustomersButton() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.customersButton));
        actions.moveToElement( salesPage_mete.customersButton).click().perform();
    }

    @And("User go end click to Create button")
    public void userGoEndClickToCreateButton() {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.createButton));
        actions.moveToElement(salesPage_mete.createButton).click().perform();
    }

    @Then("User should see {string} on web title")
    public void userShouldSeeOnWebTitle(String createWebTitle) {
        wait.until(ExpectedConditions.titleIs(createWebTitle));
        String expectedTitle = createWebTitle;
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }

    @And("User click to save button top left of the page")
    public void userClickToSaveButtonTopLeftOfThePage() {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.saveButton));
        actions.moveToElement(salesPage_mete.saveButton).click().perform();
    }

    @Then("User should see The following fields are invalid: in message")
    public void userShouldSeeTheFollowingFieldsAreInvalidInMessage() {
        Assert.assertTrue(salesPage_mete.emptyWarning.isDisplayed());
    }

    @And("User writes the {string} in the Name box")
    public void userWritesTheInTheNameBox(String newCustomName) {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.nameBox));
        actions.moveToElement(salesPage_mete.nameBox).sendKeys(newCustomName).perform();
    }

    @Then("User should see {string} on the web title")
    public void userShouldSeeNewCustomerNameOnTheWebTitle(String newCustomName) {
        wait.until(ExpectedConditions.titleContains(newCustomName));
        Assert.assertTrue(Driver.getDriver().getTitle().contains(newCustomName));
    }

    @And("User go and writes the {string} on search box")
    public void userGoAndWritesTheOnSearchBox(String newCustomName) {
        wait.until(ExpectedConditions.visibilityOf(salesPage_mete.searchBox));
        salesPage_mete.searchBox.sendKeys(newCustomName, Keys.ENTER);
    }

    @Then("User should see {string} in the customer module")
    public void userShouldSeeNewCustomerNameInTheCustomerModule(String newCustomName) {

        List<WebElement> elementsOfsearchBox = Driver.getDriver().findElements(By.xpath("//strong[@class='o_kanban_record_title oe_partner_heading']"));

        for (WebElement each:elementsOfsearchBox) {
            if (each.getText().equals(newCustomName)){
                Assert.assertTrue(each.getText().equals(newCustomName));
                break;
            }
        }

    }



}
