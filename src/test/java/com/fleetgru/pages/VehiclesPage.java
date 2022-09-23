package com.fleetgru.pages;

import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;

import org.junit.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import java.util.List;


public class VehiclesPage extends BasePage {

    @FindBy(xpath = "//table[contains(@class, 'grid table')]")
    public WebElement vehicleTable;

    @FindBy(xpath = "//input[contains(@class, 'input-widget')]")
    public WebElement pageNumber;

    @FindBy(xpath = "//a[@data-grid-pagination-direction='next']")
    public WebElement pageForwardButton;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement pageBackwardsBtn;

    @FindBy(xpath = "//*[contains(text(), 'Total of ')]")
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






    @FindBy(xpath = "(//div[@class='pagination pagination-centered']/label)[2]")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageDropdownButton;

    @FindBy(xpath = "//a[@data-size='10']")
    public WebElement dropdownMenuNumber10;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/h5/span")
    public WebElement generalInfoPage;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement driverFleet;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/a/span")
    public WebElement managerFleet;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/div/div/ul/li[3]/a/span")
    public WebElement driverVehicles;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[2]/div/div/ul/li[3]/a/span")
    public WebElement managerVehicles;

    @FindBy(xpath = "//div/table/tbody/tr[1]")
    public WebElement firstDriverCar;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[2]")
    public WebElement firstManagerCar;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[20]/div/div/a")
    public WebElement driverThreeDotsIcon;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[21]/div/div/a")
    public WebElement managerThreeDotsIcon;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[20]/div/div/ul/li/ul/li[1]/a/i")
    public WebElement driverEyeIcon;

    @FindBy(xpath = "/html/body/div[2]/div[2]/div[1]/div[2]/div[3]/div[3]/div[2]/div[2]/div[2]/div/table/tbody/tr[1]/td[21]/div/div/ul/li/ul/li[1]/a/i")
    public WebElement managerEyeIcon;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/a")
    public WebElement managerEditButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/a")
    public WebElement managerDeleteButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/a")
    public WebElement managerAddEventButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div/a")
    public WebElement driverAddEventButton;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[2]/ul/li")
    public WebElement firstDriverTag;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div")
    public WebElement firstDriverTagName;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[4]")
    public WebElement firstDriverLocation;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[4]/div/div")
    public WebElement firstDriverLocationName;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[3]/ul/li")
    public WebElement firstManagerTag;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/div/div")
    public WebElement firstManagerTagName;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[5]")
    public WebElement firstManagerLocation;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[4]/div/div")
    public WebElement firstManagerLocationName;

/*
    @FindBy(xpath = "//a[@data-size='25']")
    public WebElement dropDownMenuNumber25;

    @FindBy(xpath = "//a[@data-size='50']")
    public WebElement dropDownMenuNumber50;

    @FindBy(xpath = "//a[@data-size='100']")
    public WebElement dropDownMenuNumber100;
    */

    @FindBy(xpath = "//tr[@class='grid-row']")
    public List<WebElement> tableRows;

    public void waitForVisibilityOfDropdownButton(){
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.visibilityOf(viewPerPageDropdownButton));
    }

    @FindBy(xpath = "//a[@class='dropdown-item']")
    public List<WebElement> dropdownNumbersList;

    public void listCompare(String string){
        ArrayList<String> numberList = new ArrayList<>();
        for(WebElement each : dropdownNumbersList){
            numberList.add(each.getText());
        }
        Assert.assertTrue(numberList.contains(string));
    }

    @FindBy(xpath = "//span[.='License Plate']")
    public WebElement licencePlateColumnName;

    //@FindBy(xpath = "(//a[@class='grid-header-cell__link'])[1]")
    //public WebElement licencePlateColumnName;

    @FindBy(xpath = "//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-LicensePlate']")
    public List<WebElement> licencePlateCells;

    public void waitForClickabilityOfLicencePlateColumnName(){
        try {
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until(ExpectedConditions.elementToBeClickable(licencePlateColumnName));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void verifyColumnsSortableByClicking(){

        // then get the list of licence plates in sorted order
        List<String> licencePlateTextsReverseSorted = new ArrayList<>();
        for(WebElement eachLicencePlate : licencePlateCells){
            licencePlateTextsReverseSorted.add(eachLicencePlate.getText());
        }
        System.out.println("licencePlateTextsReverseSorted = " + licencePlateTextsReverseSorted);

        //after getting changed order's licence plates, click column name again

        licencePlateColumnName.click();
        BrowserUtils.sleep(3);


        //JavascriptExecutor js = (JavascriptExecutor)Driver.getDriver();
        //js.executeScript("arguments[0].scrollIntoView()", licencePlateColumnName);

        // then again get texts of licence plates in sorted order again

        List<String> licencePlateTextsAfterSecondClick = new ArrayList<>();

        for(WebElement eachLicencePlate : licencePlateCells){

            licencePlateTextsAfterSecondClick.add(eachLicencePlate.getText());
        }
        System.out.println("licencePlateTextsAfterSecondClick = " + licencePlateTextsAfterSecondClick);

        // then we need to verify if we could change the list order
        String firstLicencePlateOfList = licencePlateTextsReverseSorted.get(0);
        String firstLicencePlateOfSortedList = licencePlateTextsAfterSecondClick.get(0);
        Assert.assertNotEquals(firstLicencePlateOfList,firstLicencePlateOfSortedList);

    }


}
