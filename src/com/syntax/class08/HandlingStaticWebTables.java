package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebTables {
    public static String url = "http://syntaxprojects.com/table-search-filter-demo.php";

    // we want to take the data from the body of the table, not the header

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        // we need an xpath that leads to the body of the table and then get the rows

        // we store the rows in a List - 7 rows:
        List<WebElement> rowData = driver.findElements(By.xpath("//table[@id = 'task-table']/tbody/tr"));
        System.out.println(rowData.size());

        // we want to get eah row and print out the text, so we use Iterator:

        Iterator<WebElement> iterator = rowData.iterator();
        while(iterator.hasNext()){
           WebElement row = iterator.next();
           String rowText = row.getText();
            System.out.println(rowText);
        }
        System.out.println("--------------------------------------------------");
        // now to print all the text out of the header:
        // we store all the columns of the header in a list:
        // we need an xpath that leads to thead and then to tr and then to th
        List<WebElement> columnData = driver.findElements(By.xpath("//table[@id='task-table']/thead/tr/th"));
        System.out.println(columnData.size());

        // this time we can use for each loop
        for (WebElement e : columnData) {
           String headerText = e.getText();
            System.out.println(headerText);
        }

        System.out.println("--------------------------------------------------");

        // to get only the second column of the table:
       List<WebElement> secondColumn = driver.findElements(By.xpath("//table[@id='task-table']/tbody/tr/td[2]"));
        for (WebElement e : secondColumn) {
            String secondColumnText = e.getText();
            System.out.println(secondColumnText);
        }

        // to print only the cell in row 1, column 3: we need to specify the tr index and also td index:
        // and this will not be a list, but a single element:
        WebElement cell = driver.findElement(By.xpath("//table[@id='task-table']/tbody/tr[1]/td[2]"));
        String cellText = cell.getText();
        System.out.println(cell);
    }
}
