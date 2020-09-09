package quadiontech.Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import quadiontech.Pages.AutorizacionesPage;
import quadiontech.Pages.BasePage;
import quadiontech.Pages.LoginPage;

public class Internacion extends BasePage {


    @BeforeMethod
    public void setUp(){
        abrir();
    }

    @Test
    public void internacinCirugia(){
        WebDriverWait wait = new WebDriverWait(driver, 30);

        LoginPage loginPage = new LoginPage();
        loginPage.LoginAutorizaciones(driver, AutorizacionesPage.Usuario);

        WebElement AutorizarMedicamento = wait.until(ExpectedConditions.visibilityOfElementLocated(AutorizacionesPage.Medicamentos));
        AutorizarMedicamento.click();
        WebElement ContainerSocio = wait.until(ExpectedConditions.visibilityOfElementLocated(AutorizacionesPage.seleccSocio));
        ContainerSocio.click();
    }

    @AfterMethod
    public void tearDown(){
        CerrarBrowser();
    }
}

