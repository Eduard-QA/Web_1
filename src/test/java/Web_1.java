import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Web_1 {
    WebDriver wd;

    @BeforeMethod
    public void precondition() {
        wd = new ChromeDriver();
        wd.navigate().to("https://trello.com/");
        wd.manage().window().maximize();
    }
    @Test
    public void arealTest() {
        //[aria-label='Trello']
        WebElement log11 = wd.findElement(By.cssSelector("[aria-label='Trello']"));
        WebElement log121 = wd.findElement(By.cssSelector("[aria-label $='llo']"));//ends
        WebElement log31 = wd.findElement(By.cssSelector("[aria-label ^='Tr']"));//starts
        WebElement log41 = wd.findElement(By.cssSelector("[aria-label *='rell']"));//contains

    }
    @Test
    public void command() throws InterruptedException {
        wd.findElement(By.cssSelector("[href = '/login']")).click();
        List<WebElement> el1 = wd.findElements(By.tagName("div"));
        System.out.println(" Numbers attributes div = " + el1.size());
        WebElement el2 = wd.findElement(By.tagName("a"));
        WebElement el3 = wd.findElement(By.id("user"));
        WebElement el4 = wd.findElement(By.className("inner-section"));
        WebElement el5 = wd.findElement(By.linkText("Privacy Policy"));
        System.out.println(el5.getText());

        // css
        WebElement el1css = wd.findElement(By.cssSelector("#user"));
        WebElement el2css = wd.findElement(By.cssSelector("#user.form-field"));
        el2css.click();
        el2css.clear();
        el2css.sendKeys("eduard.mickel@gmail.com");
        System.out.println(el2css.getText());//check why the command is not running
        //WebElement el3css = wd.findElement(By.cssSelector("[data-testid='header-member-menu-button']"));//can't find element

        //login
        WebElement log1 = wd.findElement(By.cssSelector("[href='/login']"));
        WebElement log2 = wd.findElement(By.cssSelector("#user"));
        WebElement log3 = wd.findElement(By.cssSelector("#login"));
        WebElement log4 = wd.findElement(By.cssSelector("#password"));
        wd.findElement(By.cssSelector("#login.button.account-button.button-green.btn.btn-success")).click();
        Thread.sleep(2000);
        WebElement log5 = wd.findElement(By.cssSelector("#login-submit")); //after entering the correct mail

    }
    @AfterMethod
    public void finish() {
         wd.quit();
    }
}




