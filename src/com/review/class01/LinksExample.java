package com.review.class01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinksExample {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://syntaxprojects.com");

        // get all the links from the website

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        //in this case we have to make a loop to print all the links
        for(WebElement link:allLinks){
            String text=link.getText();
            System.out.println(text);

        }

    }
}