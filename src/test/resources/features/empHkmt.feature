Feature: As a Posmanager, I should be able to create and edit a new employee from "Employees" module

  Background: login as a posmanager
    Given login

  Scenario:User can reach New Employee Form by clicking Employees --> Create
    When User click employees button
    And User click create button
    Then User should see the title as New - Odoo


  Scenario:  if Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User click employees button
    And User click create button
    And User should see the title as New - Odoo
    And User write nothing
    And User click save button
    Then User should see error mesage



  Scenario: the "Employee created" message appears under full profile.
    When User click employees button
    And User click create button
    And User should see the title as New - Odoo
    And User write a name
    And User click save button
    Then User should see created mesage


  Scenario:user should be able to see created employee is listed after clicking the Employees module.
    When User click employees button
    And User click create button
    And User should see the title as New - Odoo
    And User write a name
    And User click save button
    And User click employees button
    And User click search input
    And User enter the name and click
    Then User should see the entered employee name in the employees list