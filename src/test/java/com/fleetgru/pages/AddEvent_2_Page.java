package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddEvent_2_Page extends BasePage {


    @FindBy (xpath = "//a[@data-action-name=\"new-event\"]")
    public WebElement addNewEventButton;

    @FindBy(xpath = "//*[@id=\"ui-id-14\"]")
    public WebElement addNewEventPage;



}
