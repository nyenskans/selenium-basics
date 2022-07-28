package com.review.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdowns {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        ;
        // go to website
        driver.get("https://demoqa.com/select-menu");

        // check if the dropdown is multiselect
        WebElement multipleDD = driver.findElement(By.xpath("//select[@id='cars']"));  // we are only looking for 1 element, the path shows 1/1
        // it has select tag so we use select class
        Select select = new Select(multipleDD);
        // This is how we check if it's multiple select dropdown

        System.out.println("The dropdown is multiple select: " + select.isMultiple()); // true

        // again, we can select by index/value/visibleText:

        // select volvo by index:
        select.selectByIndex(0);

        // select Opel by visible text:
        select.selectByVisibleText("Opel");

        // select Saab by value:
        select.selectByValue("saab");

        // In multiselect dropdown we have methods to Deselect:
        select.deselectByIndex(1);
        select.deselectByVisibleText("Opel");
        select.deselectByValue("saab");
        select.deselectAll();
    }
}
