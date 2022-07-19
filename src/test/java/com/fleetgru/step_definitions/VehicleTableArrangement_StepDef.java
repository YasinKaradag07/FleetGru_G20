package com.fleetgru.step_definitions;

import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VehicleTableArrangement_StepDef {

    @Given("the user logs in with valid credentials and lands on homepage")
    public void the_user_logs_in_with_valid_credentials_and_lands_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty(""));
        // test for pull request

    }

    @When("the user navigates to Vehicles menu under Fleet menu")
    public void the_user_navigates_to_vehicles_menu_under_fleet_menu() {

    }

    @When("the user clicks View Per Page dropdown button")
    public void the_user_clicks_view_per_page_dropdown_button() {

    }

    @When("the user selects row number options to be shown on table")
    public void the_user_selects_row_number_options_to_be_shown_on_table() {

    }

    @Then("the user should see the rows in table as selected number from dropdown menu")
    public void the_user_should_see_the_rows_in_table_as_selected_number_from_dropdown_menu() {

    }

    @Then("the user should see {int} as a default number of View Per Page dropdown button")
    public void the_user_should_see_as_a_default_number_of_view_per_page_dropdown_button(Integer int1) {

    }

    @Then("the user should see required numbers as {string}")
    public void the_user_should_see_required_numbers_as(String string) {

    }


}
