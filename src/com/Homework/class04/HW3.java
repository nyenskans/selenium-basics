package com.Homework.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3 {
    public static void main(String[] args) throws InterruptedException {
        //HRMS Application Negative Login:
        //Open chrome browser
        //Go to "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login"
        //Enter valid username
        //Leave password field empty
        //Click on login button
        //Verify error message with text "Password cannot be empty" is displayed.
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Tester");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        Thread.sleep(1500);
        String message=driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
        String expectedMessage = "Password cannot be empty";
        if(message.equals(expectedMessage)){
            System.out.println("Error message: \"Password cannot be empty\" is the same as expected message");
        }else {
            System.out.println("Error message displayed is not the same as expected message");

        }
    }
}
