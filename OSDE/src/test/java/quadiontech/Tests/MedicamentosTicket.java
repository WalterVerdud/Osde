package quadiontech.Tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import quadiontech.Pages.BasePage;
import quadiontech.Pages.GestionarReintegrosPage;
import quadiontech.Pages.LoginPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;

public class MedicamentosTicket extends BasePage {

    WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void initBrowser() {

        abrir();

    }

    @Test (priority = 1, groups = {"reintegros"})
    public void Medicamentos() throws InterruptedException, IOException {

        WebDriverWait wait = new WebDriverWait(driver, 40);
        LoginPage user = new LoginPage();
        user.LoginReintegros(driver, GestionarReintegrosPage.Usuario);

        WebElement getReintegros = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.SolicitarReintegro));
        getReintegros.click();
        WebElement ComboBoxSocios = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.SeleccioneSocio));
        ComboBoxSocios.click();
        WebElement ElegirSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Socio));
        ElegirSocio.click();
        WebElement Practicas = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.ComboBoxLocator));
        Practicas.click();
        WebElement TipoPractica = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.PracticaLocator7));
        TipoPractica.click();
        WebElement PedidoMedico = wait.until(presenceOfElementLocated(GestionarReintegrosPage.AdjPedidoMedico));
        PedidoMedico.sendKeys("C:/Users/Walter/IdeaProjects/OSDE/src/test/resources/Adjuntos/TestAdjuntoOsde.pdf");
        WebElement ConTicket = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.Ticket));
        ConTicket.click();
        WebElement ticketCuit = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TicketCuit));
        ticketCuit.sendKeys("27282275371");
        WebElement PuntoVta = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.PtoVentaTicket));
        PuntoVta.sendKeys("2");
        WebElement NroComprobante = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.CompNroTicket));
        NroComprobante.sendKeys("72");
        WebElement fechaTicket = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.FechaTicket));
        fechaTicket.sendKeys("07/02/2020");
        WebElement importe = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.ImporteTicket));
        importe.sendKeys("1000");
        WebElement AdjuntarTicket = wait.until(presenceOfElementLocated(GestionarReintegrosPage.AdjTicket));
        AdjuntarTicket.sendKeys("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\Adjuntos\\TestOsde.pdf");
        WebElement TerminosCondic = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.TyCTicket));
        TerminosCondic.click();
        WebElement BotonEnviar = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegrosPage.EnviarTicket));
        BotonEnviar.click();
        Thread.sleep(15000);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, -250);");

        Thread.sleep(5000);
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\MedicamentosTicket.png");
        FileUtils.copyFile(scrFile, screenshotFile);

    }

    @AfterMethod(alwaysRun = true)
    public void close(){
        CerrarBrowser();
    }

}