package com.amazon.test;

import com.amazon.driver.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    @BeforeMethod
    public void setUp(){
        Driver.initDriver();
    }
    @AfterMethod
    public void tearDown(){
        Driver.quit();
    }
}
