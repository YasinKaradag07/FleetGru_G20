package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

}
