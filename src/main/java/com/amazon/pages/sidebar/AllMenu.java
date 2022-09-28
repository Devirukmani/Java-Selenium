package com.amazon.pages.sidebar;

import com.amazon.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllMenu extends BasePage {

    @FindBy(xpath = "//div[normalize-space()='TV, Appliances, Electronics']")
    private WebElement clkAppliancesElectronics;

    public AppliancesElectronicsMenu clickAppliancesElectronics(){
        this.clkAppliancesElectronics.click();
        return new AppliancesElectronicsMenu();
    }
}
