import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class Index {

    WebDriver wd;


    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/marii/Downloads/21.index.html");
    }

    @Test
    public void cssLocators() {
        //by tagName
        WebElement el = wd.findElement(By.tagName("button"));
        WebElement input = wd.findElement(By.tagName("input"));
        List<WebElement> list = wd.findElements(By.tagName("input"));
    }


}
