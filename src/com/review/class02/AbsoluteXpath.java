package com.review.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.guru99.com/insurance/v1/register.php");
        // access textbox surname using absolute xpath
        WebElement surname=driver.findElement(By.xpath("/html/body/div[3]/form/div[2]/div[1]/input"));
        surname.sendKeys("susic");

        driver.quit();
    }
}
