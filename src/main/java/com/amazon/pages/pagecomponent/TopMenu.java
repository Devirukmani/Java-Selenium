package com.amazon.pages.pagecomponent;

import com.amazon.pages.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class TopMenu extends BasePage {

    @FindBy(id="nav-link-accountList")
        private WebElement btnSignIn;

    public void clickSignIn(){
        btnSignIn.click();
    }

}
