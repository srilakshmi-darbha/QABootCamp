package com.qabootcamp.driver;

import com.qabootcamp.constants.FrameworkConstants;
import config.ReadPropertyFile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    public static WebDriver driver;

    public static void initDriver() throws Exception {
        // Creating only one instance across all tests
        if(driver==null) {
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getDriverPath());
            driver = new ChromeDriver();
            driver.get(ReadPropertyFile.getProperty("url"));
        }
    }

    public static void quitDriver()
    {
        if(driver!=null) {
            driver.quit();
            driver=null;
        }
    }
}
