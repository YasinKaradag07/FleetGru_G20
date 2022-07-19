package com.fleetgru.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QuickLaunchpadPage extends BasePage{

    @FindBy(xpath = "//h1[.='Quick Launchpad']")
    public WebElement quickLaunchpad;

    @FindBy(xpath = "//li[@id='user-menu']/a")
    public WebElement profileMenu;

    @FindBy(xpath = "//i[@class='fa-caret-down']")
    public WebElement profileMenuDropdown;

    @FindBy(xpath = "//a[@class='no-hash']")
    public WebElement logoutButton;



}
