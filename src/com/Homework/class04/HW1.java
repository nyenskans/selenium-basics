package com.Homework.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1 {
    //	Task
    //Open Chrome browser
    //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
    //Enter valid username and password (username - Admin, password - Hum@nhrm123)
    //Click on login button
    //Then verify Syntax Logo is displayed.
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        WebElement username=driver.findElement(By.xpath("//span[text()='Username']/preceding-sibling::input"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.xpath("//span[text()='Password']/preceding-sibling::input"));
        password.sendKeys("Hum@nhrm123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='Submit']")).click();
        WebElement syntaxLogo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
        System.out.println(syntaxLogo.isDisplayed());
        driver.quit();



    }
}
