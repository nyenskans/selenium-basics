package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        // we have to tell selenium which browser we'll be using

        // we need to set up the properties:
        // 1st argument is the browser-chrome:
        // 2nd argument where is chrome located
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        //this was the method for setting the property to use chrome driver


        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("http://google.com");
        String url= driver.getCurrentUrl();
        System.out.println(url);
        String title= driver.getTitle();
        System.out.println(title);
        driver.quit();
    }
}