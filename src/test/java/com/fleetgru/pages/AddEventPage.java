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
    public List<WebElement> AllCarRow;  //to store all 25 row

    @FindBy(xpath = "//a[text()='Add Event']")
    public WebElement AddEvent;

    @FindBy(xpath = "//*[@aria-describedby='ui-id-1']")
    public WebElement AddEventPopUp;

    @FindBy(xpath = "//*[@id='ui-id-2']")
    public WebElement AddEventPopUpTitle;

    @FindBy(xpath = "//*[@class='control-label wrap']//em[contains(text(),'*')]/parent::*")
    public List<WebElement> CompulsoryField;

    @FindBy(xpath = "//tr[@class='grid-row row-click-action'][1]")
    public WebElement OneCarToAddEvent;




}
