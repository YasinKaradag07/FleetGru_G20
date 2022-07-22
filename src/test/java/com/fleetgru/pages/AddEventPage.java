package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEventPage extends BasePage {



    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement FleetTab;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a")
    public WebElement FleetVehicle;

    @FindBy(xpath = "//tbody[@class='grid-body']//tr")
    public List<WebElement> AllCarRow;  //to store all 25 rows


    @FindBy(xpath = "//*[@aria-describedby='ui-id-1']")
    public WebElement AddEventPopUp;



    @FindBy(xpath = "//*[@class='control-label wrap']//em[contains(text(),'*')]/parent::*")
    public List<WebElement> CompulsoryField;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action'][1]")
    public WebElement OneCarToAddEvent;


    ///------------------------------------------------------------------


    @FindBy(xpath = "(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Location'])[1]")
    public WebElement vehiclesRow1;

    @FindBy(xpath = "//a[@title='Add an event to this record']")
    public WebElement addEventButton;

    @FindBy(xpath = "//span[@id='ui-id-10']")
    public WebElement addEventPopUpTitle;

    @FindBy(xpath = "//button[@title='close']")
    public WebElement addEventCloseButton;

}
