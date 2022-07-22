package com.fleetgru.step_definitions;

import com.fleetgru.pages.AddEventPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddEventStepDef1 {

    LoginPage loginPage = new LoginPage();
    AddEventPage addEventPage = new AddEventPage();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();

    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("User land on home page using valid credentials")
    public void user_land_on_home_page_using_valid_credentials() {
       loginPage.loginAsUserType("Sales Manager");
    }
    @When("User hover over fleet tab and clicks Vehicles module")
    public void user_hover_over_fleet_tab_and_clicks_vehicles_module() {
        addEventPage.waitUntilLoaderScreenDisappear();
        manageFiltersPage.navigateToFleetVehicleModule();
        addEventPage.waitUntilLoaderScreenDisappear();
    }
    @When("User click on any vehicle and land on general information page")
    public void user_click_on_any_vehicle_and_land_on_general_information_page() {
        addEventPage.vehiclesRow1.click();
        addEventPage.waitUntilLoaderScreenDisappear();
    }

    @Then("User can access the add event page")
    public void user_can_access_the_add_event_page() {
        addEventPage.addEventButton.click();
        addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(3);
        Assert.assertEquals("Add Event", addEventPage.addEventPopUpTitle.getText());
        addEventPage.addEventCloseButton.click();
    }


}
