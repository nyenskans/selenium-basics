package javaTPoint;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Introduction {
    public static void main(String[] args) {
        // First, we invoke a Browser
        // Chrome--> ChromeDriver--> it's own Methods
        // Firefox--> FirefoxDriver--> it's own methods
        // ChromeDriver driver=new ChromeDriver(); --> it might not work for other drivers because now driver has access to
        // Chrome specific methods

        WebDriver driver=new ChromeDriver();
        // This is how we restrict the Chrome driver to only use WebDriver method implementations
    }
}
