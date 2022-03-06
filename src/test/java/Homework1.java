import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Homework1 {
    WebDriver wd;
    @Test
    public void home() {
        wd = new ChromeDriver();
        wd.navigate().to("https://contacts-app.tobbymarshall815.vercel.app/login");
        wd.manage().window().maximize();

       WebElement elm1= wd.findElement(By.tagName("body"));
       WebElement elm2= wd.findElement(By.tagName("div"));
       WebElement elm3 =  wd.findElement(By.id("root"));
       WebElement elm4 = wd.findElement(By.className("container"));




    }
}
