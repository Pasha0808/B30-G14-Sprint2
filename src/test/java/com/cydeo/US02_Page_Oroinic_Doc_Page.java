package com.cydeo;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US02_Page_Oroinic_Doc_Page {

public US02_Page_Oroinic_Doc_Page(){

    PageFactory.initElements(Driver.getDriver(),this);
}


@FindBy(xpath = "//i[@class='fa-question-circle']")

    public WebElement questionButton;



}
