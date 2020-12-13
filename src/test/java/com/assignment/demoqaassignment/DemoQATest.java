package com.assignment.demoqaassignment;


import com.assignment.demoqaassignment.util.PropertyFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoQATest {

    PropertyFileReader prop= new PropertyFileReader();
    String chromePath=prop.getProperty("config","chrome.path");
    String url=prop.getProperty("config","url");

    @Test
    public void testLoginSuccess(){
        System.setProperty("webdriver.chrome.driver",chromePath );
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }
}
