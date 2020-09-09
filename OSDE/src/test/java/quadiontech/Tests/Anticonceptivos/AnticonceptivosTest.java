package quadiontech.Tests.Anticonceptivos;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import quadiontech.Pages.Anticonceptivos.AnticonceptivosPage;
import quadiontech.Pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class AnticonceptivosTest extends AnticonceptivosPage {
     WebDriver driver;

        By btnAdvancedLocator = By.id("details-button");
        By linkProceedLocator = By.id("proceed-link");
        LoginPage objloginpage = new LoginPage();

     @BeforeMethod(alwaysRun = true)
      public void initBrowser(){
         System.setProperty("webdriver.chrome.driver","C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\Driver\\chromedriver.exe");
         driver = new ChromeDriver();
         driver.manage().window().maximize();
         //Login provisorio de IDM
         driver.get("https://testosde.osde.ar/authswitch.asp?key=CL0UD2020");
         WebDriverWait wait = new WebDriverWait(driver,30);
         WebElement btnAdvanced = wait.until(ExpectedConditions.visibilityOfElementLocated(btnAdvancedLocator));
         btnAdvanced.click();
         WebElement linkcontinuar = wait.until(ExpectedConditions.visibilityOfElementLocated(linkProceedLocator));
         linkcontinuar.click();
         driver.navigate().refresh();
         //Login clasico
         driver.get("https://testosde.osde.ar/index.html#!homepage.html");
      }

      @Test (priority = 1, groups = {"Anticonceptivos"})
      public void empadronamientoAnticonceptivoTest() throws InterruptedException, IOException {
          WebDriverWait wait = new WebDriverWait(driver, 20);
          LoginPage user = new LoginPage();
          user.LoginAnticonceptivos(driver, Usuario);

          WebElement empdronamiento = wait.until(ExpectedConditions.visibilityOfElementLocated(Anticonceptivos));
          empdronamiento.click();
          WebElement listSocias = wait.until(ExpectedConditions.visibilityOfElementLocated(ContainerSocias));
          listSocias.click();
          WebElement sociaEmpad = wait.until(ExpectedConditions.visibilityOfElementLocated(SociaEmpadronada));
          sociaEmpad.click();
          WebElement enviarBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(btnEnviar));
          enviarBtn.click();
          Thread.sleep(8000);
          JavascriptExecutor jse = (JavascriptExecutor)driver;
          jse.executeScript("scroll(0, -250);");

          Thread.sleep(4000);
          File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\Empadronamiento.png");
          FileUtils.copyFile(scrFile, screenshotFile);
      }

      @AfterMethod(alwaysRun = true)
      public void CerrarBrowser(){
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement BtnVolverInicio = wait.until(ExpectedConditions.visibilityOfElementLocated(VolverInicio));
        BtnVolverInicio.click();
        WebElement btnCerrarSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(CerrarSesion));
        btnCerrarSesion.click();
        driver.close();
        driver.quit();
      }
 }

