package com.cydeo.pagesB30G14;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US7Page_zahide {
    public US7Page_zahide() {
        PageFactory.initElements(Driver.getDriver(), this);

}

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropDownBtn;
    @FindBy(xpath = "//a/span[.='Vehicles']")
    public WebElement vehicleDropDownBtn;
    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement allCheckBoxBtn;

    @FindBy(xpath = "(//input[@data-role='select-row-cell'])[1]")
    public WebElement anyCarCheckBoxBtn;





    }