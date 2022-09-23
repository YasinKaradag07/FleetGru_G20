package com.fleetgru.step_definitions;

import com.fleetgru.pages.*;
import com.fleetgru.utilities.*;
import io.cucumber.java.en.*;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.*;



public class VehicleGeneralInformation_StepDef{

    LoginPage loginPage = new LoginPage();
    VehiclesPage vehiclesPage = new VehiclesPage();
    String firstDriverTag,firstDriverLocation,firstManagerTag,firstManagerLocation;

    @When("user login as {string} with {string} and {string}")
    public void userLoginAsWithAnd(String arg0, String arg1, String arg2) {
        loginPage.loginAsUserType(arg0);
        BrowserUtils.sleep(5);
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
        BrowserUtils.sleep(5);
    }

    @And("user clicks on any vehicle\\(row) as {string}")
    public void userClicksOnAnyVehicleRow(String arg0) {
        if(arg0.equals("Driver")) {
            vehiclesPage.firstDriverCar.click();
            firstDriverTag = vehiclesPage.firstDriverTag.getText();
            firstDriverLocation = vehiclesPage.firstDriverLocation.getText();
            System.out.println("firstDriverTag = " + firstDriverTag);
            System.out.println("firstDriverLocation = " + firstDriverLocation);
        }
        else {
            vehiclesPage.firstManagerCar.click();
            firstManagerTag = vehiclesPage.firstManagerTag.getText();
            firstManagerLocation = vehiclesPage.firstManagerLocation.getText();
            System.out.println("firstManagerLocation = " + firstManagerLocation);
            System.out.println("firstManagerTag = " + firstManagerTag);
        }
        BrowserUtils.sleep(5);

    }

    @Then("user can see the general information page")
    public void userCanSeeTheGeneralInformationPage() {
        Assert.assertTrue(vehiclesPage.generalInfoPage.isDisplayed());
        BrowserUtils.sleep(5);
    }

    @And("user clicks on the Eye \\(View) icon as {string}")
    public void userClicksOnTheEyeViewIconAs(String arg0) {
        Actions action = new Actions(Driver.getDriver());

        if(arg0.equals("Driver")){

            action.moveToElement(vehiclesPage.driverThreeDotsIcon).perform();
            action.moveToElement(vehiclesPage.driverEyeIcon).click().perform();

            //((JavascriptExecutor) Driver.getDriver()).executeScript("return arguments[0].click();", vehiclesPage.driverEyeIcon);
        }
        else{

            action.moveToElement(vehiclesPage.managerThreeDotsIcon).perform();
            action.moveToElement(vehiclesPage.managerEyeIcon).perform();

            //((JavascriptExecutor) Driver.getDriver()).executeScript("return arguments[0].click();", vehiclesPage.managerEyeIcon);

        }
        Assert.assertTrue(vehiclesPage.generalInfoPage.isDisplayed());
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

    @Then("user can see the general information page fleet vehicle page are the same as {string}")
    public void userCanSeeTheGeneralInformationPageFleetVehiclePageAreTheSameAs(String arg0) {
        if(arg0.equals("Driver")){
            Assert.assertEquals(firstDriverTag,vehiclesPage.firstDriverTagName.getText());
            Assert.assertEquals(firstDriverLocation,vehiclesPage.firstDriverLocationName.getText());
        }
        else{
            Assert.assertEquals(firstManagerTag,vehiclesPage.firstManagerTagName.getText());
            Assert.assertEquals(firstManagerLocation,vehiclesPage.firstManagerLocationName.getText());
        }
    }
}
