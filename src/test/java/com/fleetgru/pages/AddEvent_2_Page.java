package com.fleetgru.pages;

import com.fleetgru.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AddEvent_2_Page extends BasePage {

    Actions action = new Actions(Driver.getDriver());

    @FindBy (xpath = "//td[.='Marquis Kemmer']")
    public WebElement anyCarInfo;

/*
    @FindBy(xpath = "//tbody[@class='grid-body']//tr")
    public List<WebElement> allCarRow;
*/
    @FindBy(xpath = "//h5//span")
    public WebElement GeneralInformationPage;

   // @FindBy(xpath = "//*[@id=\"ui-id-14\"]")
    //public WebElement addNewEventPage;

    @FindBy(xpath = "//a[text()='Add Event']")
    public WebElement addEvent;


/*

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

    @FindBy(xpath = "//*[@id=\"oro_calendar_event_form_title-uid-621e90e022579-error\"]/span/span")
    public WebElement TitleAlertMessage;///Add event sayfasında boş bırakırsan titlı verdiği mesaj

    @FindBy(xpath = "//*[@id=\"flash-messages\"]/div/div")
    public WebElement AfterSaveMessage; // getAttribute(innerText: "×\nCalendar event saved")



    public void AllCars_To_AddEvent (){
        for (int i = 1; i < 26; i++) {
            action.moveToElement(allCarRow.get(i)).click().perform();

                    }

*/
}
