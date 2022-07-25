package com.fleetgru.step_definitions;

import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.*;

public class VehicleTableArrangement_StepDef {

    LoginPage loginPage = new LoginPage();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @Given("the user logs in with valid credentials and lands on homepage")
    public void the_user_logs_in_with_valid_credentials_and_lands_on_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        manageFiltersPage.userType = "Driver";
        loginPage.loginAsUserType(manageFiltersPage.userType);
    }

    @When("the user navigates to Vehicles menu under Fleet menu")
    public void the_user_navigates_to_vehicles_menu_under_fleet_menu() {
        vehiclesPage.waitLoadingBar();
        manageFiltersPage.navigateToFleetVehicleModule();


    }

    @When("the user clicks View Per Page dropdown button")
    public void the_user_clicks_view_per_page_dropdown_button() {
        vehiclesPage.waitForVisibilityOfDropdownButton();
        vehiclesPage.viewPerPageDropdownButton.click();
    }

    @When("the user selects row number options to be shown on table")
    public void the_user_selects_row_number_options_to_be_shown_on_table() {
        vehiclesPage.dropdownMenuNumber10.click();
    }

    @Then("the user should see the rows in table as selected number from dropdown menu")
    public void the_user_should_see_the_rows_in_table_as_selected_number_from_dropdown_menu() {
      int actualRowCount = vehiclesPage.tableRows.size();
      int expectedRowCount = 10;
        Assert.assertEquals(10, expectedRowCount);

    }

    @Then("the user should see {int} as a default number of View Per Page dropdown button")
    public void the_user_should_see_as_a_default_number_of_view_per_page_dropdown_button(Integer int1) {
        String actualValueOfDropdownButton = vehiclesPage.viewPerPageDropdownButton.getText();
        String expectedValueOfDropdownButton = "25";
        Assert.assertEquals(expectedValueOfDropdownButton,actualValueOfDropdownButton);
    }

    @Then("the user should see required numbers as {string}")
    public void the_user_should_see_required_numbers_as(String string) {
        vehiclesPage.listCompare(string);
    }

    @When("the user clicks column name")
    public void the_user_clicks_column_name() {
        // click licence plate column name in order to change order
        //vehiclesPage.waitUntilLoaderScreenDisappear();
        vehiclesPage.waitForClickabilityOfLicencePlateColumnName();
        BrowserUtils.sleep(3);
        vehiclesPage.licencePlateColumnName.click();
        vehiclesPage.waitForClickabilityOfLicencePlateColumnName();

        // JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        // js.executeScript("arguments[0].scrollIntoView()", vehiclesPage.licencePlateColumnName);
    }

    @Then("the user is able to sort column in ascending or descending order")
    public void the_user_is_able_to_sort_column_in_ascending_or_descending_order() {

        vehiclesPage.verifyColumnsSortableByClicking();
    }

    @When("the user clicks reset button")
    public void the_user_clicks_reset_button() {

    }

    @Then("the user should be able to remove all sortings and filterings")
    public void the_user_should_be_able_to_remove_all_sortings_and_filterings() {

    }


}
