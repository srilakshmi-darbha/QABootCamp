package com.qabootcamp.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeBanner extends BasePage{

    @FindBy(xpath = "(//button[contains(@aria-label, 'Close Welcome Banner')])[1]")
    private WebElement dismissBtn;

    public void clickOnDismiss(){
        dismissBtn.click();
    }
}
