Feature: As a user, I should be able to arrange vehicle table columns
  via "grid settings" functionality under the Fleet-Vehicles page

  Background: given the user is on the vehicles page
    Given  the user is on the dashboard page
    And the user navigates to Vehicles under the Fleet menu
    When the user clicks on the gear icon


  Scenario:"Grid Settings" should be visible when user clicks on the gear icon
    Then the Grid Settings should be visible

  Scenario:Column names in grid settings
    Then Column names in grid settings should be shown as below:
      | Id                        |
      | License Plate             |
      | Tags                      |
      | Driver                    |
      | Location                  |
      | Chassis Number            |
      | Model Year                |
      | Last Odometer             |
      | Immatriculation Date      |
      | First Contract Date       |
      | Catalog Value (VAT Incl.) |
      | Seats Number              |
      | Doors Number              |
      | Color                     |
      | Transmission              |
      | Fuel Type                 |
      | CO2 Emissions             |
      | Horsepower                |
      | Horsepower Taxation       |
      | Power (KW)                |


  Scenario Outline:  User can find any column by typing the name on "Quick Search" input box

    And the user typing the "<name>" on Quick Search input box
    Then the user should see the "<name>" in the quickSearchBox

    Examples:search values are gonna be as below
      | name          | name          |
      | id            | Id            |
      | License Plate | License Plate |
      | Horsepower    | Horsepower    |
      | Power (KW)    | Power (KW)    |

  Scenario Outline:  User can select any column by clicking the column name and see the corresponding changes

    When the user clicks on the "<name>" checkbox
    Then the user should see the "<name>" on the vehicles table

    Examples:
      | name          | name          |
      | Driver        | Driver        |
      | License Plate | License Plate |
      | Tags          | Tags          |

    Scenario:  User can arrange the order of the columns (by dragging and dropping)

      When user drags license plate and drops on tags
      Then table heads should change correspondingly
































