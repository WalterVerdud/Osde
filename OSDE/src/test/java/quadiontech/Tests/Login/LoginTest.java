package quadiontech.Tests.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import quadiontech.Pages.AutorizacionesPage;
import quadiontech.Pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    WebDriver driver;


    //@BeforeTest
    @Test
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","src/main/resources/Driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        //Login provisorio de IDM
        driver.get("https://testosde.osde.ar/authswitch.asp?key=CL0UD2020");
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.id("proceed-link")).click();
        driver.navigate().refresh();
        //Login clasico
        driver.get("https://testosde.osde.ar/index.html#!homepage.html");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );
        //verifica que esta en la Web de OSDE
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"headerHome\"]/div/div/a")).getText().contains("OSDE"));

    }
    
}
