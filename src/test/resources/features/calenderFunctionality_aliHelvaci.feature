@smoke @wip
Feature: Calendar Function

  @UPGN-895
  Scenario: User should land on weekly display by default
    Given User logged in as a "sales manager"
    And User clicks on calendar tab
    Then User should see weekly display

  @UPGN-907
  Scenario: User can change display between Day-Week-Month
    Given User logged in as a "sales manager"
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on Month button
    And User should see monthly display
    And User clicks on Week button
    Then User should see weekly display

  @UPGN-908
  Scenario: User can create event
    Given User logged in as a "sales manager"
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on "15:30:00" timeBox
    And User should see createEventBox
    And User enters "important meeting" as summary of the event
    And User clicks on create button
    And User clicks on "15:30" timeBox for event
    And User should see "important meeting" inside the header

