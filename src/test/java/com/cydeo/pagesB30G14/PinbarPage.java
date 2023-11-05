package com.cydeo.pagesB30G14;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinbarPage {
    public PinbarPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class=\"list-bar\"]/div/a[text()='Learn how to use this space']" )
    public WebElement ThisSpaceLink;

    @FindBy(xpath = "//img[contains(@src,'/bundles/oronavigation/images/pinbar')]")
    public WebElement ImagePinbar;

    @FindBy(xpath = "//h3[text()='How To Use Pinbar']" )
    public WebElement HowToText;

    @FindBy(xpath = "//p[starts-with(normalize-space(text()),'Use pin icon on the right top corner')]")
    public WebElement LongText;






}
