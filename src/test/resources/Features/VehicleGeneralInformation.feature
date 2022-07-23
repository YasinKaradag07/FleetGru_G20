@GeneralInformationPage
Feature: User Story : As a user, I should be able to see the detailed information of a specific vehicle (General Information Page)
  Acceptance Criteria :
  1- User can see the "General Information" page by clicking on any vehicle (row), under 'Fleet-Vehicle' module
  2- User can see the "General Information" page clicking on the "Eye (View)" icon at the end of each row, under 'Fleet-Vehicle' module
  3- Sales manager and store manager should see "Edit", "Delete" and "Add Event" buttons on the "General Information" page
  4- Driver shouldn't see "Add Event", "Edit" and "Delete" buttons
  5- Vehicle information displayed on the "General Information" page and "Fleet-Vehicle" page should be the same

  Background: Users are expected to be on the login page
    Given the user is on the login page

  @1
  Scenario Outline: Users login as "<userType>"
    When user login as "<userType>" with "<username>" and "<password>"
    And user clicks Fleet and Vehicles module as "<userType>"
    And user clicks on any vehicle(row) as "<userType>"
    Then user can see the general information page

    Examples: Needed credentials.

      | userType      | username        | password    |
      | Driver        | user1           | UserUser123 |
      | Sales Manager | salesmanager101 | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |

  @2
  Scenario Outline: Users login as "<userType>"
    When user login as "<userType>" with "<username>" and "<password>"
    And user clicks Fleet and Vehicles module as "<userType>"
    And user clicks on the Eye (View) icon as "<userType>"
    Then user can see the general information page

    Examples: Needed credentials.

      | userType      | username        | password    |
      | Driver        | user1           | UserUser123 |
      | Sales Manager | salesmanager101 | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |

  @3
  Scenario Outline: Users login as "<userType>"
    When user login as "<userType>" with "<username>" and "<password>"
    And user clicks Fleet and Vehicles module as "<userType>"
    And user clicks on any vehicle(row) as "<userType>"
    Then user see "Edit", "Delete" and "Add Event" buttons on the "General Information" page

    Examples: Needed credentials.

      | userType      | username        | password    |
      | Sales Manager | salesmanager101 | UserUser123 |
      | Store Manager | storemanager51  | UserUser123 |

  @4
  Scenario Outline: Users login as "<userType>"
    When user login as "<userType>" with "<username>" and "<password>"
    And user clicks Fleet and Vehicles module as "<userType>"
    And user clicks on any vehicle(row) as "<userType>"
    Then Driver shouldn't see "Add Event", "Edit" and "Delete" buttons

    Examples: Needed credentials.
      | userType | username | password    |
      | Driver   | user1    | UserUser123 |

    @5
    Scenario Outline: Users login as "<userType>"
      When user login as "<userType>" with "<username>" and "<password>"
      And user clicks Fleet and Vehicles module as "<userType>"
      And user clicks on any vehicle(row) as "<userType>"
      Then user can see the general information page

      Examples: Needed credentials.

        | userType      | username        | password    |
        | Driver        | user1           | UserUser123 |
        | Sales Manager | salesmanager101 | UserUser123 |
        | Store Manager | storemanager51  | UserUser123 |