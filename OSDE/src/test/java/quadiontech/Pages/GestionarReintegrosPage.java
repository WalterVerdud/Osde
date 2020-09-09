package quadiontech.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class GestionarReintegrosPage {

    // ----------- Usuarios------------------------------
    public static String[] Usuario = {"23755943", "osde2023"};
    public static String[] Usuario2 ={};
    public static String[] Usuario3 ={};

    //------Tipos de Practicas------------
    public static By PracticaLocator = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[2]");
    public static By PracticaLocator1 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[3]");
    public static By PracticaLocator2 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[4]");
    public static By PracticaLocator3 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[5]/a");
    public static By PracticaLocator4 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[6]/a");
    public static By PracticaLocator5 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[7]/a");
    public static By PracticaLocator6 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[8]/a");
    public static By PracticaLocator7 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[9]/a");
    public static By PracticaLocator8 = By.xpath("//*[@id=\"dk_container_opt_TipoPractica_c\"]/div/ul/li[10]/a");

    // Listado de tipo de practicas
    public static By ComboBoxLocator = By.id("dk_container_opt_TipoPractica_c");

    // Localizadores comun en todas las practicas
    public static By TiposDocumento = By.id("dk_container_opt_tipoDocumento");
    public static By Dni = By.linkText("DNI");
    public static By NroDni = By.id("txt_documento");
    public static By SeleccComprobante = By.id("dk_container_opt_Comprobante_c");
    public static By ComprobanteC = By.linkText("Factura C");
    public static By TextPtoVta = By.id("txt_puntoVentaComprobante");
    public static By TextNroComp = By.id("txt_numeroComprobante");
    public static By FechaEmision = By.id("txt_fechaComprobante");
    public static By Cae = By.id("txt_CAE_c");
    public static By FechaVencim = By.id("txt_fechaCae");
    public static By Campo = By.xpath("//*[@id=\"tblCamposFactura\"]/tbody/tr[10]/td[2]");
    public static By TextBoxImporte = By.id("txt_Importe_c");
    public static By BoxTyC = By.id("terminos-condiciones-id-Factura");
    public static By EnviarReintegro = By.id("btnEnviar");

    // Pop-up Odontologia
    public static By PopUp = By.linkText("close");
    

    //Adjuntar Pedido Medico
    public static By AdjPedidoMedico = By.id("imageFilePedido");
    public static By AdjComprobante = By.id("imageFileComprobante");
    public static By AdjTicket = By.id("imageFileComprobanteTicket");


    // Localizador Seleccion de Socios
    public static By Socio = By.linkText("GIAN LUCA VIANI");
    public static By Socio1 = By.linkText("FIORELLA VIANI");
    public static By Socio2 = By.linkText("VIRNA MOTTINO");
    public static By Socio3 = By.linkText("LEAN VIANI");


    //Localizadores del modulo de reintegros
    public static By SolicitarReintegro = By.id("itemMenu_316.317");
    public static By SeleccioneSocio = By.linkText("Seleccione...");
    public static By NroCuit = By.id("txt_CUIT_c");


    //Localizador Cantidad de sesiones
    public static By CantidadSesiones = By.id("txt_sesiones_facturadas_c");


    // Volver a inicio, cerrar sesion y cerrar browser
    public static By VolverInicio = By.linkText("VOLVER AL INICIO");
    public static By CerrarSesion = By.linkText("Salir");


    //Localizadores de Ticket o Factura
    public static By Factura = By.id("rbFactura");
    public static By Ticket = By.id("rbTicket");

    // Localizadores con Ticket
    public static By TicketCuit = By.id("txt_CUIT_T");
    public static By PtoVentaTicket = By.id("txt_puntoVentaComprobanteTicket");
    public static By CompNroTicket = By.id("txt_numeroComprobanteTicket");
    public static By FechaTicket = By.id("txt_fechaComprobanteTicket");
    public static By ImporteTicket = By.id("txt_Importe_T");
    public static By TyCTicket = By.id("terminos-condiciones-id-Ticket");
    public static By EnviarTicket = By.id("btnEnviarTicket");


}