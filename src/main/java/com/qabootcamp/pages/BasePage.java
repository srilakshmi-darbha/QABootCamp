package com.qabootcamp.pages;

import com.qabootcamp.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.print.PageFormat;

public class BasePage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    public void createDriver(){
        System.setProperty("webdriver.chrome.driver", FrameworkConstants.getDriverPath());
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, FrameworkConstants.driverWait);
    }

    public static WebDriver getDriver(){
        if(driver==null){
            new BasePage().createDriver();
        }
        return driver;
    }

}
