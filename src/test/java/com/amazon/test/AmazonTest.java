package com.amazon.test;

import com.amazon.pages.pagecomponent.GlobalMenus;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{

    @Test(description = "Print text from Second high-priced TV of MI")
    public void tv(){
        GlobalMenus menus = new GlobalMenus();
        menus.hamburgerMenu().clickAppliancesElectronics().clickTelevisions()
                .clickSecondHighPricedTV()
                .switchTab()
                .printProductDescription().switchToParentPage();
    }
}
