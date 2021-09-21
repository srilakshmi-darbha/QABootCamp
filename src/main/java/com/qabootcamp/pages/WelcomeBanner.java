package com.qabootcamp.pages;

import com.qabootcamp.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WelcomeBanner extends BasePage{
    private WebDriver driver;

    @FindBy(xpath = "(//button[contains(@aria-label, 'Close Welcome Banner')])[1]")
    private WebElement dismissBtn;


    public WelcomeBanner(){
        super();
        driver = BasePage.getDriver();
        driver.getTitle();
    }



    public void clickOnDismiss(){
        this.dismissBtn.click();
    }
}
