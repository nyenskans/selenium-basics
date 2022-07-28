package javaTPoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.SQLOutput;

public class SampleTest1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        String title=driver.getTitle();
        int titleLength=title.length();

        System.out.println(title);
        System.out.println(titleLength);
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl="https://www.google.co.in/";

        if(actualUrl.equals(expectedUrl)){
            System.out.println("This is the desired web page");
        }else{
            System.out.println("This is not the desired web page");
        }

        String pageSource=driver.getPageSource();
        int pageSourceLength=pageSource.length();
        System.out.println(pageSourceLength);

        driver.quit();
    }
}
