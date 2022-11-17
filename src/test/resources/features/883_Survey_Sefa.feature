Feature: As a Posmanager, I should be able to create, edit and delete
  surveys from "Surveys" module.

  Background: For those test cases posmanager is considered to be logged in.
    Given Posmanager is logged in
      | posmanager10@info.com | posmanager |

    @UPGN-883-US1

    Scenario: Verify that User can reach New Survey Form by clicking Surveys Create
      When User locates surveys button on the screen and clicks on the surveys button
      Then User locates create button on the screen and clicks on create button
      Then User reaches Surveys-New with survey form below
  @UPGN-883-US2

  Scenario: Verify that if Survey Title field leaves blank, an error message "The following fields are invalid:" is appeared.
    When User is on the new survey page locates save button and clicks
    Then User receives The following fields are invalid title.

  @UPGN-883-US3
  Scenario: Verify that the "Survey created" message appears under the survey form sheet
    When User locates the title button and and sends key to the title section with a "String" for name
    Then User locates save button and clicks on it
    Then user locates the message below as "Survey created"

  @UPGN-883-US4
  Scenario: Verify that the user should be able to see created survey is listed after clicking the Surveys module.
    When User locates surveys button on the screen and clicks on the surveys button
    Then User scrools down to see "String" name that is given for the survey below






