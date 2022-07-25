Feature: As a user, I should be able to arrange vehicle table columns
  via "grid settings" functionality under the Fleet-Vehicles page

  Background: given the user is on the vehicles page
    Given  the user is on the dashboard page
    When the user navigates to Vehicles under the Fleet menu
    When the user clicks on the gear icon



  Scenario:"Grid Settings" should be visible when user clicks on the gear icon
    Then the Grid Settings should be visible

  Scenario:  Column names in grid settings should be shown as below:
  -Id
  -License Plate
  -Tags
  -Driver
  -Location
  -Chassis Number
  -Model Year
  -Last Odometer
  -Immatriculation Date
  -First Contract Date
  -Catalog Value (VAT Incl.)
  -Seats Number
  -Doors Number
  -Color
  -Transmission
  -Fuel Type
  -CO2 Emissions
  -Horsepower
  -Horsepower Taxation
  -Power (KW)

    Then the column names should be displayed

  Scenario Outline:  User can find any column by typing the name on "Quick Search" input box

    And the user typing the "<name>" on Quick Search input box
    Then the user should find the "<expectedColumnName>" in the search box

    Examples:search values are gonna be as below
      | name                      | expectedColumnName        |
      | id                        | Id                        |
      | License Plate             | License Plate             |
      | Tags                      | Tags                      |
      | Driver                    | Driver                    |
      | Location                  | Location                  |
      | Chassis Number            | Chassis Number            |
      | Model Year                | Model Year                |
      | Last Odometer             | Last Odometer             |
      | Immatriculation Date      | Immatriculation Date      |
      | First Contract Date       | First Contract Date       |
      | Catalog Value (VAT Incl.) | Catalog Value (VAT Incl.) |
      | Seats Number              | Seats Number              |
      | Doors Number              | Doors Number              |
      | Color                     | Color                     |
      | Transmission              | Transmission              |
      | Fuel Type                 | Fuel Type                 |
      | CO2 Emissions             | CO2 Emissions             |
      | Horsepower                | Horsepower                |
      | Horsepower Taxation       | Horsepower Taxation       |
      | Power (KW)                | Power (KW)                |





















