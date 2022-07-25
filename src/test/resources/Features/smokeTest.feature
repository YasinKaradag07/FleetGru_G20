@smoke @FLT-1944
Feature:

  Background:
    Given user on the login page


  @FLT-1922
  Scenario Outline: User can see the total page number
    When user login as a "<user type>"
    And user clicks the Fleet and Vehicles module
    Then user can see total page number
    Examples:
      | user type     |
      | Driver        |
      | Sales Manager |
      | Store Manager |


    @FLT-1938
  Scenario: User can arrange rows/vehicle numbers to be displayed by clicking
  on 'View Per Page' button under Fleet-Vehicles module

    And the user clicks View Per Page dropdown button
    And the user selects row number options to be shown on table
    Then the user should see the rows in table as selected number from dropdown menu
