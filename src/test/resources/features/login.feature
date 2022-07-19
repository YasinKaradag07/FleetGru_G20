
Feature: FleetGru App Login Feature
  User Story:
  As a user, I should be able to login with correct credentials to different
  accounts. And dashboard should be displayed.

  Accounts are: truck driver, sales manager, store manager

  Background:
    Given the user is on the login page

    @FLT-1824
    Scenario Outline: user is able to login with valid credentials as a truck driver verification

      When the truck driver user enters username "<username>"
      And the truck driver user enters password "<password>"
      And the truck driver user clicks enter or login button
      Then the truck driver user can see Quick Launchpad page

      Examples: Truck drivers role

        | username |   password    |
        | user1    |   UserUser123 |
        | user11   |   UserUser123 |
        | user31   |   UserUser123 |
        | user41   |   UserUser123 |
        | user151  |   UserUser123 |
        | user171  |   UserUser123 |
        | user191  |   UserUser123 |
        | user200  |   UserUser123 |

@FLT-1825
  Scenario Outline: user is able to login with valid credentials as a store manager and sales manager verification

    When the sales manager or store manager user enters username "<username>"
    And the sales manager or store manager user enters password "<password>"
    And the sales manager or store manager user clicks enter or login button
    Then the sales manager or store manager user can see Dashboard page

    Examples: store manager and sales manager role

      | username        |   password    |
      | storemanager51  |   UserUser123 |
      | storemanager71  |   UserUser123 |
      | storemanager91  |   UserUser123 |
      | storemanager201 |   UserUser123 |
      | storemanager221 |   UserUser123 |
      | storemanager241 |   UserUser123 |
      | storemanager250 |   UserUser123 |
      | salesmanager101 |   UserUser123 |
      | salesmanager121 |   UserUser123 |
      | salesmanager141 |   UserUser123 |
      | salesmanager251 |   UserUser123 |
      | salesmanager271 |   UserUser123 |
      | salesmanager291 |   UserUser123 |
      | salesmanager300 |   UserUser123 |

@FLT-1826
  Scenario Outline: "Invalid username or password." should be displayed for invalid
    (valid username-invalid password and invalid username-valid password) credentials

    When the user enters username "<invalidUsername>" and password "<invalidPassword>"
    And the user clicks enter or login button
    Then the user should see warning message

    Examples: Invalid credentials

      |invalidUsername |  invalidPassword|
      |user500         |  UserUser123     |
      |user1           |  UserUser125     |
      |salesmanager5   |  UserUser123     |
      |salesmanager300 |  UserUser125     |
      |storemanager51  |  UserUser321     |
      |storemanager45  |  UserUser123     |

@FLT-1827
  Scenario: "Please fill out this field" message should be displayed if the password or username is empty

      When the user does not fill username or password
      And the user clicks on login button
      Then the user should be able to see warning message on login page

@FLT-1828
  Scenario: User land on the ‘Forgot Password’ page after clicking on the "Forgot your password?" link

    When the user clicks forgot password button
    Then the user should land on forgot password page

@FLT-1829
  Scenario: User can see "Remember Me" link exists and is clickable on the login page

    When the user is able to see remember me link
    Then the user should be able to click checkbox

@FLT-1830
  Scenario: User should see the password in bullet signs by default

      When the user enters password
      Then the user should see the password in bullet signs

@FLT-1831
  Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.

    When the user enters valid credentials and hits enter key instead of clicking login button
    Then the user should be able to navigate correct page

 @FLT-1832
    Scenario Outline: All users can see their own usernames in the profile menu, after successful login, for truck driver

    When the truck driver user enters username "<username>"
    And the truck driver user enters password "<password>"
    And the truck driver user clicks enter or login button
    Then the truck driver user can see username "<username>" in profile menu on Quick Launchpad page

    Examples: Truck drivers role

      | username |   password    |
      | user1    |   UserUser123 |
      | user11   |   UserUser123 |
      | user31   |   UserUser123 |
      | user41   |   UserUser123 |
      | user151  |   UserUser123 |
      | user171  |   UserUser123 |
      | user191  |   UserUser123 |
      | user200  |   UserUser123 |

  @FLT-1833
  Scenario Outline: All users can see their own usernames in the profile menu, after successful login, for sales manager and store manager

    When the sales manager or store manager user enters username "<username>"
    And the sales manager or store manager user enters password "<password>"
    And the sales manager or store manager user clicks enter or login button
    Then the sales manager or store manager user can see username "<username>" in profile menu on Dashboard page

    Examples: store manager and sales manager role

      | username        |   password    |
      | storemanager51  |   UserUser123 |
      | storemanager71  |   UserUser123 |
      | storemanager91  |   UserUser123 |
      | storemanager201 |   UserUser123 |
      | storemanager211 |   UserUser123 |
      | storemanager231 |   UserUser123 |
      | salesmanager111 |   UserUser123 |
      | salesmanager131 |   UserUser123 |
      | salesmanager251 |   UserUser123 |
      | salesmanager271 |   UserUser123 |
      | salesmanager291 |   UserUser123 |
      | salesmanager300 |   UserUser123 |
