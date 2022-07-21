package com.fleetgru.pages;

import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManageFiltersPage extends BasePage {

    // to check login correct page(driver->quick launchpad, other->dashboard)
    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement homepageSubTitle;

    @FindBy(css = "div[class='loader-mask shown']")
    @CacheLookup
    protected WebElement loaderMask;

    @FindBy(xpath = "//span[contains(text(),'Fleet') and @class = 'title title-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "//span[.='Vehicles']")
    public WebElement vehicleModule;

    @FindBy(xpath = "//i[@class='fa-filter hide-text']")
    public WebElement filterIcon;

    @FindBy(xpath = "//a[@class= 'add-filter-button']")
    public WebElement manageFiltersButton;

    @FindBy(id = "ui-multiselect-0-0-option-0")
    public WebElement licensePlateCheckbox;

    @FindBy(xpath = "//select[@data-action = 'add-filter-select']")
    public WebElement filtersDropdown;


    @FindBy(xpath = "//input[@type = 'search']")
    public WebElement filterInputBox;

    public String typedFilter = "";
    public String clickedFilter = "";

    @FindBy(xpath = "(//i[@class = 'fa-refresh'])[1]")
    public WebElement resetIcon;

    public String userType = "";








    public void navigateToFleetVehicleModule() {

        try {
            waitForClickablility(fleetTab, 5);
            new Actions(Driver.getDriver()).moveToElement(fleetTab).pause(200).doubleClick(fleetTab).build().perform();
        } catch (Exception e) {
            System.out.println("fleetTab not clickable");
        }

        try {
            waitForVisibility(vehicleModule, 5);
            scrollToElementAndClick(vehicleModule);

        } catch (Exception e) {
            System.out.println("vehicleModule not clickable");
        }
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }



    public static void clickWithWait(By by, int attempts) {
        int counter = 0;
        //click on element as many as you specified in attempts parameter
        while (counter < attempts) {
            try {
                //selenium must look for element again
                clickWithJS(Driver.getDriver().findElement(by));
                //if click is successful - then break
                break;
            } catch (WebDriverException e) {
                //if click failed
                //print exception
                //print attempt
                e.printStackTrace();
                ++counter;
                //wait for 1 second, and try to click again
                BrowserUtils.sleep(1);
            }
        }
    }


    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }

    public static void scrollToElementAndClick(WebElement element) {
        new Actions(Driver.getDriver()).moveToElement(element).pause(200).doubleClick(element).build().perform();
    }



    public static WebElement waitForVisibility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

}
