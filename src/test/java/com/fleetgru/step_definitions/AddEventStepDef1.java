package com.fleetgru.step_definitions;

import com.fleetgru.pages.AddEventPage;
import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

public class AddEventStepDef1 {

    LoginPage loginPage = new LoginPage();
    AddEventPage addEventPage = new AddEventPage();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();



    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }


    //-------------------------------------------------------------------------------------------------

    @When("{string} land on home page using valid credentials")
    public void land_on_home_page_using_valid_credentials(String userType) {
        loginPage.loginAsUserType(userType);
    }

    @When("User hover over fleet tab and clicks Vehicles module")
    public void hover_over_fleet_tab_and_clicks_vehicles_module() {
        addEventPage.waitUntilLoaderScreenDisappear();
        //BrowserUtils.sleep(15);
        manageFiltersPage.navigateToFleetVehicleModule();
        //addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(13);
    }

    @When("User click on any vehicle and land on general information page")
    public void click_on_any_vehicle_and_land_on_general_information_page() {
        addEventPage.vehiclesRow1.click();
        //addEventPage.waitUntilLoaderScreenDisappear();
        //BrowserUtils.sleep(15);
    }

    @Then("User can click add event button and access the page")
    public void can_click_add_event_button() {
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        addEventPage.addEventButton.click();
        //addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        //Assert.assertEquals("Add Event", addEventPage.addEventPopUpTitle.getText());
        Assert.assertTrue(addEventPage.addEventPopUp.isDisplayed());
        //addEventPage.addEventCloseButton.click();

        try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }


    @Then("Driver can NOT see add event button")
    public void canNOTSeeAddEventButton() {
        BrowserUtils.sleep(9);
        Assert.assertEquals(false, addEventPage.addEventButton.isDisplayed());
    }

    @Then("User can click add event button and add event page should pop up")
    public void userCanClickAddEventButtonAndAddEventPageShouldPopUp() {
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        addEventPage.addEventButton.click();
        //addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        //Assert.assertEquals("Add Event", addEventPage.addEventPopUpTitle.getText());
        Assert.assertTrue(addEventPage.addEventPopUp.isDisplayed());
        //addEventPage.addEventCloseButton.click();

        try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @And("User can click add event button and add event page must pop up")
    public void userCanClickAddEventButtonAndAddEventPageMustPopUp() {
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        addEventPage.addEventButton.click();
        //addEventPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(9);
        //BrowserUtils.waitForVisibility(addEventPage.addEventButton, 15);
        //Assert.assertEquals("Add Event", addEventPage.addEventPopUpTitle.getText());
        Assert.assertTrue(addEventPage.addEventPopUp.isDisplayed());
        //addEventPage.addEventCloseButton.click();
    }


    @Then("User can see compulsory fields on Add Event page")
    public void userCanSeeCompulsoryFieldsOnAddEventPage() {
        Assert.assertTrue(addEventPage.fieldTitle.isDisplayed());
        Assert.assertTrue(addEventPage.fieldOwner.isDisplayed());
        Assert.assertTrue(addEventPage.fieldOrganizerDispName.isDisplayed());
        Assert.assertTrue(addEventPage.fieldOrganizerEmail.isDisplayed());
        Assert.assertTrue(addEventPage.fieldStartDate.isDisplayed());
        Assert.assertTrue(addEventPage.fieldEndDate.isDisplayed());

        try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    @Then("User should see a warning message if any compulsory field is blank")
    public void userShouldSeeAWarningMessageIfAnyCompulsoryFieldIsBlank() {
        Actions actions = new Actions(Driver.getDriver());

        addEventPage.startDateBox.clear();
        addEventPage.endDateBox.clear();
        BrowserUtils.sleep(2);
        actions.doubleClick(addEventPage.titleBox).perform();

        BrowserUtils.sleep(2);
        addEventPage.saveButton.click();
        Assert.assertEquals("This value should not be blank.", addEventPage.titleBoxWarning.getText());

        BrowserUtils.sleep(2);
        Assert.assertEquals("This value should not be blank.", addEventPage.startDateBoxWarning.getText());

        Assert.assertEquals("This value should not be blank.", addEventPage.endDateBoxWarning.getText());

        actions.moveToElement(addEventPage.organizerEmailBox).perform();
        BrowserUtils.sleep(1);
        Assert.assertEquals("This value should not be blank.", addEventPage.organizerDispNameBox.getText());


        Assert.assertEquals("This value should not be blank.", addEventPage.organizerEmailBox.getText());



        try {
            //BrowserUtils.sleep(15);
            BrowserUtils.waitForVisibility(addEventPage.addEventCloseButton, 15);
            addEventPage.addEventCloseButton.click();
            BrowserUtils.sleep(1);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        }


    }
}
