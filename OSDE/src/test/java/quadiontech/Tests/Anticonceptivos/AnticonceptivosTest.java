package quadiontech.Tests.Anticonceptivos;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import quadiontech.Pages.Anticonceptivos.AnticonceptivosPage;
import quadiontech.Pages.BasePage;
import quadiontech.Pages.LoginPage;
import java.io.File;
import java.io.IOException;


public class AnticonceptivosTest extends BasePage {


     @BeforeMethod(alwaysRun = true)
      public void setUp() {

         abrir();

     }


      @Test (priority = 1, groups = {"Anticonceptivos"})
      public void empadronamientoAnticonceptivoTest() throws InterruptedException, IOException {
          WebDriverWait wait = new WebDriverWait(driver, 20);
          LoginPage user = new LoginPage();
          user.LoginAnticonceptivos(driver, AnticonceptivosPage.Usuario);

          WebElement empdronamiento = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.Anticonceptivos));
          empdronamiento.click();
          WebElement listSocias = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.ContainerSocias));
          listSocias.click();
          WebElement sociaEmpad = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.SociaEmpadronada));
          sociaEmpad.click();
          WebElement enviarBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.btnEnviar));
          enviarBtn.click();
          Thread.sleep(8000);
          JavascriptExecutor jse = (JavascriptExecutor)driver;
          jse.executeScript("scroll(0, -250);");

          Thread.sleep(4000);
          File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
          File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\Empadronamiento.png");
          FileUtils.copyFile(scrFile, screenshotFile);

          WebElement BtnVolverInicio = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.VolverInicio));
          BtnVolverInicio.click();
          WebElement btnCerrarSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(AnticonceptivosPage.CerrarSesion));
          btnCerrarSesion.click();
      }

      @AfterMethod(alwaysRun = true)
      public void close(){
         CerrarBrowser();
      }
 }

