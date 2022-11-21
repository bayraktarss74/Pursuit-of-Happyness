@UPGN-878
Feature: As a User, I should be able to create and edit a new customers from "Sales" module

  Background:
    Given user is on the dashboard page

  @UPGN-885
  Scenario:  User should verify New Customer Form

    When user clicks "Sales" from the top menu
    And user clicks the "Customers" from the left-side menu-Orders segment
    And user click the "Create" button from the top left-side menu
    Then user can reach New Customer Form


  @UPGN-913
  Scenario: User should verify blank customer name field error message
    When user clicks "Sales" from the top menu
    And user clicks the "Customers" from the left-side menu-Orders segment
    And user click the "Create" button from the top left-side menu
    And user ensure that customer name field is blank
    And user clicks the below "Save" button on top the window
    Then user verifies an error message "The following fields are invalid:" is displayed


  @UPGN-914
  Scenario: User should verify the new customer name on page title

    When user clicks "Sales" from the top menu
    And user clicks the "Customers" from the left-side menu-Orders segment
    And user click the "Create" button from the top left-side menu
    And user enter the customer name field as "<Mike Bravo>"
    And user clicks the below "Save" button on top the window
    Then user see the page title includes the customer name after creating a new customer


  @UPGN-915
  Scenario: User should verify created customer is listed in the Customers module
    When user clicks "Sales" from the top menu
    And user clicks the "Customers" from the left-side menu-Orders segment
    And user enters the customer's name in the Search Box
    Then user verifies the created new customer data will be displayed in the Customers module
