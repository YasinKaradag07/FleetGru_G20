
Feature: As a user, I should be able to arrange vehicle table data under Fleet-Vehicle page

  Background: User is on homepage
    Given the user logs in with valid credentials and lands on homepage
    When the user navigates to Vehicles menu under Fleet menu

  @wip
  Scenario: User can arrange rows/vehicle numbers to be displayed by clicking
  on 'View Per Page' button under Fleet-Vehicles module

    And the user clicks View Per Page dropdown button
    And the user selects row number options to be shown on table
    Then the user should see the rows in table as selected number from dropdown menu

Scenario: The value of 'View Per Page' should be '25' by default
  Then the user should see 25 as a default number of View Per Page dropdown button

  Scenario Outline: 'View Per Page' includes the values shown as below and the user can select each of them:
  ->10
  ->25
  ->50
  ->100
    And the user clicks View Per Page dropdown button
    Then the user should see required numbers as "<options>"

    Examples: Required numbers
    |options|
    |10     |
    |25     |
    |50     |
    |100    |