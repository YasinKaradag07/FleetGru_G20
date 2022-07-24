package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEventPage extends BasePage {






    ///------------------------------------------------------------------


    @FindBy(xpath = "(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Location'])[1]")
    public WebElement vehiclesRow1;

    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[@id='ui-id-10']")
    public WebElement addEventPopUpTitle;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement addEventCloseButton;

    @FindBy(className = "ui-dialog")
    public WebElement addEventPopUp;

//    @FindBy(xpath = "//*[@class=\"required\"]/em[text()=\"*\"]/..")
//    public List<WebElement> compulsoryFieldsList;

    @FindBy(xpath = "//label[text()='Title']")
    public WebElement fieldTitle;

    @FindBy(xpath = "//label[text()='Owner']")
    public WebElement fieldOwner;

    @FindBy(xpath = "//label[text()='Organizer display name']")
    public WebElement fieldOrganizerDispName;

    @FindBy(xpath = "//label[text()='Organizer email']")
    public WebElement fieldOrganizerEmail;

    @FindBy(xpath = "//label[text()='Start']")
    public WebElement fieldStartDate;

    @FindBy(xpath = "//label[text()='End']")
    public WebElement fieldEndDate;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement startDateBox;

    @FindBy(xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement endDateBox;

    //@FindBy(xpath = "//button[.='Save']")
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement saveButton;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[2]")
    public WebElement titleBoxWarning;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[5]")
    public WebElement startDateBoxWarning;

    @FindBy(xpath = "(//span[.='This value should not be blank.'])[8]")
    public WebElement endDateBoxWarning;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[organizerDisplayName]']")
    public WebElement organizerDispNameBox;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement organizerEmailBox;

    @FindBy(xpath = "//input[@name='oro_calendar_event_form[title]']")
    public WebElement titleBox;

}
