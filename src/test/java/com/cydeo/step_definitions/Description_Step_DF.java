package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.Description_page;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Description_Step_DF {

    Description_page descriptionPage = new Description_page();


    @When("user click on the activities button.")
    public void user_click_on_the_activities_button() {
        BrowserUtils.highlightUtil(descriptionPage.activitiesButton);
        descriptionPage.activitiesButton.click();
    }

    @Then("user should be able to click the calender Event.")
    public void user_should_be_able_to_select_the_calender_event() {

        WebElement calenderEvent;
        BrowserUtils.highlightUtil(descriptionPage.calenderEvent);
        descriptionPage.calenderEvent.click();
    }
    @When("user click on the creat calender event button.")
    public void user_click_on_the_creat_calender_event_icon() {

        BrowserUtils.highlightUtil(descriptionPage.creatCaLenderEvent);
        descriptionPage.creatCaLenderEvent.click();
    }
    @Then("user click on repeat box.")
    public void user_clicks_on_repeat_box() {
        BrowserUtils.highlightUtil(descriptionPage.repeatCheckBox);
        descriptionPage.repeatCheckBox.click();


    }

    @When("user write message in description.")
    public void users_write_message_in_description() {

        Driver.getDriver().switchTo().frame(0);



        BrowserUtils.highlightUtil( descriptionPage.descriptionText);
        descriptionPage.descriptionText.click();


        BrowserUtils.highlightUtil(descriptionPage.descriptionText);
        descriptionPage.descriptionText.sendKeys("Scrum daily meeting");

    }
    @Then("the message should be displayed.")
    public void the_message_should_be_displayed() {


       // Driver.getDriver().switchTo().frame(1);

        Assert.assertTrue(descriptionPage.displayedMsg.isDisplayed());



    }


}
