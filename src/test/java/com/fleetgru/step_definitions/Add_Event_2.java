package com.fleetgru.step_definitions;

import com.fleetgru.pages.AddEvent_2_Page;
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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Add_Event_2 {


    LoginPage loginPage =  new LoginPage();
    AddEvent_2_Page addEvent_2_page = new AddEvent_2_Page();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();
    Actions action = new Actions(Driver.getDriver());
    //AllCarRow allCarRow = new AllCarRow();

    @Given("User on the login page")
    public void user_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("the {string} log in with valid credantials")
    public void the_log_in_with_valid_credantials(String userName) {
        loginPage.loginAsUserType(userName);

    }
    @Then("the user Hover Over Fleet and click  Vehicles")
    public void the_user_hover_over_fleet_and_click_vehicles() {
        addEvent_2_page.waitUntilLoaderScreenDisappear();
        manageFiltersPage.navigateToFleetVehicleModule();
    }
    @Then("the user click any car info")
    public void the_user_click_any_car_info() {
        addEvent_2_page.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(5);
        addEvent_2_page.anyCarInfo.click();
        //addEvent_2_page.allCarRow.listIterator();
        //addEvent_2_page.allCarRow.subList(0,24);
    }
    @Then("verify that General Information page opened and Add Event Button is seen")
    public void verify_that_general_information_page_opened_and_add_event_button_is_seen() {
        String actualTitle = addEvent_2_page.GeneralInformationPage.getText();
        String expectedTitle = "General Information";
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Then("user click AddEvent button")
        public void user_click_add_event_button() {
            addEvent_2_page.addEvent.click();
        }


/*
        Assert.assertEquals("General Information", ActualTitle);
        wait.until(ExpectedConditions.visibilityOf(addEventPage.AddEvent));
        Boolean ActualFalse = addEventPage.AddEvent.isDisplayed();

        Assert.assertEquals(false, ActualFalse);

*/


/*
        @Then("verify that General Information page opened and Driver cannot see Add Event Button")
        public void verifyThatGeneralInformationPageOpenedAndDriverCannotSeeAddEventButton() {
            String ActualTitle = addEventPage.Title_General_Info_Page();
            Assert.assertEquals("General Information", ActualTitle);
            wait.until(ExpectedConditions.visibilityOf(addEventPage.AddEvent));
            Boolean ActualFalse = addEventPage.AddEvent.isDisplayed();

            Assert.assertEquals(false, ActualFalse);

        }



            public String Title_General_Info_Page() {
                BrowserUtils.waitFor(5);
                String ActualTitle = GeneralInformationPage.getText();
                return ActualTitle;
            }
*/
    }

    /*
    @Given("User clicks New Event button")
    public void user_clicks_new_event_button() {
        addEvent_2_page.addNewEventButton.click();
    }
    @Then("Add New Event page pops up")
    public void add_new_event_page_pops_up() {
        addEvent_2_page.addNewEventPage.getText();
    }

        @Then("the event should be able to coloured")
    public void the_event_should_be_able_to_coloured() {

    }
    @When("user clicks All-day event check box")
    public void user_clicks_all_day_event_check_box() {

    }
    @Then("time boxes disappear")
    public void time_boxes_disappear() {

    }
    @When("user checks repeat button")
    public void user_checks_repeat_button() {

    }
    @Then("repeat options appear on {string}, {string}, {string}, {string}")
    public void repeat_options_appear_on(String string, String string2, String string3, String string4) {

    }
    @Then("Ending options would be clickable as Never, After and By")
    public void ending_options_would_be_clickable_as_never_after_and_by() {

    }
    @Then("all user can be able to see the all events on the General Information page")
    public void all_user_can_be_able_to_see_the_all_events_on_the_general_information_page() {

    }
*/



