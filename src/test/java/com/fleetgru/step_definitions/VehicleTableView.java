package com.fleetgru.step_definitions;

import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import static org.junit.Assert.*;

public class VehicleTableView {

    LoginPage loginPage=new LoginPage();

    VehiclesPage vehiclesPage=new VehiclesPage();

    ManageFiltersPage manageFiltersPage=new ManageFiltersPage();

    @Given("user on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user login as a {string}")
    public void user_login_as_a(String username) {
        loginPage.loginAsUserType(username);
    }

    @When("user clicks the Fleet and Vehicles module")
    public void user_clicks_the_fleet_and_vehicles_module() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        manageFiltersPage.navigateToFleetVehicleModule();
    }

    @Then("user can see vehicle table")
    public void user_can_see_vehicle_table() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehiclesPage.vehicleTable,5);
        assertTrue(vehiclesPage.vehicleTable.isDisplayed());
    }


    @Then("user can see total page number")
    public void userCanSeeTotalPageNumber() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehiclesPage.totalPageNumber,2);
        assertTrue(vehiclesPage.totalPageNumber.isDisplayed());
    }

    @Then("user can click forward button")
    public void userCanClickForwardButton() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehiclesPage.pageForwardButton,3);
        BrowserUtils.sleep(2);
        vehiclesPage.pageForwardButton.click();
        vehiclesPage.waitUntilLoaderScreenDisappear();
        assertTrue(vehiclesPage.pageForwardButton.isEnabled());
    }

    @Then("user can click backward button")
    public void userCanClickBackwardButton() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        vehiclesPage.pageBackwardsBtn.click();
        vehiclesPage.waitUntilLoaderScreenDisappear();
        assertTrue(vehiclesPage.pageBackwardsBtn.isEnabled());
    }

    @Then("user can see total recordings of vehicles")
    public void userCanSeeTotalRecordingsOfVehicles() {
        vehiclesPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitForVisibility(vehiclesPage.totalRecords,2);
        assertTrue(vehiclesPage.totalRecords.isDisplayed());
    }

    @Then("user can download XLSX file through the export button")
    public void userCanDownloadXLSXFile() {
        BrowserUtils.waitForVisibility(vehiclesPage.exportButton,3);
        vehiclesPage.exportButton.click();
        BrowserUtils.waitForVisibility(vehiclesPage.xlsxButton,3);
        vehiclesPage.xlsxButton.click();
        BrowserUtils.waitForVisibility(vehiclesPage.exportMessage,3);
        assertTrue(vehiclesPage.exportMessage.isDisplayed());
    }

    @Then("user can download CSV file through the export button")
    public void userCanDownloadCSVFile() {
        vehiclesPage.exportButton.click();
        BrowserUtils.waitForVisibility(vehiclesPage.csvButton,3);
        vehiclesPage.csvButton.click();
        BrowserUtils.waitForVisibility(vehiclesPage.exportMessage,3);
        assertTrue(vehiclesPage.exportMessage.isDisplayed());
    }
}
