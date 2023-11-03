package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.PinbarPage;
import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class US03_PinbarFunction {
    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    PinbarPage pinbarPage = new PinbarPage();
    //BrowserUtils utils = new BrowserUtils();


    @Then("user should click on Learn how to use this space")
    public void user_should_click_on_learn_how_to_use_this_space() {
       BrowserUtils.waitForClickablility(pinbarPage.ThisSpaceLink,10);
       pinbarPage.ThisSpaceLink.click();
        //Actions builder = new Actions(Driver.getDriver());
        //builder.moveToElement(pinbarPage.ThisSpaceLink, 149, 20).click().build().perform();


    }
    @Then("user should see an image on the page")
    public void user_should_see_an_image_on_the_page() {
        BrowserUtils.sleep(2);
        BrowserUtils.verifyElementDisplayed(pinbarPage.ImagePinbar);


    }

    @Then("user should see How To Use Pinbar text")
    public void user_should_see_how_to_use_pinbar_text() {
        BrowserUtils.sleep(2);
        String expectedText ="How To Use Pinbar";
        Assert.assertEquals(expectedText,pinbarPage.HowToText.getText());
    }
    @Then("user should see Use the pin icon on the right top corner of the page to create fast access link in the pinbar text")
    public void user_should_see_use_the_pin_icon_on_the_right_top_corner_of_the_page_to_create_fast_access_link_in_the_pinbar_text() {
        BrowserUtils.sleep(2);
        String expectedText ="Use the pin icon on the right top corner of the page to create fast access link in the pinbar.";
        Assert.assertEquals(expectedText,pinbarPage.LongText.getText());
    }

}
