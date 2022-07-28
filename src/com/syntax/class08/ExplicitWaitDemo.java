package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {
    public static String url = "http://syntaxprojects.com/dynamic-data-loading-demo.php";

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        WebElement getNewUserButton = driver.findElement(By.id("save"));
        getNewUserButton.click();

        // We import WebDriverWait class;  we have to pass parameters driver and amount of time to wait
        WebDriverWait wait = new WebDriverWait(driver, 20);
        // now we use the Object wait with method .until ()
        // in the method until() we pass ExpectedConditions
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(), 'First Name :')]")));

        // we want to retrieve any name that appears: we have to do it by contains First Name, because the name changes
        WebElement firstName = driver.findElement(By.xpath("//p[contains(text(), 'First Name :')]"));
        System.out.println(firstName.getText());

    }
}
