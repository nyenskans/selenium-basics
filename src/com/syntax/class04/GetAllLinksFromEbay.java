package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class GetAllLinksFromEbay {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");

        WebDriver driver=new ChromeDriver();
        driver.get("https://www.ebay.com/");

        List<WebElement> allLinks=driver.findElements(By.tagName("a"));
        System.out.println("Number of links "+allLinks.size());

        for(WebElement link:allLinks) {
            String linkText = link.getText();

            String fullLink=link.getAttribute("href");

            if (!linkText.isEmpty()) {                // some of the links don't have text
                System.out.println(linkText+"    "+fullLink);
            }
        }




    }
}
