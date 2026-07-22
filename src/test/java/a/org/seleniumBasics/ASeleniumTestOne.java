package a.org.seleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ASeleniumTestOne {
    @Test
    public void launchDifferentBrowsers()
    {
/*
        Open All Browsers and closed the same
         */

        System.out.println("1. Launch Google Chrome Browser Through Selenium");
        WebDriver googleChromeWebDriver = new ChromeDriver();
        googleChromeWebDriver.get("https://www.amazon.in/ref=nav_logo");
        System.out.println("Launched Google Chrome Browser Through Selenium Successfully");
        googleChromeWebDriver.quit();
        System.out.println("Closed Google Chrome Browser Through Selenium Successfully");


        System.out.println("2. Launch Firefox Browser Through Selenium");
        WebDriver firefoxWebDriver = new FirefoxDriver();
        firefoxWebDriver.get("https://www.amazon.in/ref=nav_logo");
        System.out.println("Launched Firefox Browser Through Selenium Successfully");
        firefoxWebDriver.quit();
        System.out.println("Closed Firefox Browser Through Selenium Successfully");




        System.out.println("3. Launch Edge Browser Through Selenium");
        WebDriver edgeWebDriver = new EdgeDriver();
        edgeWebDriver.get("https://www.amazon.in/ref=nav_logo");
        System.out.println("Launched Edge Browser Through Selenium Successfully");
        edgeWebDriver.quit();
        System.out.println("Closed Edge Browser Through Selenium Successfully");

    }

}
