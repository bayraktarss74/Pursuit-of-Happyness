@UPGN-874
Feature: Inventory Functionality
  Agile Story: As a salesmanager, I should be able to check and edit the Inventory of the company.

  Background: User goes to the product page
    Given user should be on the login page
    And   user should write the valid "salesmanager10@info.com" in email box
    And   user should write the valid "salesmanager" in password box
    And   user should click the submit button
    And   user should see the page title like "#Inbox - Odoo"
    And   user should click on the Inventory tag
    And   user should see the page title like "Inventory - Odoo"
    And   user should click on the Products tag
    And   user should see the page title like "Products - Odoo"
    And   user should click on the "Create" button on the page


  Scenario: User can reach New Products Form by clicking Inventory --> Products --> Create
    When user should see the page title like "New - Odoo"


  Scenario: If Product name field leaves blank, an error message "The following fields are invalid:" is appeared.
    When user should click to the save button
    Then user should see the "The following fields are invalid:" warning

  Scenario Outline: After user create a Product, the page title includes the Product name.
    When user write a product name as "<productname>" in to product box
    And  user should click to the save button
    Then user see that page title includes "<productname>"
    Examples:
      | productname |
      | Toshiba     |
      | Macbook     |
      | Casper      |

  Scenario Outline: User should be able to see created Product is listed after clicking the Products module.
    When user should see the page title like "New - Odoo"
    And  user write a product name as "<productname>" in to product box
    And  user should click to the save button
    And  user see that page title includes "<productname>"
    And  user should click on the Products tag
    And  user write the "<productname>" in the search box
    Then user should see the "<productname>" on the page
    Examples:
      | productname |
      | Toshiba     |
      | Acer        |
      | Dell        |
      | Monster     |
