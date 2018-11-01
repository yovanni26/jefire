import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
public class TestSelenium {
    private  WebDriver driver;
    @Before
    public void setup(){
        String pathToChromeDriver = "C:/webdriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
        driver = new ChromeDriver();
    }
    @After
    public void teardown(){
        driver.close();
    }
@Test
public void testOne (){
// Test code will be added here
    driver.navigate().to("http://the-internet.herokuapp.com/login");
    driver.findElement(By.id("username")).sendKeys("tomsmith");
    driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
    driver.findElement(By.className("radius")).click();
    String title = driver.findElement(By.cssSelector(".example h2")).getText();

}


}
