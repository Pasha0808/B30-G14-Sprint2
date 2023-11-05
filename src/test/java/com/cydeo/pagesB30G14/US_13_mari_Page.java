package com.cydeo.pagesB30G14;

import com.cydeo.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class US_13_mari_Page extends BasePage {



    @FindBy(xpath = "(//span[@class='title title-level-1'])[2]")
    public WebElement fleetButton;

    public void loginSalesManager(){
        username.sendKeys(ConfigurationReader.getProperty("sales_manager_username"));
        password.sendKeys(ConfigurationReader.getProperty("sales_manager_password"));
        loginBtn.click();
    }

    @FindBy(xpath = "//a[@class='grid-header-cell__link']")
    public List<WebElement> columnHeaders;


    @FindBy(xpath = "//a[.='Vehicle Costs']")
    public WebElement vehicleButton;


    @FindBy(xpath = "//button[@class='btn btn-default btn-small dropdown-toggle']/input[@type='checkbox']")
    public WebElement firstCheckBox;



}
