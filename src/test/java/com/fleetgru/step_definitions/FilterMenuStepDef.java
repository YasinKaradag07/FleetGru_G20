package com.fleetgru.step_definitions;

import com.fleetgru.pages.LoginPage;
import com.fleetgru.pages.ManageFiltersPage;
import com.fleetgru.pages.VehiclesPage;
import com.fleetgru.utilities.BrowserUtils;
import com.fleetgru.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

public class FilterMenuStepDef {

    VehiclesPage vehiclesPage = new VehiclesPage();
    ManageFiltersPage manageFiltersPage = new ManageFiltersPage();
    LoginPage loginPage = new LoginPage();


    @When("the user navigates to Fleet Vehicles module")
    public void the_user_navigates_to_fleet_vehicles_module() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(5);
        manageFiltersPage.navigateToFleetVehicleModule();
        BrowserUtils.sleep(5);

    }

    @When("the user clicks filter icon")
    public void the_user_clicks_filter_icon() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        ManageFiltersPage.clickWithWait(By.xpath("//i[@class='fa-filter hide-text']"), 5);
        BrowserUtils.sleep(5);
    }

    @Then("the manage filters button becomes visible")
    public void the_manage_filters_button_becomes_visible() {
        Assert.assertTrue(manageFiltersPage.manageFiltersButton.isDisplayed());
    }

    @When("the user clicks the manage filters button")
    public void the_user_clicks_the_manage_filters_button() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();

        if (manageFiltersPage.manageFiltersButton.isDisplayed()) {
            manageFiltersPage.manageFiltersButton.click();
            BrowserUtils.sleep(5);
        } else {
            ManageFiltersPage.waitForClickablility(manageFiltersPage.filterIcon, 10);
            BrowserUtils.sleep(5);
            manageFiltersPage.manageFiltersButton.click();
            BrowserUtils.sleep(5);
        }

    }

    @Then("filter names become clickable")
    public void filter_names_become_clickable() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText("Tags");
        select.selectByIndex(0);
        select.selectByValue("Driver");
        BrowserUtils.sleep(5);
        Assert.assertTrue(select.isMultiple());
    }

    @When("the user clicks one of the filter")
    public void theUserClicksOneOfTheFilter() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText("Tags");
        BrowserUtils.sleep(5);

    }

    @Then("the filter turns clicked")
    public void theFilterTurnsClicked() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        System.out.println("select.getFirstSelectedOption().getText() = " + select.getFirstSelectedOption().getText());
        Assert.assertEquals(select.getFirstSelectedOption().getText(), "Tags");
    }

    @When("the user waits because it's driver")
    public void the_user_waits_because_it_s_driver() {
        BrowserUtils.sleep(10);
    }

    @When("the user scroll to filter icon and clicks")
    public void the_user_scroll_to_filter_icon_and_clicks() {
        ManageFiltersPage.scrollToElementAndClick(manageFiltersPage.filterIcon);
    }


    @When("the user types {string} into input box")
    public void theUserTypesIntoInputBox(String arg0) {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        manageFiltersPage.filterInputBox.sendKeys(arg0, Keys.ENTER);
        manageFiltersPage.typedFilter = arg0;
        BrowserUtils.sleep(3);

    }




    @Then("typed filter name becomes clickable")
    public void typed_filter_name_becomes_clickable() {
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        select.selectByVisibleText(manageFiltersPage.typedFilter);
        BrowserUtils.sleep(2);
        manageFiltersPage.clickedFilter = select.getAllSelectedOptions().get(0).getText();
        Assert.assertEquals(manageFiltersPage.typedFilter, manageFiltersPage.clickedFilter);

    }


    @When("the user clicks the reset icon")
    public void theUserClicksTheResetIcon() {

        manageFiltersPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(3);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", manageFiltersPage.resetIcon);

    }

    @Then("all filters removed")
    public void allFiltersRemoved() {
        manageFiltersPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.sleep(3);
        Select select = new Select(manageFiltersPage.filtersDropdown);
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].setAttribute('style','visibility:visible;');",select);
        Assert.assertFalse(select.getOptions().get(0).isSelected());



    }


    @When("the user enters the driver information")
    public void theUserEntersTheDriverInformation() {
        manageFiltersPage.userType = "Driver";
        loginPage.loginAsUserType(manageFiltersPage.userType);

    }

    @When("the user enters the sales manager information")
    public void theUserEntersTheSalesManagerInformation() {
        manageFiltersPage.userType = "Sales Manager";
        loginPage.loginAsUserType(manageFiltersPage.userType);
    }

    @When("the user enters the store manager information")
    public void theUserEntersTheStoreManagerInformation() {
        manageFiltersPage.userType = "Store Manager";
        loginPage.loginAsUserType(manageFiltersPage.userType);
    }
}
