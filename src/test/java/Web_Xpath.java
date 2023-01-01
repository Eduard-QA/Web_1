import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Web_Xpath {
    WebDriver wd;
    @BeforeMethod
    public void precondition (){
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
    }
    @Test
    public void findElements (){
        wd.findElement(By.xpath("//*[@id = 'user']"));
        wd.findElement(By.xpath("//*[@class = 'username']"));
        wd.findElement(By.xpath("//*[@data-testid='header-member-menu-button']"));

        wd.findElement(By.xpath("//*[@href = 'login']"));


    }
    @Test
    public void Trello1() {
        WebElement loginButton = wd.findElement(By.cssSelector("[href='/login']"));
        loginButton.click();

    }
}
