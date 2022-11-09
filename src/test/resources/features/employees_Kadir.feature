Feature: As a Posmanager, I should be able to create and edit a new employee from "Employees" module.
  Background: For those test cases posmanager is considered to be logged in.
    Given Posmanager is logged in
    |posmanager30@info.com|posmanager|

    Scenario:User should reach New Employee Form by clicking Employees then Create
      Given User clicks the Employee link
      And User click Create Button
      Then User should see the New Employee Form

    Scenario: If Employee's Name field leaves blank, an error message "The following fields are invalid:" is appeared.
      Given User clicks the Employee link
      And User click Create Button
      And User leaves blank Name Field and clicks Save button
      Then User should see the error message

  Scenario: If Employee's Name field is typed empty space, an error message "The following fields are invalid:" is appeared.
    Given User clicks the Employee link
    And User click Create Button
    And User types empty space Name Field and clicks Save button
    Then User should see the error message