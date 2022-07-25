package com.fleetgru.step_definitions;

import com.fleetgru.pages.BasePage;
import com.fleetgru.pages.DashboardPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class GridSettingsStepDef {

    VehiclesPage vehiclesPage = new VehiclesPage();
    DashboardPage dashboardPage = new DashboardPage();
    LoginPage loginPage = new LoginPage();



    @When("the user clicks on the gear icon")
    public void the_user_clicks_on_the_gear_icon() {
        vehiclesPage.gearIcon.click();

    }
    @Then("the Grid Settings should be visible")
    public void the_should_be_visible() {
        Assert.assertTrue(vehiclesPage.gridSettingsDropdownMenu.isDisplayed());

    }

    @When("the user navigates to Vehicles under the Fleet menu")
    public void theUserNavigatesToVehiclesUnderTheFleetMenu() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(dashboardPage.fleetButton).perform();
        dashboardPage.vehicles.click();
        BrowserUtils.sleep(15);
    }

    @Given("the user is on the dashboard page")
    public void theUserIsOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys("user1");
        loginPage.passwordBox.sendKeys("UserUser123"+ Keys.ENTER);
        BrowserUtils.sleep(5);

    }

    @Then("the column names should be displayed")
    public void theColumnNamesShouldBeDisplayed() {
        List<String> expectedColumnNames= new ArrayList<>();
        expectedColumnNames.addAll(Arrays.asList("Id", "Tags", "License Plate","Tags","Driver"
                ,"Location","Chassis Number","Model Year","Last Odometer","Immatriculation Date","First Contract Date",
                "Catalog Value (VAT Incl.)","Seats Number","Doors Number","Color","Transmission","Fuel Type","CO2 Emissions",
                "Horsepower","Horsepower Taxation","Power (kW)"));

        Assert.assertEquals(expectedColumnNames,vehiclesPage.columnNames());

    }


    @And("the user typing the {string} on Quick Search input box")
    public void theUserTypingTheOnQuickSearchInputBox(String name) {
        vehiclesPage.quickSearchBox.sendKeys(name);
        
    }

    @Then("the user should find the {string} in the search box")
    public void theUserShouldFindTheInTheSearchBox(String expectedColumnName) {
        Assert.assertTrue(vehiclesPage.getQuickSearchResult.isDisplayed());
    }


}
