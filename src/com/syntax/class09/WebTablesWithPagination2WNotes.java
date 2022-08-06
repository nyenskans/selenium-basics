package com.syntax.class09;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class WebTablesWithPagination2WNotes {
    public static String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/katarinasusic/IdeaProjects/SeleniumBasics/drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // Task : Log in, click on PIM and add Employee to the database

        WebElement username = driver.findElement(By.id("txtUsername"));
        username.sendKeys("Admin");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("Hum@nhrm123");
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        loginButton.click();
        WebElement pimButton = driver.findElement(By.id("menu_pim_viewPimModule"));
        pimButton.click();
        WebElement addEmployeeButton = driver.findElement(By.id("menu_pim_addEmployee"));
        addEmployeeButton.click();
        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Test");
        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Test");

        // The new employee has a unique ID--> we can use it to find our new employee we made in the table
        // it is stored in the attribute value
        WebElement employeeIDField = driver.findElement(By.id("employeeId"));
        String employeeID = employeeIDField.getAttribute("value");

        // click on save
        WebElement saveButton = driver.findElement(By.id("btnSave"));
        saveButton.click();

        // go to employee list (table)
        WebElement employeeListButton = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        employeeListButton.click();

        // Task: go to employee list, delete the Employee we created (by it's ID--> it's always unique)
        // 1. identify the table, get all the rows and store them in a list:
        List<WebElement> tableRowsList = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));

        // 2. locate the next button (because our person might not be on the first page, so we might have to click next later on)
     //   WebElement nextButton = driver.findElement(By.linkText("Next"));

        // 3. iterate through the rows: we need 2 loops - 1 for rows and 1 for clicking the next button:

        boolean employeeNotFound = true;
        while (employeeNotFound) {
            List<WebElement> tableRows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
            for (int i = 0; i < tableRows.size(); i++) { // we start from 0 because the header is not included here, we are in the body
                String rowText = tableRows.get(i).getText(); // get the text of the current row
                if (rowText.contains(employeeID)) { // if the text is equal to employeeID we found earlier:
                    employeeNotFound = false; // employee is found and only now do we click on the checkbox:
                    // we have to store all the checkboxes in a list to check the one that corresponds to the desired employee:
                    // this xpath gets us first column in all the rows:
                    //     List<WebElement> checkboxes = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
                    //                                                         // we add i into the x path, because we are iterating through the rows

                    //Instead of using the list we can find only one checkbox with dynamic location by adding i to the xpath:
                    WebElement checkbox = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]td[1]"));
                    checkbox.click();

                    // 4. delete the person we just created:
                    WebElement deleteButton = driver.findElement(By.id("btnDelete"));
                    deleteButton.click();
                    WebElement confirmDelete = driver.findElement(By.id("dialogDeleteBtn"));
                    confirmDelete.click();
                    break;
                }
            }

            if (employeeNotFound) {
                WebElement nextButton = driver.findElement(By.linkText("Next")); // reinitialize the nextButton too because the page gets refreshed
                nextButton.click();
            }
        }
        // !!!
        // in this page, when we click the next button, the page gets refreshed
        // so, we have to identify the elements again -- we add code at line 61 (so every time it loops it will get new refreshed elements)
        // we reinitialize the List of tableRows each time from line 52 at line 61
    }
}
