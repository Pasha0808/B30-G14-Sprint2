package com.cydeo.pagesB30G14;

import com.cydeo.step_definitions.R_Datatable_StepDef;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class R_DatatablePage {

    public R_DatatablePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = ".title.title-level-1")
    public List<WebElement> allTopModules;
}