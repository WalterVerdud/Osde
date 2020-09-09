package quadiontech.Tests.Pagos;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.*;
import quadiontech.Pages.LoginPage;
import quadiontech.Pages.Pagos.PagosPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

public class PagosTest extends PagosPage {
    WebDriver driver;
    String downloadFilePath = "C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\main\\resources\\ComprobantesPagos";

    @BeforeMethod(alwaysRun = true)
    public void initBrowser(){

        By btnAdvancedLocator = By.id("details-button");
        By linkProceedLocator = By.id("proceed-link");
        LoginPage objloginPage = new LoginPage();

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
        Reporter.log("Ingreso a la web de OSDE");

    }

    @Test (priority = 1, groups = {"Pagos"})
    public void PagarCuotaOsde() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        LoginPage user = new LoginPage();
        user.LoginPagos(driver, Usuario3);

        WebElement pagar = wait.until(ExpectedConditions.visibilityOfElementLocated(RealizarPagos));
        pagar.click();
        WebElement cuota = wait.until(ExpectedConditions.visibilityOfElementLocated(CheckBoxPago));
        cuota.click();
        WebElement TyC = wait.until(ExpectedConditions.visibilityOfElementLocated(checkTyC));
        TyC.click();
        WebElement pago = wait.until(ExpectedConditions.visibilityOfElementLocated(BtnPagar));
        pago.click();
        WebElement tarjeta = wait.until(ExpectedConditions.visibilityOfElementLocated(TarjDebito));
        tarjeta.click();
        WebElement btnsgte = wait.until(ExpectedConditions.visibilityOfElementLocated(BtnSiguiente));
        btnsgte.click();

        //Datos visa debito
        WebElement tarjVisaDebito = wait.until(ExpectedConditions.visibilityOfElementLocated(VisaDebito));
        tarjVisaDebito.click();
        WebElement TarjetaNro = wait.until(ExpectedConditions.visibilityOfElementLocated(NroTarjeta));
        TarjetaNro.sendKeys("4517 7210 0485 6075");
        WebElement DatosSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(NombreApellido));
        DatosSocio.sendKeys("John Doe");
        WebElement FechaTarjeta = wait.until(ExpectedConditions.visibilityOfElementLocated(FechaExpira));
        FechaTarjeta.sendKeys("09/20");
        WebElement NroSeguridad = wait.until(ExpectedConditions.visibilityOfElementLocated(CodSeguridad));
        NroSeguridad.sendKeys("123");
        WebElement Dni = wait.until(ExpectedConditions.visibilityOfElementLocated(NroDni));
        Dni.sendKeys("25123456");
        WebElement btnsigte = wait.until(ExpectedConditions.visibilityOfElementLocated(Siguientebtn));
        btnsigte.click();

        //Pagina confirmacion

        WebElement EnviarMail = wait.until(ExpectedConditions.visibilityOfElementLocated(checkMail));
        EnviarMail.click();
        WebElement ConfirmarPago = wait.until(ExpectedConditions.visibilityOfElementLocated(BtnConfirmar));
        ConfirmarPago.click();
        Thread.sleep(8000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");

        Thread.sleep(4000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\Pagos.png");
        FileUtils.copyFile(scrFile, screenshotFile);
    }


     @AfterMethod (alwaysRun = true)
    public void cerrarBrowser(){
         WebDriverWait wait = new WebDriverWait(driver, 30);
         WebElement btnCerrarSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(CerrarSesion));
         btnCerrarSesion.click();
         driver.close();
         driver.quit();
    }

}
