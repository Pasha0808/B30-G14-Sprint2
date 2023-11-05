package com.cydeo.pagesB30G14;

import com.cydeo.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;

public class US7Page {
    public US7Page() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetDropDownBtn;
    @FindBy(xpath = "//a/span[.='Vehicles']")
    public WebElement vehicleDropDownBtn;
    @FindBy(xpath = "//button/input[@type='checkbox']")
    public WebElement firstCheckBoxBtn;


    public void selectAnyCar() {

        Random random = new Random();
        int randomNum = random.nextInt(6);

        String element = "//table/tbody/tr[" + randomNum + "]/td[1]/input";
        WebElement randomCheckBox = Driver.getDriver().findElement(By.xpath(element));
        randomCheckBox.click();
        Assert.assertTrue(randomCheckBox.isSelected());
    }


}