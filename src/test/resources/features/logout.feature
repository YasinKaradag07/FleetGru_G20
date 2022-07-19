Feature: As a user, I should be able to log out

  Background: User is on the home page
    Given the user is already logged in


    @FLT-1893 @wip
    Scenario: The user can log out and ends up on the login page
      When the user clicks the profile menu
      And the user clicks the logout button
      Then the user logout successfully and navigates to login page

    @FLT-1894 @wip
    Scenario: The user can not go to the home page again by clicking the step back button after successfully logging out.
      When the user logs out and lands on login page
      And the user clicks step back button
      Then the user should NOT be able to navigate back to homepage

    @FLT-1895 @wip
    Scenario: The user must be logged out if the user close the open tab
    (all tabs if there are multiple open tabs)
      When the user close all tabs of Fleetgru app
      And the user navigates back to web app
      Then the user should NOT be able to land on  Fleetgru homepage

