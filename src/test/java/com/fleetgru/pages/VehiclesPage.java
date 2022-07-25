package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;


import java.util.List;

public class VehiclesPage extends BasePage {

    @FindBy(xpath = "//table[contains(@class, 'grid table')]")
    public WebElement vehicleTable;

    @FindBy(xpath = "//input[contains(@class, 'input-widget')]")
    public WebElement pageNumber;

    @FindBy(xpath = "//i[@class='fa-chevron-right hide-text']")
    public WebElement pageForwardButton;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement pageBackwardsBtn;

    @FindBy(xpath = "//*[contains(text(), 'Total of 158 records')]")
    public WebElement totalRecords;

    @FindBy(xpath = "//a[contains(@title,'With this button you will export')]")
    public WebElement exportButton;

    @FindBy(xpath = "//a[@title='CSV']")
    public WebElement csvButton;

    @FindBy(xpath = "//a[@title='XLSX']")
    public WebElement xlsxButton;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement exportMessage;
    
    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gearIcon;

    @FindBy(xpath = "//div[@class='dropdown-menu']")
    public WebElement gridSettingsDropdownMenu;

    @FindBy(xpath = "//input[@data-role='column-manager-search']")
    public WebElement quickSearchBox;

    public List<String> columnNames(){
        for (int i = 469; i <=488 ; i++) {
           columnNames().add(Driver.getDriver().findElement(By.xpath("//label[@for='column-c"+i+"']")).getText());
        }
        return columnNames();
    }

    @FindBy(xpath = "//span[@class='column-filter-match']")
    public WebElement getQuickSearchResult;


    @FindBy(xpath = "//label[@for='column-c469']")
    public WebElement id;

    @FindBy(xpath = "//label[@for='column-c470']")
    public WebElement licensePlate;

    @FindBy(xpath = "//label[@for='column-c471']")
    public WebElement Tags;

    @FindBy(xpath = "//label[@for='column-c472']")
    public WebElement driverr;

    @FindBy(xpath = "//label[@for='column-c473']")
    public WebElement location;

    @FindBy(xpath = "//label[@for='column-c474']")
    public WebElement chassisNumber;

    @FindBy(xpath = "//label[@for='column-c475']")
    public WebElement modelYear;

    @FindBy(xpath = "//label[@for='column-c476']")
    public WebElement lastOdometer;

    @FindBy(xpath = "//label[@for='column-c477']")
    public WebElement immatriculationDate;

    @FindBy(xpath = "//label[@for='column-c478']")
    public WebElement firstContractDate;

    @FindBy(xpath = "//label[@for='column-c479']")
    public WebElement catalogValue;

    @FindBy(xpath = "//label[@for='column-c480']")
    public WebElement seatsNumber;

    @FindBy(xpath = "//label[@for='column-c481']")
    public WebElement doorsNumber;

    @FindBy(xpath = "//label[@for='column-c482']")
    public WebElement color;

    @FindBy(xpath = "//label[@for='column-c483']")
    public WebElement transmission;

    @FindBy(xpath = "//label[@for='column-c484']")
    public WebElement fuelType;

    @FindBy(xpath = "//label[@for='column-c485']")
    public WebElement co2Emmisions;

    @FindBy(xpath = "//label[@for='column-c486']")
    public WebElement horsePower;

    @FindBy(xpath = "//label[@for='column-c487']")
    public WebElement horsePowerTaxation;

    @FindBy(xpath = "//label[@for='column-c488']")
    public WebElement power;







}
