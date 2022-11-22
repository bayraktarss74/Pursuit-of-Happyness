package com.Upgenix.pages;

import com.Upgenix.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmpPageHkmt {

    public EmpPageHkmt () {PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(id = "login")
    public WebElement username;

    @FindBy (id = "password")
    public WebElement password;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement signinbttn;

    @FindBy (xpath = "//a[@href=\"/web#menu_id=157&action=\"]")
    public WebElement employeeBttn;

    @FindBy (xpath = "//button[@accesskey]")
    public WebElement createBttn;

    @FindBy (xpath = "//input[@class=\"o_field_char o_field_widget o_input o_required_modifier\"]")
    public WebElement inputEmpName;

    @FindBy (xpath = "//button[@accesskey=\"s\"]")
    public WebElement saveBttn;

    @FindBy (xpath = "//div[@class =\"o_notification_title\"]")
    public WebElement errorMsg;

    @FindBy (xpath = "//div[@class='o_thread_message_content']/p")
    public WebElement createMsg;

    @FindBy (className = "o_searchview_input")
    public WebElement empSearch;

    @FindBy (xpath = "//div[@modifiers=\"{}\"]/strong/div/strong/span")
    public WebElement listedEmpName;

}
