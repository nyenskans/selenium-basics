package javaTPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com");
    WebElement email= driver.findElement(By.id("email"));
    email.sendKeys("loki@gmail.com");
    WebElement password= driver.findElement(By.id("pass"));
    password.sendKeys("Lokac kokac");

        driver.findElement(By.name("login")).click();

    }
}
