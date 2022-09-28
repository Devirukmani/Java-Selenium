package com.amazon.pages;

import com.amazon.driver.DriverManager;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class BasePage {

    public BasePage(){
        PageFactory.initElements(DriverManager.getDriver(), this);
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
}
