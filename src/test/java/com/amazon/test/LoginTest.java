package com.amazon.test;

import com.amazon.pages.pagecomponent.TopMenu;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

    @Test
    public void test(){
        TopMenu topMenu = new TopMenu();
        topMenu.clickSignIn();
    }
}
