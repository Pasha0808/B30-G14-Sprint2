package com.cydeo.step_definitions;

import com.cydeo.pagesB30G14.PinbarPage;
import com.cydeo.pagesB30G14.R_VytrackLoginPage;
import io.cucumber.java.en.Then;

public class US03_PinbarFunction {
    R_VytrackLoginPage vytrackLoginPage = new R_VytrackLoginPage();
    PinbarPage pinbarPage = new PinbarPage();

    /*
    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);

        }
    }
     */
    @Then("user should click on Learn how to use this space")
    public void user_should_click_on_learn_how_to_use_this_space() {
        pinbarPage.ThisSpaceLink.click();


    }
    @Then("user should see an image on the page")
    public void user_should_see_an_image_on_the_page() {

    }

    @Then("user should see How To Use Pinbar text")
    public void user_should_see_how_to_use_pinbar_text() {

    }
    @Then("user should see Use the pin icon on the right top corner of the page to create fast access link in the pinbar text")
    public void user_should_see_use_the_pin_icon_on_the_right_top_corner_of_the_page_to_create_fast_access_link_in_the_pinbar_text() {

    }

}
