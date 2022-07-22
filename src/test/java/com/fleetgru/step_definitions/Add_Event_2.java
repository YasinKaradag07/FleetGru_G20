package com.fleetgru.step_definitions;

import com.fleetgru.pages.AddEvent_2_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Event_2 {

    AddEvent_2_Page addEvent_2_page = new AddEvent_2_Page();

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


}
