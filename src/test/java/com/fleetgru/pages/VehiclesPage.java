package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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
    public WebElement dropdownMenuNumberTen;

    @FindBy(xpath = "grid-row")
    public WebElement vehicleTableRows;

    public static int getElementsCount(By locator) {

        List<WebElement> rows = Driver.getDriver().findElements(locator);
        List<String> tableRows = new ArrayList<>();

        for (WebElement row : rows) {
            tableRows.add(row.getText());
        }
        return tableRows.size();
    }

}
