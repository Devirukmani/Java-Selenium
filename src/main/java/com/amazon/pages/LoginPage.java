package com.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(xpath = "//input[@type='email']")
        private WebElement txtEmail;
    @FindBy(xpath = "//input[@id='continue']")
        private WebElement btnContinue;
    @FindBy(xpath = "//input[@type='password']")
        private WebElement txtPassword;
    @FindBy(xpath = "//input[@id='signInSubmit']")
        private WebElement btnSignIn;


    public void login(String email, String password){
        this.txtEmail.sendKeys(email);
        btnContinue.click();
        this.txtPassword.sendKeys(password);
        btnSignIn.click();
    }

}
