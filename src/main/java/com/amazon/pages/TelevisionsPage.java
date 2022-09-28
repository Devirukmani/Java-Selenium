package com.amazon.pages;

import com.amazon.utils.SeleniumUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TelevisionsPage extends BasePage {

    @FindBy(xpath = "//span[text()='Smart Televisions']")
    private WebElement clkSmartTelevisions;

    @FindBy(xpath = "//span[text()='MI']/preceding-sibling::div/label/i")
    private WebElement chkMiTv;

    @FindBy(xpath = "//span[@class='a-dropdown-label']")
    private WebElement ddSortBy;

    @FindBy(xpath = "//a[text()='Price: High to Low']")
    private WebElement selectHighToLow;

    @FindBy(xpath = "//div[@data-index='2']")
    private WebElement clkTv;

    @FindBy(xpath = "//div[@id='feature-bullets']/ul/li")
    private List<WebElement> productDescription;

    @FindBy(xpath = "//span[text()='OnePlus']/preceding-sibling::div/label/i")
    private WebElement chkOnePlusTv;

    ArrayList<String> tabs;

    public TelevisionsPage clickSecondHighPricedTV() {
        clkSmartTelevisions.click();
        chkMiTv.click();
        ddSortBy.click();
        selectHighToLow.click();
        clkTv.click();
        return this;
    }

    public TelevisionsPage switchTab() {
        SeleniumUtils.switchTab();
        return this;
    }

    public TelevisionsPage printProductDescription() {
        productDescription.stream().map(WebElement::getText).forEach(System.out::println);
        return this;
    }
    public void switchToParentPage(){
        SeleniumUtils.switchTab();
        chkOnePlusTv.click();
    }

}