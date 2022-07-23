package com.fleetgru.step_definitions;

import com.fleetgru.pages.*;
import com.fleetgru.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;

public class VehicleGeneralInformation_StepDef {

    LoginPage loginPage = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();

    @When("user login as {string} with {string} and {string}")
    public void userLoginAsWithAnd(String arg0, String arg1, String arg2) {
        loginPage.loginAsUserType(arg0);
        BrowserUtils.sleep(4);
    }

    @And("user clicks Fleet and Vehicles module as {string}")
    public void userClicksFleetAndVehiclesModuleAs(String arg0) {
        if(arg0.equals("Driver")) {
            vehiclesPage.driverFleet.click();
            vehiclesPage.driverVehicles.click();
        }
        else {
            vehiclesPage.managerFleet.click();
            vehiclesPage.managerVehicles.click();
        }
        BrowserUtils.sleep(4);
    }

    @And("user clicks on any vehicle\\(row) as {string}")
    public void userClicksOnAnyVehicleRow(String arg0) {
        if(arg0.equals("Driver")) {
            vehiclesPage.firstDriverCar.click();
        }
        else {
            vehiclesPage.firstManagerCar.click();
        }
        BrowserUtils.sleep(4);
    }

    @Then("user can see the general information page")
    public void userCanSeeTheGeneralInformationPage() {
        Assert.assertTrue(vehiclesPage.generalInfoPage.isDisplayed());
        BrowserUtils.sleep(4);
    }

    @And("user clicks on the Eye \\(View) icon as {string}")
    public void userClicksOnTheEyeViewIconAs(String arg0) {
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

        if(arg0.equals("Driver")){
            vehiclesPage.driverThreeDotsIcon.click();
            vehiclesPage.driverThreeDotsIcon.click();

            BrowserUtils.sleep(2);
            vehiclesPage.driverEyeIcon.click();
        }
        else{
            vehiclesPage.managerThreeDotsIcon.click();
            vehiclesPage.managerThreeDotsIcon.click();
            BrowserUtils.sleep(2);
            vehiclesPage.managerEyeIcon.click();
        }
    }

    @Then("user see {string}, {string} and {string} buttons on the {string} page")
    public void userSeeAndButtonsOnThePage(String arg0, String arg1, String arg2, String arg3) {
        Assert.assertTrue(vehiclesPage.managerEditButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.managerDeleteButton.isDisplayed());
        Assert.assertTrue(vehiclesPage.managerAddEventButton.isDisplayed());
    }

    @Then("Driver shouldn't see {string}, {string} and {string} buttons")
    public void driverShouldTSeeAndButtons(String arg0, String arg1, String arg2) {
        Assert.assertFalse(vehiclesPage.driverAddEventButton.isDisplayed());
    }

}
