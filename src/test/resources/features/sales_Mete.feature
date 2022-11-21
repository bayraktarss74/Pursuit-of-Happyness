@metewip
Feature:  Upgenix Sales Functionality feature


  User Story :

  As a User, I should be able to create and edit a new customers from "Sales" module


  Background: User is expected to home page
    Given User is on the login page
    When  User enters valid username
    And   User enters valid password
    And   User click the login button
    Then  User should see in title and it should contains "Odoo"

  @UPGN-897
  Scenario: Verify that User can reach New Customer Form by clicking Sales --> Customers --> Create
    When User go end click to Sales button in top on the homepage
    And  User go end click to Customers button
    And  User go end click to Create button
    Then User should see "New - Odoo" on web title

  @UPGN-898
  Scenario: Verify that if customer name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User go end click to Sales button in top on the homepage
    And  User go end click to Customers button
    And  User go end click to Create button
    And  User click to save button top left of the page
    Then User should see The following fields are invalid: in message

  @UPGN-899
  Scenario Outline: Verify that after creating a new customer, the page title includes the customer name.
    When User go end click to Sales button in top on the homepage
    And User go end click to Customers button
    And User go end click to Create button
    And User writes the <newCustomName> in the Name box
    And User click to save button top left of the page
    Then User should see <newCustomName> on the web title
    Examples:
      | newCustomName        |
      | "Ahmet Mete Isikara" |

  @UPGN-900
  Scenario Outline: Verify that the user should be able to see created customer is listed after clicking the Customers module.
    When User go end click to Sales button in top on the homepage
    And User go end click to Customers button
    And User go and writes the <newCustomName> on search box
    Then User should see <newCustomName> in the customer module
    Examples:
      | newCustomName         |
      | "Ahmet Mete Isikara" |


