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

    @FindBy(xpath = "//tbody/tr/td/label")
    public List<WebElement> columnNames;

    @FindBy(xpath = "//span[@class='column-filter-match']")
    public WebElement getQuickSearchResult;









    @FindBy(xpath = "(//div[@class='pagination pagination-centered']/label)[2]")
    public WebElement totalPageNumber;

    @FindBy(xpath = "//button[@class='btn dropdown-toggle ']")
    public WebElement viewPerPageDropdownButton;


    @FindBy(xpath = "//a[@data-size='10']")
    public WebElement dropdownMenuNumber10;
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


    @FindBy(xpath = "//tbody/tr/td/label")
    public List<WebElement> gridColumnNames;

    @FindBy(xpath = "//label[@for='column-c469']")
    public WebElement idCheckBox;

    @FindBy(xpath = "//label[@for='column-c470']")
    public WebElement licensePlateCheckBox;

    @FindBy(xpath = "//label[@for='column-c471']")
    public WebElement tagsCheckBox;

   @FindBy(xpath = "//span[@class='grid-header-cell__label']")
    public List<WebElement> correspondingColumnName;








}
