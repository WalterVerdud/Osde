package quadiontech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutorizacionesPage {
    WebDriver driver;

    public static String[] Usuario = {"23755943", "osde2023"};


    //Localizadores Autorizar Medicamentos

    public static  By Medicamentos = By.id("itemMenu_4.104.112");
    public static  By seleccSocio =  By.xpath("//*[@id='dk_container_ddlSocios']/div/ul/li[1]/a");
    public static  By socio = By.linkText("VIRNA MOTTINO-23 247264 3 02");
    public static  By campo = By.id("Medicamentos_repeaterCampos_ctl00_141");
    public static  By detalleTexto = By.id("Medicamentos_repeaterCampos_ctl00_141");
    public static  By pedidoMedico = By.id("imageFilePedido");
    public static  By termCondiciones = By.id("terminos_condiciones");
    public static  By enviar = By.id("btnEnviar");



    // Internacion/Cirugia

    public static By Internacion = By.id("itemMenu_4.104.105");
    public static By Socios = By.xpath("//*[@id='dk_container_ddlSocios']/div/ul/li[1]/a");



}


