@wip_ali
Feature: Vehicle Table View

  Background:
    Given user on the login page

  @FLT-1921
  Scenario Outline:  All user types can see all vehicle information
  under 'Fleet-Vehicles' module
    When user login as a "<user type>"
    And user clicks the Fleet and Vehicles module
    Then user can see vehicle table
    Examples:
      | user type     |
      | Driver        |
      | Sales Manager |
      | Store Manager |

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


  @FLT-1923
  Scenario Outline: User can go to next page clicking ">" button
  and can go to previous page clicking "<" button
    When user login as a "<user type>"
    And user clicks the Fleet and Vehicles module
    Then user can click forward button
    Then user can click backward button
    Examples:
      | user type     |
      | Driver        |
      | Sales Manager |
      | Store Manager |


  @FLT-1924
  Scenario Outline: User can see total recordings of vehicles
    When user login as a "<user type>"
    And user clicks the Fleet and Vehicles module
    Then user can see total recordings of vehicles
    Examples:
      | user type     |
      | Driver        |
      | Sales Manager |
      | Store Manager |


  @FLT-1925
  Scenario Outline: User can download table data in XLSX or CSV format from "Export Grid"
    When user login as a "<user type>"
    And user clicks the Fleet and Vehicles module
    Then user can download XLSX file through the export button
    Then user can download CSV file through the export button
    Examples:
      | user type     |
      | Driver        |
      | Sales Manager |
      | Store Manager |