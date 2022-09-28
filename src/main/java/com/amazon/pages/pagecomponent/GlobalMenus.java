package com.amazon.pages.pagecomponent;

import com.amazon.enums.WaitType;
import com.amazon.pages.BasePage;
import com.amazon.pages.sidebar.AllMenu;
import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GlobalMenus extends BasePage {

    @FindBy(id="nav-hamburger-menu")
    private WebElement hamburgerMenu;

    public AllMenu hamburgerMenu(){
        SeleniumUtils.click(hamburgerMenu, WaitType.CLICKABLE);
        return new AllMenu();
    }
}
