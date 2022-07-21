@FLT-1918
Feature: Users should be able to use filter menu

  Background:
    Given the user is on the login page


  @FLT-1913
  Scenario: Manage filter button is functional as a driver
    When the user enters the driver information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    Then the manage filters button becomes visible

  @FLT-1913
  Scenario: Manage filter button is functional as a sales manager
    When the user enters the sales manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    Then the manage filters button becomes visible

  @FLT-1913
  Scenario: Manage filter button is functional as a store manager
    When the user enters the store manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    Then the manage filters button becomes visible





  @FLT-1914
  Scenario: the user can apply filters by clicking as a driver
    When the user enters the driver information
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When the user clicks one of the filter
    Then the filter turns clicked


  @FLT-1914
  Scenario: the user can apply filters by clicking as a sales manager
    When the user enters the sales manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user clicks one of the filter
    Then the filter turns clicked


  @FLT-1914
  Scenario: the user can apply filters by clicking as a store manager
    When the user enters the store manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user clicks one of the filter
    Then the filter turns clicked






  @FLT-1915
  Scenario: the user can apply filters by typing as a driver
    When the user enters the driver information
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When the user types "License Plate" into input box
    Then typed filter name becomes clickable

  @FLT-1915
  Scenario: the user can apply filters by typing as a sales manager
    When the user enters the sales manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user types "License Plate" into input box
    Then typed filter name becomes clickable

  @FLT-1915
  Scenario: the user can apply filters by typing as a store manager
    When the user enters the store manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When the user types "License Plate" into input box
    Then typed filter name becomes clickable




  @FLT-1916
  Scenario: the user can apply multiple filters at the same time as a driver
    When the user enters the driver information
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    Then filter names become clickable

  @FLT-1916
  Scenario: the user can apply multiple filters at the same time as a sales manager
    When the user enters the sales manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    Then filter names become clickable

  @FLT-1916
  Scenario: the user can apply multiple filters at the same time as a store manager
    When the user enters the store manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    Then filter names become clickable





  @FLT-1917
  Scenario: the user can remove all filters by clicking reset icon as a driver
    When the user enters the driver information
    When the user navigates to Fleet Vehicles module
    When the user waits because it's driver
    When the user scroll to filter icon and clicks
    When the user clicks the manage filters button
    When filter names become clickable
    When the user clicks the reset icon
    Then all filters removed

  @FLT-1917
  Scenario: the user can remove all filters by clicking reset icon as a sales manager
    When the user enters the sales manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When filter names become clickable
    When the user clicks the reset icon
    Then all filters removed

  @FLT-1917
  Scenario: the user can remove all filters by clicking reset icon as a store manager
    When the user enters the store manager information
    When the user navigates to Fleet Vehicles module
    When the user clicks filter icon
    When the user clicks the manage filters button
    When filter names become clickable
    When the user clicks the reset icon
    Then all filters removed