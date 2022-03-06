import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.net.URL;

public class TableTest {

  WebDriver wd;
  @Test
    public void Tablessc(){

      wd = new ChromeDriver();
    wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
      wd.manage().window().maximize();



  }
  @Test
   public void Homework(){

    wd = new ChromeDriver();
     wd.navigate().to("file:///Users/yanarieznik/Desktop/index.html");
     wd.manage().window().maximize();

      WebElement item1 = wd.findElement(By.cssSelector("[href='#item1']"));
      WebElement item2 = wd.findElement(By.cssSelector("[href='#item2']"));
      WebElement item3 = wd.findElement(By.cssSelector("[href='#item3']"));
    // WebElement item4 = wd.findElement(By.cssSelector("#nav ul li:last-child"));
      WebElement item4 = wd.findElement(By.cssSelector("[href='#item4']"));
      WebElement inputName =wd.findElement(By.cssSelector("[placeholder='Type your name']"));
      WebElement inputName2 =wd.findElement(By.cssSelector("[name='surename']"));
    //  WebElement but = wd.findElement(By.ByCssSelector("[.'btn']"));









  }




}
