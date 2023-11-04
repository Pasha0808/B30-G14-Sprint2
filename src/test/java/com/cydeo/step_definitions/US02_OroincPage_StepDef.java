package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.HomePage;
import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US02_OroincPage_StepDef {
    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();

    @Given("user is already on the main  page of the Fleet application")
    public void user_is_already_on_the_main_page_of_the_fleet_application() {


        Driver.getDriver().get(ConfigurationReader.getProperty("vyTrackUrl"));

        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
      // vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
       // vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));



    }

/*
 driver_username=user1
            driver_password=UserUser123
    sales_manager_username=salesmanager101
            sales_manager_password=UserUser123
    store_manager_username=storemanager51
            store_manager_password=UserUser123
 */





    @When("driver clicks on the question icon on the home page")
    public void driver_clicks_on_the_question_icon_on_the_home_page() {

        HomePage homePage=new HomePage();

        homePage.questionButton.click();

        Driver.getDriver().getWindowHandle();


    }
    @Then("driver is able to access to the Oroinc Documentation page")
    public void driver_is_able_to_access_to_the_oroinc_documentation_page() {

        String expected="Dashboard";
        String actual=Driver.getDriver().getTitle();

        Assert.assertEquals(actual,expected);

    }



    @When("store_manager clicks on the  question icon on the home page")
    public void store_manager_clicks_on_the_question_icon_on_the_home_page() {

        HomePage homePage=new HomePage();

        homePage.questionButton.click();

        Driver.getDriver().getWindowHandle();

    }
    @Then("store_manager  is able to access to the Oroinc Documentation page")
    public void store_manager_is_able_to_access_to_the_oroinc_documentation_page() {

        String expected="Dashboard";
        String actual=Driver.getDriver().getTitle();

        Assert.assertEquals(actual,expected);

    }



    @When("sales_manager clicks on the question icon on the home page")
    public void sales_manager_clicks_on_the_question_icon_on_the_home_page() {
        HomePage homePage=new HomePage();

        homePage.questionButton.click();

        Driver.getDriver().getWindowHandle();

    }
    @Then("sales_manager is able to access to the Oroinc Documentation page")
    public void sales_manager_is_able_to_access_to_the_oroinc_documentation_page() {
        String expected="Dashboard";
        String actual=Driver.getDriver().getTitle();

        Assert.assertEquals(actual,expected);

    }


}
