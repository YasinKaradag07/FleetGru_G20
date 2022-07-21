package com.fleetgru.step_definitions;

import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.QuickLaunchpadPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.ConfigurationReader;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logout_StepDef {
    LoginPage loginPage = new LoginPage();
    QuickLaunchpadPage quickLaunchpadPage = new QuickLaunchpadPage();

    @Given("the user is already logged in")
    public void the_user_is_already_logged_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
       loginPage.usernameBox.sendKeys("user1");
       loginPage.passwordBox.sendKeys("UserUser123"+ Keys.ENTER);
    }

    @When("the user clicks the profile menu")
    public void the_user_clicks_the_profile_menu() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.invisibilityOf(loginPage.loadingBar));
        quickLaunchpadPage.profileMenuDropdown.click();
    }

    @When("the user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        quickLaunchpadPage.logoutButton.click();
    }

    @Then("the user logout successfully and navigates to login page")
    public void the_user_logout_successfully_and_navigates_to_login_page() {
        String actualLoginPageTitle = Driver.getDriver().getTitle();
        String expectedLoginPageTitle = "Login";
        Assert.assertEquals(expectedLoginPageTitle,actualLoginPageTitle);
    }

    @When("the user logs out and lands on login page")
    public void the_user_logs_out_and_lands_on_login_page() {
        the_user_clicks_the_profile_menu();
        the_user_clicks_the_logout_button();
        the_user_logout_successfully_and_navigates_to_login_page();
    }

    @When("the user clicks step back button")
    public void the_user_clicks_step_back_button() {
        Driver.getDriver().navigate().back();
    }

    @Then("the user should NOT be able to navigate back to homepage")
    public void the_user_should_not_be_able_to_navigate_back_to_homepage() {
        the_user_logout_successfully_and_navigates_to_login_page();
    }

    @When("the user close all tabs of Fleetgru app")
    public void the_user_close_all_tabs_of_fleetgru_app() {
        BrowserUtils.openNewTab(ConfigurationReader.getProperty("url"));
        BrowserUtils.openNewTab("");
        BrowserUtils.closeSpecificTab("Dashboard");
        BrowserUtils.closeSpecificTab("Dashboard");
    }

    @When("the user navigates back to web app")
    public void the_user_navigates_back_to_web_app() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtils.closeSpecificTab("");
    }

    @Then("the user should NOT be able to land on  Fleetgru homepage")
    public void the_user_should_not_be_able_to_land_on_fleetgru_homepage() {
        String expectedTitle="Login";
        BrowserUtils.sleep(2);
        String actualTitle=Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }




}
