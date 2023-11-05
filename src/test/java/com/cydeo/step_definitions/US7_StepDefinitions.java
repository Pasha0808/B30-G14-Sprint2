package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import com.cydeo.pagesB30G14.US7Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.interactions.Actions;

public class US7_StepDefinitions {
    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    US7Page us7Page = new US7Page();

    @Given("user is go to login page")
    public void user_is_go_to_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
        // vytrackLoginPage.dynamicLogin("sales manager");
        vytrackLoginPage.dynamicLogin("store manager");

    }

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String string) {

        BrowserUtils.sleep(2);
        BrowserUtils.verifyTitle("Dashboard");
        System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

    }

    @Given("user hover over Fleet button")
    public void user_hover_over_fleet_button() {

        BrowserUtils.sleep(2);

        Actions action = new Actions(Driver.getDriver());
        action.moveToElement(us7Page.fleetDropDownBtn).perform();
    }

    @Given("user clicks Vehicles button")
    public void user_clicks_vehicles_button() {
        BrowserUtils.sleep(2);
        us7Page.vehicleDropDownBtn.click();
    }

    @Then("all checkboxes should be unchecked")
    public void all_checkboxes_should_be_unchecked() {
        BrowserUtils.sleep(2);
        System.out.println("All cars checkboxes are selected = " + us7Page.firstCheckBoxBtn.isSelected());
    }

    @Then("first checkbox button should be checked all checkboxes")
    public void first_checkbox_button_should_be_checked_all_checkboxes() {
        BrowserUtils.sleep(3);
        us7Page.firstCheckBoxBtn.click();
        System.out.println("All cars checkboxes are selected= " + us7Page.firstCheckBoxBtn.isSelected());
    }

    @Then("any checkbox button  should be clickable")
    public void any_checkbox_button_should_be_clickable() {
        BrowserUtils.sleep(2);
        us7Page.selectAnyCar();


    }}