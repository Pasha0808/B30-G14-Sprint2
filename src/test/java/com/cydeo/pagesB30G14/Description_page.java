package com.cydeo.pagesB30G14;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Description_page extends BasePage{


    @FindBy(xpath = "(//span[contains(text(),'Activities')])[1]")
    public WebElement activitiesButton;

    @FindBy(xpath = "(//span[text()='Calendar Events'])[1]")

    public WebElement calenderEvent;

    @FindBy(xpath = "//a[@title='Create Calendar event']")

    public WebElement creatCaLenderEvent;

    @FindBy(xpath = "(//input[@type='checkbox'])[2]")

    public WebElement repeatCheckBox;

    @FindBy(xpath = "//body[@class='mce-content-body ']")

    public WebElement descriptionText;

    @FindBy(xpath = "//p[.='Scrum daily meeting']")

    public WebElement displayedMsg;

}
////iframe[1]
////body[@id='tinymce']
////body[@class='mce-content-body']