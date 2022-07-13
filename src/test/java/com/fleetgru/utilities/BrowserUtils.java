package com.fleetgru.utilities;

import org.openqa.selenium.JavascriptExecutor;

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

}
