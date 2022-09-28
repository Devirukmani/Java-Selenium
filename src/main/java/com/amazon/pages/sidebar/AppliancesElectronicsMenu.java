package com.amazon.pages.sidebar;

import com.amazon.pages.BasePage;
import com.amazon.pages.TelevisionsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppliancesElectronicsMenu extends BasePage {

    @FindBy(xpath = "//a[@class='hmenu-item'][normalize-space()='Televisions']")
        private WebElement clkTelevisions;

    public TelevisionsPage clickTelevisions(){
        this.clkTelevisions.click();
        return new TelevisionsPage();
    }
}
