package com.Upgenix.pages;

import com.Upgenix.utilities.ConfigurationReader;
import com.Upgenix.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesPage_Mustafa {
    public SalesPage_Mustafa() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    static WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
    @FindBy(xpath = "//a[contains(@href,'login')]")
    public static WebElement loginMenu;

    @FindBy(id = "login")
    private static WebElement emailBox;

    @FindBy(id = "password")
    private static WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    private static WebElement loginBtn;

    @FindBy(xpath = "//span[.='POSManager35']")
    private static WebElement userAccount;

    @FindBy(xpath = "//a[@href='/web#menu_id=445&action=']")
    private static WebElement salesMenu;

    @FindBy(xpath = "//a[@href='/web#menu_id=447&action=48']")
    private static WebElement customersMenu;

    @FindBy(xpath = "//li[.='Customers']")
    private static WebElement customersTitle;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private static WebElement createMenu;

    @FindBy(xpath = "//li[.='New']")
    private static WebElement newCustomerForm;

    @FindBy(xpath = "//input[@name='name']")
    private static WebElement nameBox;

    @FindBy(xpath = "//button[@accesskey='s']")
    private static WebElement saveBtn;

    @FindBy(xpath = "//div[@class='o_notification_title']")
    private static WebElement alertMessage;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    private static WebElement searchBox;

    @FindBy(xpath = "//strong[@class='o_kanban_record_title oe_partner_heading']")
    private static WebElement customerData;


    public static void goTo() {
        Driver.getDriver().get(ConfigurationReader.getProperty("homepageurl"));
    }

    public static void isAtDashboardPage() {

        String homePageTitle = "UPGENIX - ERP for startups";
        Assert.assertEquals(homePageTitle, Driver.getDriver().getTitle());
        System.out.println("Home Page Verified");

        loginMenu.click();

        String loginPageTitle = "Login | Best solution for startups";
        Assert.assertEquals(loginPageTitle, Driver.getDriver().getTitle());
        System.out.println("Login Page Verified");

        emailBox.sendKeys(ConfigurationReader.getProperty("qa.user"));
        passwordBox.sendKeys(ConfigurationReader.getProperty("qa.pass"));

        loginBtn.click();

        wait.until(ExpectedConditions.visibilityOf(userAccount));
        String userExpectedAccount = ConfigurationReader.getProperty("useraccount");
        String userActualAccount = userAccount.getText();
        Assert.assertEquals(userExpectedAccount, userActualAccount);
        System.out.println("Dashboard Page Verified");
    }

    public static void goToSalesPage() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(salesMenu)).click();
    }

    public static void goToCustomersPage() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable(customersMenu)).click();
    }

    public static void goToCreateMenu() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(customersTitle));
        createMenu.click();
    }

    public static void newCustomerFormVerification() {
        wait.until(ExpectedConditions.visibilityOf(newCustomerForm));
        String loginPageTitle = "New - Odoo";
        Assert.assertEquals(loginPageTitle, Driver.getDriver().getTitle());
        System.out.println("@UPGN-885 - New Customer Form Verified");
    }

    public static void nameBoxIsEmpty() {
        nameBox.clear();
    }

    public static void setSaveBtn() {
        saveBtn.click();
    }

    public static void alertMessage() {
        wait.until(ExpectedConditions.visibilityOf(alertMessage));
        String message = alertMessage.getText();
        System.out.println("@UPGN-913 - Alert message " + message + " is verified");
    }

    public static void newUser() {
        nameBox.sendKeys(ConfigurationReader.getProperty("newuser"));
    }

    public static void newUserInTitle() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(customersTitle));
        Thread.sleep(2000);
        String newUser = Driver.getDriver().getTitle();
        newUser.contains(ConfigurationReader.getProperty("newuser"));
        System.out.println("@UPGN-914 - New User in Title " + newUser + " is verified");
    }

    public static void searchBox() {
        wait.until(ExpectedConditions.visibilityOf(customerData));
    }

    public static void newCustomerData() throws InterruptedException {
        searchBox.sendKeys(ConfigurationReader.getProperty("newuser") + Keys.ENTER);
        String newUserData = customerData.getText();
        Boolean dataVerification = newUserData.contains(ConfigurationReader.getProperty("newuser"));
        Thread.sleep(2000);
        System.out.println("@UPGN-915 - New User in Data is verified");

    }
}