import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class TableTest {

    WebDriver wd;

    @Test
    public void Tablessc() {

        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
        wd.manage().window().maximize();


    }

    @Test
    public void Homework() {

        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/yanarieznik/Desktop/index.html");
        wd.manage().window().maximize();

        WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
        WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
        WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
        WebElement item5 = wd.findElement(By.cssSelector("#nav ul li:last-child"));
        WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
        WebElement inputName = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement inputName2 = wd.findElement(By.cssSelector("[name='surename']"));
        WebElement but = wd.findElement(By.cssSelector(".btn"));
        WebElement table1 = wd.findElement(By.cssSelector("#country-table tr td:first-child"));
        WebElement table2 = wd.findElement(By.cssSelector("#country-table tr td:nth-child(1)"));
        WebElement table3 = wd.findElement(By.cssSelector("#country-table tr td:last-child"));
        WebElement red = wd.findElement(By.cssSelector("#alert"));


    }

    @Test
    public void xPathTests() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///Users/yanarieznik/Desktop/index.html");
        wd.manage().window().maximize();
          WebElement item1 = wd.findElement(By.xpath("//a[@href ='#item1']"));
          String textItem1 = item1.getText();
        System.out.println("text of element item1"+textItem1);
        Assert.assertEquals(textItem1,"Item 1");

        WebElement item2 = wd.findElement(By.xpath("//a[@href ='#item2']"));
        String textItem2 = item2.getText();
        Assert.assertEquals(textItem2,"Item 2");

        WebElement item3 = wd.findElement(By.xpath("//a[@href ='#item3']"));
        String textItem3 = item3.getText();
        Assert.assertEquals(textItem3,"Item 3");

        WebElement buttonSend = wd.findElement(By.xpath("//*[@class='btn']"));
        String textSend = buttonSend.getText();
        Assert.assertEquals(textSend,"Send");



        WebElement europe = wd.findElement(By.xpath("//*[text()='Europe']"));
        String textEurope = europe.getText();
        Assert.assertEquals(textEurope, "Europe");

        WebElement asia = wd.findElement(By.xpath("//*[text()='Asia']"));
        String textAsia = europe.getText();
        Assert.assertEquals(textAsia, "Asia");















      //  item1.click();
       // WebElement message = wd.findElement(By.xpath("//p[@class='message']"));
       // String textMessage = message.getText();
       // Assert.assertEquals(textMessage,"Clicked by Item1");








    }
}