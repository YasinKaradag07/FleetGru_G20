Feature: Store manager and sales manager should be able to add an event


  Scenario: User in the Dashboard page
    Given User clicks "New Event" button
    Then "Add New Event" page pops up
    And the event should be able to coloured
    When user clicks All-day event check box
    Then time boxes disappear
    When user checks repeat button
    Then repeat options appear on "Daily", "Weekly", "Monthly", "Yearly"
    And Ending options would be clickable as Never, After and By
    And all user can be able to see the all events on the General Information page



