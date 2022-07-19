package com.fleetgru.pages;

import com.fleetgru.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id = "prependedInput")
    public WebElement usernameBox;

    @FindBy(id = "prependedInput2")
    public WebElement passwordBox;

    @FindBy(id = "_submit")
    public WebElement loginButton;

    @FindBy(xpath = "//div[@class='bar']")
    public WebElement loadingBar;

    @FindBy(xpath = "//div[.='Invalid user name or password.']")
    public WebElement invalidCredentialsMessage;

    @FindBy(xpath = "//a[.='Forgot your password?']")
    public WebElement forgotPasswordLink;

    @FindBy(xpath = "//span[@class='custom-checkbox__text']")
    public WebElement rememberMeLink;

    @FindBy(xpath = "//span[@class='custom-checkbox__icon']")
    public WebElement rememberMeCheckbox;

    public void loginAsUserType(String userType){

        String password = "";
        String username = "";

        if (userType.equals("Driver")) {
            username = ConfigurationReader.getProperty("driver_username");
            password = ConfigurationReader.getProperty("driver_password");
        }
        else if (userType.equals("Sales Manager")) {
            username = ConfigurationReader.getProperty("sales_manager_username");
            password = ConfigurationReader.getProperty("sales_manager_password");
        }
        else if (userType.equals("Store Manager")) {
            username = ConfigurationReader.getProperty("store_manager_username");
            password = ConfigurationReader.getProperty("store_manager_password");
        }

        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }


    public void loginWithCredentials(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);
        loginButton.click();
    }

    public void inputCredentials(String username, String password){
        usernameBox.sendKeys(username);
        passwordBox.sendKeys(password);

    }

}
