import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Web_Xpath2 {
    WebDriver wd;

    @BeforeMethod
    public void start() {
        wd = new ChromeDriver();
        wd.navigate().to("file:///C:/Users/eduar/Downloads/index.html");
        wd.manage().window().maximize();
    }

    @Test
    public void tableTest() {

       // List<WebElement> rows = wd.findElements(By.cssSelector("tr"));
        List<WebElement> rows = wd.findElements(By.xpath("//tr"));
        Assert.assertEquals(rows.size(), 4);

        //WebElement lastRow = wd.findElement(By.cssSelector("tr:last-child"));
        WebElement lastRow = wd.findElement(By.xpath("//tr[last()]"));
        String text = lastRow.getText();
        System.out.println(text);

        Assert.assertTrue(text.contains("Mexico"));

        //WebElement lastCell = wd.findElement(By.cssSelector("tr:last-child td:last-child"));
        WebElement lastCell = wd.findElement(By.xpath("//tr[last()]//td[last()]"));
        String str = lastCell.getText();
        boolean res = str.contains("Mexico");
        Assert.assertTrue(str.contains("Mexico"));
        Assert.assertTrue(res);


    }

}
