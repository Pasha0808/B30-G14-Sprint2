package com.cydeo.pagesB30G14;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class R_VytrackLoginPage {

    public R_VytrackLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id="prependedInput")
    public WebElement username;


    @FindBy(id="prependedInput2")
    public WebElement password;


    @FindBy(id="_submit")
    public WebElement loginBtn;


    public void login(String username,String password){
        this.username.sendKeys(username);
        this.password.sendKeys(password);
        loginBtn.click();

    }

    public void dynamicLogin(String userType){ // String userType="sales manager" is coming from parameterization

        userType = userType.replace(" ","_"); // userType = "sales_manager"
        String username = ConfigurationReader.getProperty(userType + "_username"); // username = "sales_manager_username"
        String password = ConfigurationReader.getProperty(userType + "_password"); // password = "sales_manager_password"

        login(username,password);

    }




}