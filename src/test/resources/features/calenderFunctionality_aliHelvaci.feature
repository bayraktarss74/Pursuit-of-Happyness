@smoke @UPGN-882
Feature: Calendar Function

  @UPGN-895
  Scenario: User should land on weekly display by default aliH
    Given User logged in as a posmanager
    And User clicks on calendar tab
    Then User should see weekly display

  @UPGN-907
  Scenario: User can change display between Day-Week-Month aliH
    Given User logged in as a posmanager
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on Month button
    And User should see monthly display
    And User clicks on Week button
    Then User should see weekly display

  @UPGN-908
  Scenario: User can create event aliH
    Given User logged in as a posmanager
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on a timeBox
    And User should see createEventBox
    And User enters "important meeting" as summary of the event
    And User clicks on create button
    And User clicks on an event timeBox
    And User should see "important meeting" inside the header

  @UPGN-912 @new
  Scenario: User can edit a created event aliH
    Given User logged in as a posmanager
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on an event timeBox
    And User clicks on edit button
    And User change the summary of event to "another meeting"
    And clicks save button
    And User clicks on an event timeBox
    And User should see "another meeting" inside the header

  @UPGN-918
  Scenario: User can delete a created event aliH
    Given User logged in as a posmanager
    And User clicks on calendar tab
    And User should see weekly display
    And User clicks on Day button
    And User should see daily display
    And User clicks on an event timeBox
    And User clicks on delete button
    Then User should verify the event is deleted
