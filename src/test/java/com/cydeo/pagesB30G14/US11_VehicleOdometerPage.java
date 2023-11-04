package com.cydeo.pagesB30G14;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US11_VehicleOdometerPage {

    public US11_VehicleOdometerPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement username;


    @FindBy(id="prependedInput2")
    public WebElement password;

    @FindBy(id="_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//li[@class='dropdown dropdown-level-1'][1]")
    public WebElement fleetHover;

//    @FindBy(xpath = "//span[@class='title title-level-1'][1]")
//    public WebElement fleetHoverDriver;

//    @FindBy(xpath = "//*[@id='main-menu']/ul/li[2]/div/div/ul//li[4]/a/span")
//    public WebElement vehicleOdometerClick;

    @FindBy(xpath = "//span[text()='Vehicle Odometer']")
    public WebElement vehicleOdometerClick;

    @FindBy(xpath = "//div[text()='You do not have permission to perform this action.']")
    public WebElement permissionError;

@FindBy(xpath = "//input[@value='1']")
public WebElement defaultPageDisplay;

@FindBy(xpath = "//button[text()=25]")
public WebElement viewPerPage;



    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();

    }

    public boolean dynamicLogin(String userType){

        userType = userType.replace(" ","_");
        //userType = "sales_manager"
        //userType = "store_manager"
        //userType = "driver"

        String username = ConfigurationReader.getProperty(userType + "_username");
        //username = "sales_manager_username"
        //username = "store_manager_username"
        //username = "driver_username"

        String password = ConfigurationReader.getProperty(userType + "_password");
        //password = "sales_manager_password"
        //password = "store_manager_password"
        //password = "driver_password"

        login(username, password);


        return false;
    }

    public void hoverOverFleet() {
        US11_VehicleOdometerPage US11_VehicleOdometerPage = new US11_VehicleOdometerPage();
        BrowserUtils.sleep(4);
        BrowserUtils.hover(US11_VehicleOdometerPage.fleetHover);
        }

    public void vehicleOdometerClick(){
        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(4);
        actions.moveToElement(vehicleOdometerClick).perform();
        vehicleOdometerClick.click();
    }

    }