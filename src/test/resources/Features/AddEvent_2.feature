Feature: Store manager and sales manager should be able to add an event

  Background:
    Given User on the login page

  Scenario Outline: Sales Manager and Store Manager Can access Add Event Page
    When the "<User Type>" log in with valid credantials
    Then the user Hover Over Fleet and click  Vehicles
    And the user click any car info
    Then verify that General Information page opened and Add Event Button is seen
    And user click logout button_AddEvent

    Examples:
      | User Type     |
      | Sales Manager |
      | Store Manager |


  # @wip
  ## Scenario: User in the Dashboard page
  #    Given User clicks New Event button
  #    Then Add New Event page pops up
  #    And the event should be able to coloured
  #    When user clicks All-day event check box
  #    Then time boxes disappear
  #    When user checks repeat button
  #    Then repeat options appear on "Daily", "Weekly", "Monthly", "Yearly"
  #    And Ending options would be clickable as Never, After and By
  #    And all user can be able to see the all events on the General Information page










