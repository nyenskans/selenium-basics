package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http:/syntaxprojects.com/index.php");

       WebElement startPractisingButton= driver.findElement(By.cssSelector("a#btn_basic_example"));
        startPractisingButton.click();

        Thread.sleep(2000);
        ////a[text()='Simple Form Demo'] we cant do it since it's not unique, instead were going with parent:
        // //div[@class='list-group'] parent is also not unique
        // so now we have to go by preceding sibling

      WebElement simpleFormDemo = driver.findElement(By.xpath("//a[text()='Check Box Demo'] /preceding-sibling::a"));
      simpleFormDemo.click();

        Thread.sleep(2000);


        WebElement textBox= driver.findElement(By.cssSelector("input[placeholder^='Please']"));
      textBox.sendKeys("Loki je biba");

      WebElement showMessageButton=driver.findElement(By.cssSelector("button[onclick*='show']"));
      showMessageButton.click();

        Thread.sleep(8000); // the execution was unsuccessful before this because Selenium was trying to execute the code
            //before the page was loaded

        driver.quit();
    }

}
