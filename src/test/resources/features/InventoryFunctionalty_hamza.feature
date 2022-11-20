@UPGN-875
Feature: Inventory Functionality
  Agile Story: As a salesmanager, I try be able to check and edit the Inventory of the company.

  Background: User goes to the product page
    Given user try be on the login page
    And   user try write the valid "salesmanager10@info.com" in email box
    And   user try write the valid "salesmanager" in password box
    And   user try click the submit button
    And   user try see the page title like "#Inbox - Odoo"
    And   user try click on the Inventory tag
    And   user try see the page title like "Inventory - Odoo"
    And   user try click on the Products tag
    And   user try see the page title like "Products - Odoo"
    And   user try click on the "Create" button on the page


  Scenario: User can reach New Products Form by clicking Inventory --> Products --> Create
    When user try see the page title like "New - Odoo"


  Scenario: If Product name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When user try click to the save button
    Then user try see the "The following fields are invalid:" warning

  Scenario Outline: After user create a Product, the page title includes the Product name.
    When user try write a product name as "<productname>" in to product box
    And  user try click to the save button
    Then user see that page title includes like "<productname>"
    Examples:
      | productname |
      | Toshiba     |
      | Macbook     |
      | Casper      |

  Scenario Outline: User try be able to see created Product is listed after clicking the Products module.
    When user try see the page title like "New - Odoo"
    And  user try write a product name as "<productname>" in to product box
    And  user try click to the save button
    And  user see that page title includes like "<productname>"
    And  user try click on the Products tag
    And  user try see the page title like "Products - Odoo"
    And  user try write the "<productname>" in the search box
    Then user try see the "<productname>" on the page
    Examples:
      | productname |
      | Toshiba     |
      | Acer        |
      | Dell        |
      | Monster     |
