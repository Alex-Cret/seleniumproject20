package com.cybertek.tests.day2_locators_getText_gerAtribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekURLVerification {


    public static void main(String[] args) {

        //TC #2: Cybertek verifications
        //1. Open Chrome browser

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();
        //2. Go to http://practice.cybertekschool.com
        driver.get("http://practice.cybertekschool.com");
        driver.manage().window().maximize();// maximize the newly opened browser

        //3. Verify URL contains
        //Expected: cybertekschool
        String expectedInUrl="cybertekschool";
        String actualUrl= driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl)){
            System.out.println("Url Verification Passed!");

        }else{
            System.out.println("Url Verification Failed!");
        }
        //4. Verify title:
        //Expected: Practice
if (driver.getTitle().equals("Practice")){
    System.out.println("Title verification Passed!");
}else {
    System.out.println("Title verification Failed!");
}

driver.close();

    }
}
