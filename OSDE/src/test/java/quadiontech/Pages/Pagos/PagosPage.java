package quadiontech.Pages.Pagos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PagosPage {
    WebDriver driver;

    public static String[] Usuario3 = {"13305064", "osde2023"};

    public static By RealizarPagos = By.id("itemMenu_326.329");
    public static By CheckBoxPago = By.xpath("//*[@id=\"ticket_body\"]/div[1]/div[1]/label");
    public static By checkTyC = By.id("terminos-condiciones-id");
    public static By BtnPagar = By.id("btnPagar");
    public static By TarjDebito = By.id("chkDebito");
    public static By TarjCredito = By.id("chkCredito"); // hacer scrpt con if para seleccionar pago con tarjeta de credito
    public static By BtnSiguiente = By.id("btnTarjetasCont");


    //Datos Visa Debito
    public static By VisaDebito = By.id("visaDebito");
    public static By NroTarjeta = By.id("numeroTarjetaBox");
    public static By NombreApellido = By.id("nombreTarjetaBox");
    public static By FechaExpira = By.id("expBox");
    public static By CodSeguridad = By.id("codSegBox");
    public static By NroDni = By.id("documentoBox");
    public static By checkMail = By.id("chkEmail");
    public static By Siguientebtn = By.id("btnTarjetasSig");
    public static By BtnConfirmar = By.id("botonEnviar");
    public static By VerComprobante = By.id("verComprobantePago");
    public static By IrGestionesOnline = By.linkText("Gestiones online");
    public static By CerrarSesion = By.linkText("Salir");


    //volver al inicio
    public static By volverInicio = By.linkText("VOLVER AL INICIO");


    //Descargar comprobante
    public static By verComprobante = By.id("verComprobantePago");
    public static By DescargarComprobante = By.id("descargarComprobante");






    //Realizar captura de pantalla del pago realizado, realizar un assert y descargar el comprobante












}