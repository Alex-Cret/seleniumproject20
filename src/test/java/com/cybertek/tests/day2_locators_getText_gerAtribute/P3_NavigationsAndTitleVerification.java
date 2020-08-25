package com.cybertek.tests.day2_locators_getText_gerAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationsAndTitleVerification {

    public static void main(String[] args) {
//TC #3: Back and forth navigation
//1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

//2 - GO to: https://google.com
        driver.get("https://google.com");

//3-click to Gmail from top right
        driver.findElement(By.linkText("Gmail")).click();

//4-verify title contains
//Expected: Gmail

        String expectedInTitle="Gmail";
        String actualTitle=driver.getTitle();

        if (actualTitle.contains(expectedInTitle)){
            System.out.println("Gmail title verification Passed!");
        }else {
            System.out.println("Gmail title verification Failed!");
        }
//5-GO back to Google by using the. Back()

        driver.navigate().back();
//6- Verify title equals:
//Expected: Google\

        String expectedGoogleTitle="Google";
        String actualGoogleTitle= driver.getTitle();
        if(actualGoogleTitle.equals(expectedGoogleTitle)){
            System.out.println("Google title verification Passed!");
        }else{
            System.out.println(("Google title verification Failed! "));
        }


driver.close();

    }

}
