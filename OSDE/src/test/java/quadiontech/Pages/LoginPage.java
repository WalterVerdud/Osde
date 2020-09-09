package quadiontech.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    //localizadores login

    By btnIniciarSesion = By.id("btnInitSession");
    By inputUser = By.id("username");
    By inputPass = By.id("password");
    By btnIngresar = By.id("botonIngresar");

    // Localizadores para ingresar a los Modulos de Gestiones Online

    By gestionesOnlines = By.linkText("Gestiones Online");
    By anticonceptivos = By.xpath("//*[@id=\"tramites_en_linea\"]/nav/ul/li[2]/img");
    By autorizaPrestacion = By.xpath("//*[@id=\"tramites_en_linea\"]/nav/ul/li[3]/a");
    By Pagos = By.xpath("//*[@id=\"tramites_en_linea\"]/nav/ul/li[5]/img");
    By GestionarReintegros = By.xpath("//*[@id=\"tramites_en_linea\"]/nav/ul/li[1]/img");



    public void abrir(){

        By btnAdvancedLocator = By.id("details-button");
        By linkProceedLocator = By.id("proceed-link");

        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Walter\\IdeaProjects\\ProjectTest\\src\\test\\resources\\Drivers\\chromedriver.exe");
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

    public void loginHome(WebDriver driver, String[] USERDATA){
        WebDriverWait wait = new WebDriverWait(driver, 25);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys("USERDATA[1]");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys("USERDATA[2]");

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();
    }
    //Login, Gestiones online y autorizar una prestacion
    public void LoginGestionesOnline(){
        WebDriverWait wait = new WebDriverWait(driver, 25);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys("23755943");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys("osde2023");

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();

        WebElement btnGestionesOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(gestionesOnlines));
        btnGestionesOnline.click();

    }

    public void LoginAutorizaciones(WebDriver driver, String[] USERDATA){
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys("23755943");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys("osde2023");

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();

        WebElement btnGestionesOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(gestionesOnlines));
        btnGestionesOnline.click();

        WebElement btnAutorizarPrestacion = wait.until(ExpectedConditions.visibilityOfElementLocated(autorizaPrestacion));
        btnAutorizarPrestacion.click();
    }

    public void LoginAnticonceptivos(WebDriver driver, String[] USERDATA){
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys("23755943");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys("osde2023");

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();

        WebElement btnGestionesOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(gestionesOnlines));
        btnGestionesOnline.click();

        WebElement anticoncep = wait.until(ExpectedConditions.visibilityOfElementLocated(anticonceptivos));
        anticoncep.click();
    }

    public void LoginPagos(WebDriver driver, String[] USERDATA){
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys("13305064");

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys("osde2023");

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();

        WebElement btnGestionesOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(gestionesOnlines));
        btnGestionesOnline.click();

        WebElement realizarPago = wait.until(ExpectedConditions.visibilityOfElementLocated(Pagos));
        realizarPago.click();
    }

    public void LoginReintegros(WebDriver driver, String[] USERDATA){
        WebDriverWait wait = new WebDriverWait(driver, 30);

        WebElement btnIniSesion = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIniciarSesion));
        btnIniSesion.click();

        WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(inputUser));
        user.sendKeys(USERDATA[0]);

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(inputPass));
        password.sendKeys(USERDATA[1]);

        WebElement ingresar = wait.until(ExpectedConditions.visibilityOfElementLocated(btnIngresar));
        ingresar.click();


        WebElement btnGestionesOnline = wait.until(ExpectedConditions.visibilityOfElementLocated(gestionesOnlines));
        btnGestionesOnline.click();

        WebElement reintegros = wait.until(ExpectedConditions.visibilityOfElementLocated(GestionarReintegros));
        reintegros.click();
    }


}
