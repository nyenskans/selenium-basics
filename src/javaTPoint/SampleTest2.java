package javaTPoint;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleTest2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.google.com");

        //// System Property for Gecko Driver
        //System.setProperty("webdriver.gecko.driver","D:\\GeckoDriver\\geckodriver.exe" );
        //
        //// Initialize Gecko Driver using Desired Capabilities Class
        //DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        //capabilities.setCapability("marionette",true);
        //WebDriver driver= new FirefoxDriver(capabilities);
        driver.findElement(By.id("gbqfbb")).click();
        Thread.sleep(3000);

        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().to("https://www.google.com");

        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.quit();
    }
}
