@wip
Feature: Storemanager and Salesmanager add event feature

  Background:
    Given User is on the login page

    @FLT-1927
    Scenario Outline:User can access the "Add Event" page from the
    "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
      When "<userType>" land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      And User click on any vehicle and land on general information page
      Then User can click add event button and access the page

      Examples:
        | userType      |
        | Store Manager |
        | Sales Manager |
        | Driver        |

  @FLT-1929
  Scenario Outline: Store Manager and Sales Manager can click "Add Event" button
      When "<userType>" land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      And User click on any vehicle and land on general information page
      Then User can click add event button and access the page

      Examples:
        | userType      |
        | Store Manager |
        | Sales Manager |

    @FLT-1930
    Scenario: "Driver" can not see Add Event button
      When "Driver" land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      And User click on any vehicle and land on general information page
      Then Driver can NOT see add event button

    @FLT-1931
    Scenario Outline: After clicking on "Add event" button, "Add Event" page should pop up.
      When "<userType>" land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      And User click on any vehicle and land on general information page
      Then User can click add event button and add event page should pop up

      Examples:
        | userType      |
        | Store Manager |
        | Sales Manager |

    @FLT-1932
    Scenario: Compulsory fields are shown on Add Event page as
      Title, Owner, Organizer display name, Organizer email, Start Date, End Date
        When "Store Manager" land on home page using valid credentials
        And User hover over fleet tab and clicks Vehicles module
        And User click on any vehicle and land on general information page
        And User can click add event button and add event page must pop up
        Then User can see compulsory fields on Add Event page

      @FLT-1933
    Scenario: If any compulsory field is not filled, the "This value should not be blank."
                message should be displayed after clicking on the save button.
        When "Store Manager" land on home page using valid credentials
        And User hover over fleet tab and clicks Vehicles module
        And User click on any vehicle and land on general information page
        And User can click add event button and add event page must pop up
        Then User should see a warning message if any compulsory field is blank
