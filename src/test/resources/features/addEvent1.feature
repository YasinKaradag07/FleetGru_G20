Feature: Storemanager and Salesmanager add event feature

  Background:
    Given User is on the login page

    Scenario:User can access the "Add Event" page from the
    "General Information" page (by clicking on any vehicle/row under Fleet-Vehicle module)
      When User land on home page using valid credentials
      And User hover over fleet tab and clicks Vehicles module
      And User click on any vehicle and land on general information page
      Then User can access the add event page


