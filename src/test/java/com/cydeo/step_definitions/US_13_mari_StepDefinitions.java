package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import com.cydeo.pagesB30G14.US_13_mari_Page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.Collections;
import java.util.List;

public class US_13_mari_StepDefinitions {


    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();

    US_13_mari_Page us13MariPage = new US_13_mari_Page();




    @Given("user logged in the page")
    public void userLoggedInThePage() {

        vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"), ConfigurationReader.getProperty("sales_manager_password"));

    }


    @Given("user logged in the page as a store manager")
    public void userLoggedInThePageAsAStoreManager() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"), ConfigurationReader.getProperty("store_manager_password"));

    }

    @When("user navigates to fleet button")
    public void user_navigates_to_fleet_button() {

        BrowserUtils.sleep(2);
        BrowserUtils.hover(us13MariPage.fleetButton);
/*
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(3);
        WebElement element = Driver.getDriver().findElement(By.xpath("(//span[@class='title title-level-1'])[2]"));

        actions.moveToElement(element).build().perform();

 */

    }

    @When("user clicks on the Vehicle Costs button")
    public void user_clicks_on_the_vehicle_costs_button() {

        us13MariPage.vehicleButton.click();

    }

    @Then("user sees following columns:")
    public void user_sees_following_columns(List<String> expectedColumns) {
        BrowserUtils.sleep(3);
        List<String> actualColumns = BrowserUtils.getElementsText(us13MariPage.columnHeaders);
        actualColumns.removeIf(k-> k.isEmpty() || Collections.frequency(actualColumns,k)>1);
        System.out.println("actualColumns = " + actualColumns);
        System.out.println("expectedColumns = " + expectedColumns);
        Assert.assertEquals(expectedColumns,actualColumns);


    }


    @Then("user selects all records by clicking first checkbox")
    public void user_selects_all_records_by_clicking_first_checkbox() {

        us13MariPage.firstCheckBox.click();

        Assert.assertTrue(us13MariPage.firstCheckBox.isSelected());

    }



}
