package com.Homework.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1HW1 {
    public static void main(String[] args) {

        // 1. launch the browser
        // 2. navigate to amazon web site
        // 3. print out the title and the url in the console
        // 4. close the browser

        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://www.amazon.com");
        String title= driver.getTitle();
        String url=driver.getCurrentUrl();
        System.out.println(title);
        System.out.println(url);
        driver.quit();
    }
}
