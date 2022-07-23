package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
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

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[1]")
    public WebElement firstDriverCar;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[2]")
    public WebElement firstManagerCar;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[20]/div/div/a")
    public WebElement driverThreeDotsIcon;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[21]/div/div/a")
    public WebElement managerThreeDotsIcon;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[20]/div/div/ul/li/ul/li[1]/a")
    public WebElement driverEyeIcon;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[21]/div/div/ul/li/ul/li[1]/a")
    public WebElement managerEyeIcon;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[1]/a")
    public WebElement managerEditButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[2]/a")
    public WebElement managerDeleteButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div[3]/a")
    public WebElement managerAddEventButton;

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div[1]/div/div/div[1]/div[1]/div/a")
    public WebElement driverAddEventButton;

    @FindBy(xpath = "//div/table/tbody/tr[1]/td[1]/input")
    public WebElement inputBox;

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


}
