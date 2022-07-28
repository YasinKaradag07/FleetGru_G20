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
import org.openqa.selenium.WebElement;
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
       // BrowserUtils.sleep(15);
        dashboardPage.waitUntilLoaderScreenDisappear();
    }

    @Given("the user is on the dashboard page")
    public void theUserIsOnTheDashboardPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        loginPage.usernameBox.sendKeys("user1");
        loginPage.passwordBox.sendKeys("UserUser123"+ Keys.ENTER);
        dashboardPage.waitLoadingBar();

    }




    @And("the user typing the {string} on Quick Search input box")
    public void theUserTypingTheOnQuickSearchInputBox(String name) {
        vehiclesPage.quickSearchBox.sendKeys(name);
        
    }

    @Then("the user should see the {string} in the quickSearchBox")
    public void theUserShouldSeeTheInTheQuickSearchBox(String name) {
        Assert.assertTrue(vehiclesPage.getQuickSearchResult.isDisplayed());
    }


    @Then("Column names in grid settings should be shown as below:")
    public void columnNamesInGridSettingsShouldBeShownAsBelow(List<String> menuOptions) {
        List<String> actualMenuOptions = new ArrayList<>();
        for (WebElement columnName : vehiclesPage.columnNames) {
            actualMenuOptions.add(columnName.getText());
        }
        Assert.assertEquals(menuOptions,actualMenuOptions);


    }



    @When("the user clicks on the {string} checkbox")
    public void theUserClicksOnTheCheckbox(String name) {

        switch (name){

            case "Id":
                vehiclesPage.idCheckBox.click();
                break;
            case "Licencse Plate":
                vehiclesPage.licensePlateCheckBox.click();
                vehiclesPage.licensePlateCheckBox.click();
                break;
            case "Tags":
                vehiclesPage.tagsCheckBox.click();
                vehiclesPage.tagsCheckBox.click();
                break;
        }
    }

    @Then("the user should see the {string} on the vehicles table")
    public void theUserShouldSeeTheOnTheVehiclesTable(String name) {
        for (WebElement webElement : vehiclesPage.correspondingColumnName) {
                Assert.assertTrue(webElement.getText().contains(name));
        }

        }



    }



