package com.fleetgru.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class BrowserUtils {

    public static void sleep(int seconds){
        seconds*=1000;
        try{
            Thread.sleep(seconds);
        }catch(InterruptedException e){

        }
    }

    /**
     * Open a new tab and navigates to given url
     * ATTENTION: driver will be stayed on the current(previous) tab, not the new opening tab
     */
    public static void openNewTab(String url){
        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('"+url+"','_blank');");
    }

    /**
     * This method close the tab/tabs which have the given title
     * And switch to tab which have different title
     * @param pageTitle
     */
    public static void closeSpecificTab(String pageTitle){
        String newTab = "";
        for (String each : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(each);
            if (Driver.getDriver().getTitle().equals(pageTitle)){
                Driver.getDriver().close();
            }else{
                newTab = each;
            }
        }
        Driver.getDriver().switchTo().window(newTab);
    }

    /**
     * Waits for the provided element to be visible on the page
     *
     * @param element
     * @param timeToWaitInSec
     * @return
     */
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), timeToWaitInSec);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void waitForStaleElement(WebElement element) {
        int y = 0;
        while (y <= 15) {
            if (y == 1)
                try {
                    element.isDisplayed();
                    break;
                } catch (StaleElementReferenceException st) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } catch (WebDriverException we) {
                    y++;
                    try {
                        Thread.sleep(300);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
        }
    }


    public static void executeJSCommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }




}
