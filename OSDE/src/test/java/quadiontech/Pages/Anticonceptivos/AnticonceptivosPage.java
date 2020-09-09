package quadiontech.Pages.Anticonceptivos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class AnticonceptivosPage {

    public static  String[] Usuario = {"23755943","osde2023"};

    //Localizadores
    public static By Anticonceptivos = By.id("itemMenu_4.332.319");
    public static By ContainerSocias = By.id("dk_container_opt_Beneficiaros_c");
    public static By SociaEmpadronada = By.linkText("VIRNA MOTTINO");
    public static By btnEnviar = By.id("btnEnviar");
    public static By VolverInicio = By.linkText("VOLVER AL INICIO");
    public static By CerrarSesion = By.linkText("Salir");

}
