
package quadiontech.Tests;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import quadiontech.Pages.BasePage;
import quadiontech.Pages.GestionarReintegrosPage;
import quadiontech.Pages.LoginPage;
import java.io.File;
import java.io.IOException;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class ConsultaMedicaTest extends BasePage {


    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        abrir();

    }


    @Test (priority = 1, groups = {"reintegros"})
    public void ConsultaMedica() throws InterruptedException, IOException {
        WebDriverWait wait = new WebDriverWait(driver, 30);

        LoginPage user = new LoginPage();
        user.LoginReintegros(driver, GestionarReintegrosPage.Usuario);


        WebElement Reintegros = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.SolicitarReintegro)); //GestionarReintegrosPage.SolicitarReintegro
        Reintegros.click();
        WebElement ComboBoxSocios = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.SeleccioneSocio));
        ComboBoxSocios.click();
        WebElement ElegirSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Socio));
        ElegirSocio.click();
        WebElement Practicas = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.ComboBoxLocator));
        Practicas.click();
        Thread.sleep(2000);
        WebElement PracticaconsulMedica = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.PracticaLocator));
        PracticaconsulMedica.click();
        WebElement Cuit = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.NroCuit));
        Cuit.sendKeys("27282275371");
        WebElement ListDni = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TiposDocumento));
        ListDni.click();
        WebElement DniSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Dni));
        DniSocio.click();
        WebElement NroDeDni = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.NroDni));
        NroDeDni.sendKeys("26932760");
        WebElement TipoComprobante = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.SeleccComprobante));
        TipoComprobante.click();
        WebElement ComprobSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.ComprobanteC));
        ComprobSocio.click();
        WebElement PuntoVta = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TextPtoVta));
        PuntoVta.sendKeys("2");
        WebElement NroComprobante = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TextNroComp));
        NroComprobante.sendKeys("72");
        WebElement InputFechaEmision = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.FechaEmision));
        InputFechaEmision.sendKeys("07/02/2020");
        WebElement NroCAE = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Cae));
        NroCAE.sendKeys("70071032902611");
        WebElement InputFechaVencim = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.FechaVencim));
        InputFechaVencim.sendKeys("17/02/2020");
        Thread.sleep(10);
        WebElement DespejarCampo = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Campo));
        DespejarCampo.click();
        WebElement Importe = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TextBoxImporte));
        Importe.sendKeys("1000");
        WebElement AdjuntarComp = wait.until(presenceOfElementLocated(GestionarReintegrosPage.AdjComprobante));
        AdjuntarComp.sendKeys("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\Adjuntos\\TestOsde.pdf");
        WebElement TerminosCondic = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.BoxTyC));
        TerminosCondic.click();
        WebElement BotonEnviar = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.EnviarReintegro));
        BotonEnviar.click();
        Thread.sleep(8000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");
        //Screenshot
        Thread.sleep(4000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\ConsultaMedica.png");
        FileUtils.copyFile(scrFile, screenshotFile);

        WebElement BtnVolverInicio = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.VolverInicio));
        BtnVolverInicio.click();
        WebElement btnCerrarSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.CerrarSesion));
        btnCerrarSesion.click();

    }


    @AfterMethod(alwaysRun = true)
    public void close() {
        CerrarBrowser();
    }

}
