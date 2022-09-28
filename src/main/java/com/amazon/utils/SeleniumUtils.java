package com.amazon.utils;

import com.amazon.driver.DriverManager;
import com.amazon.enums.WaitType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public final class SeleniumUtils {

    private SeleniumUtils(){}

    public static void click(WebElement element, WaitType waitType){
         if(waitType == WaitType.CLICKABLE){
            element = waitUntilElementToBeClickable(element);
        } else if (waitType == WaitType.VISIBLE){
            element = waitUntilElementToBeVisible(element);
        }
        element.click();
    }
    private static WebElement waitUntilElementToBeClickable(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }
    private static WebElement waitUntilElementToBeVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static void switchTab(){
        String currentWindow = DriverManager.getDriver().getWindowHandle(); //12345
        ArrayList<String> tabs = new ArrayList<>(DriverManager.getDriver().getWindowHandles()); //12345, 12346
        for (String handle : tabs) {
            if (!currentWindow.equalsIgnoreCase(handle)) {
                    DriverManager.getDriver().switchTo().window(handle);
            }
        }
    }

}
