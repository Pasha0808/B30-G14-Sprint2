package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.US11_VehicleOdometerPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class US11_VehicleOdometer_StepDef extends US11_VehicleOdometerPage {

    Actions actions = new Actions(Driver.getDriver());


    @Given("user is on homepage")
    public void userIsOnHomepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));
    }

    @And("user login with {string},{string}")
    public void userUserLoginWith(String username, String password) {
        login(username, password);
    }


    @When("user hovers over fleet module")
    public void userHoversOverFleetModule() {
        hoverOverFleet();
    }


    @And("user click's vehicle odometer")
    public void userClickSVehicleOdometer() {
        vehicleOdometerClick();
        }

    @Then("user see's the error message “You do not have permission to perform this action.”")
    public void userSeeSTheErrorMessageYouDoNotHavePermissionToPerformThisAction() {
        Assert.assertTrue(permissionError.isDisplayed());
    }

    @Then("user see's the default page as {int}")
    public void userSeeSTheDefaultPageAs(int arg0) {
        Assert.assertTrue(defaultPageDisplay.isDisplayed());
    }

    @Then("user see's View Per Page as {int}")
    public void userSeeSViewPerPageAs(int arg0) {
        Assert.assertTrue(viewPerPage.isDisplayed());
    }


}
