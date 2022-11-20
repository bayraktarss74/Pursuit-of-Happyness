@UPGN-839
Feature: Calendar Functionality

  Background:For the scenarios in the feature file, user is expected to be on on the opening page of application
    Given User is on the login page and log in successfully
      | posmanager10@info.com | posmanager |

  @UPGN-834
  Scenario:User first lands on weekly display
    When  User clicks the Calendar button
    Then  User first lands on weekly display

  @UPGN-835
  Scenario:User can change display between Day-Week-Month.
    When  User clicks the Calendar button
    And   Users first lands on weekly display
    And   User clicks the Day button. Sees the daily calendar display.
    And   User clicks the Month button.
    Then  User sees the monthly calendar display.

  @UPGN-836
  Scenario: User can create event by clicking on time box on daily display.
    When  User clicks the Calendar button.
    And   User first lands on weekly display.
    And   User clicks the Day button. Sees the daily calendar display.
    And   User clicks  on time "10:00:00" box on daily display.
    And   User sees a small window with  Create header.
    And   User types "User Stories" in the Summary part of the small window to create an event. And click create button.
    Then  User sees the added event "User Stories"  on daily calendar display.

  @UPGN-837
  Scenario:User can edit a created event.
    When  User clicks the Calendar button.
    And   User first lands on weekly display.
    And   User clicks the Day button. Sees the daily calendar display. User clicks created event on the daily display.
    And   User sees the small window with Open  header. User clicks the Edit button.
    And   User sees the window with Open header.
    And   User can edit the subject by typing "User Stories about related to failed Test Cases" and save it by clicking the Save button.
    Then  User sees the edited event "User Stories about related to failed Test Cases" on the daily display.

  @UPGN-838
  Scenario:User can delete a created event.
    When  User clicks the Calendar button.
    And   User first lands on weekly display.
    And   User clicks the Day button. User sees the daily calendar display. And User clicks created event on the daily display.
    And   User sees the small window with Open  header. User clicks the Delete button.
    And   User sees the window with Confirmation header. User clicks the Ok button.
    Then  User sees that the created event is deleted successfully.