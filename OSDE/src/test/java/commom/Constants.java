package commom;

public class Constants {

    // AMBIENTE TEST SITIO WEB
    public static String WebIDM_URLTEST = "https://testosde.osde.ar/authswitch.asp?key=CL0UD2020";
    public static String WebURL_TEST = "https://testosde.osde.ar/index.html#!homepage.html";

    // PATH DE DRIVERS
    public static String chromeDriverMac = "src/test/resources/macDrivers/chromedriver";
    public static String chromeDriverWindows = "src/test/resources/Driver/chromedriver.exe";

    // TEXTO LIBRE
    public static String textoLibre = "Texto libre de prueba abcd ABCD 123450 10 ¡¡!!¿¿??";
    public static String textoNumerico = "0123456789";

    // RUTA DE ARCHIVOS ADJUNTOS
    public static String imagenValidaJPG = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/1-JPG-valido.jpg";
    public static String imagenInvalidaJPG = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/2-JPG-invalido.jpg";
    public static String imagenValidaPNG = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/3-PNG-valido.png";
    public static String imagenInvalidaPNG = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/4-PNG-invalido.png";
    public static String imagenValidaPDF = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/5-PDF-valido.pdf";
    public static String imagenInvalidaPDF = System.getProperty("user.dir") + "/src/test/resources/Archivos adjuntos/6-PDF-invalido.pdf";



}
