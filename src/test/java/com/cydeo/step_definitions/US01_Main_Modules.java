package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.R_DatatablePage;
import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US01_Main_Modules {

    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    R_DatatablePage datatablePage= new R_DatatablePage();

    @When("user enter Sales Manager information")
    public void user_enter_sales_manager_information() {
     vytrackLoginPage.login(ConfigurationReader.getProperty("sales_manager_username"),ConfigurationReader.getProperty("sales_manager_password"));
           }

    @When("user enter Store Manager information")
    public void user_enter_store_manager_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("store_manager_username"),ConfigurationReader.getProperty("store_manager_password"));
    }
    @Then("user should be able to see the following modules:")
    public void user_should_be_able_to_see_the_following_modules(List<String> expectedModules) {
        BrowserUtils.sleep(2);
        List <String> actualModules = new ArrayList<>();

        for (WebElement eachModule :datatablePage.allTopModules){
            actualModules.add(eachModule.getText());
        }
        Assert.assertEquals(expectedModules,actualModules);
    }




    @When("user enter Driver information")
    public void user_enter_driver_information() {
        vytrackLoginPage.login(ConfigurationReader.getProperty("driver_username"),ConfigurationReader.getProperty("driver_password"));
    }

        @Then("user should be able to see following modules:")
        public void user_should_be_able_to_see_following_modules(List<String> expectedModules) {
            BrowserUtils.sleep(3);
            List <String> actualModules = new ArrayList<>();

            for (WebElement eachModule :datatablePage.allTopModules){
                actualModules.add(eachModule.getText());
            }
            Assert.assertEquals(expectedModules,actualModules);

        }
}

