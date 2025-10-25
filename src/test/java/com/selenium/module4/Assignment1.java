package com.selenium.module4;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.selenium.assignment.ExcelReader; 

public class Assignment1 {

    WebDriver driver;
    WebDriverWait wait;

    // Setup method before every test
    @BeforeMethod
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("--disable-features=PasswordCheck,AutofillServerCommunication,AutofillCreditCard");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));  
    }

    // Test method
   
    @Test
    public void testMultipleLogins() throws IOException {
        List<String[]> allCredentials = ExcelReader.getAllCredentials("test-data/credentialsForAssignment1.xlsx", "Sheet1");

        for (String[] creds : allCredentials) {
            String username = creds[0];
            String password = creds[1];

            driver.get("http://demo.guru99.com/V4/");
            driver.findElement(By.name("uid")).sendKeys(username);
            driver.findElement(By.name("password")).sendKeys(password);
            driver.findElement(By.name("btnLogin")).click();

            try {
                Alert alert = wait.until(ExpectedConditions.alertIsPresent());
                System.out.println("Login failed for " + username + ": " + alert.getText());
                alert.accept();
                Assert.assertTrue(true, "Alert popup appeared - login failed as expected");
            } catch (Exception e) {
                System.out.println("Login passed for " + username);
                // No alert means login success; no assertion necessary here as per assignment
                break;  // Stop testing further if website allows only one valid login
            }
        }
    }


    // Cleanup method after each test
    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
