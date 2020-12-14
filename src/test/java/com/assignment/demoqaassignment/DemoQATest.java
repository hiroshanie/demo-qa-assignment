package com.assignment.demoqaassignment;

import com.assignment.demoqaassignment.util.PropertyFileReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DemoQATest {

    PropertyFileReader prop= new PropertyFileReader();
    String chromePath=prop.getProperty("config","chrome.path");
    String url=prop.getProperty("config","url");

    @Test
    public void testLoginSuccess() throws Exception {
        System.setProperty("webdriver.chrome.driver",chromePath );
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[6]")).click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Git");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/span[1]/*[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='newUser']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Hiro2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Ekanayaka");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Hiro2");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Hiro21@");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[@id='register']")).click();
    }
}
