package com.cydeo.pagesB30G14;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {


    public HomePage() {

        PageFactory.initElements(Driver.getDriver(),this);
    }



    @FindBy(xpath = "//i[@class='fa-question-circle']")

    public WebElement questionButton;


}
