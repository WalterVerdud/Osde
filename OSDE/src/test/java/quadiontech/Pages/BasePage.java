package quadiontech.Pages;

import commom.Constants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public WebDriver driver;

    private WebDriver createDriver() {
        String driverToUse = System.getProperty("DRIVER");

        try {
            URL url = new URL(driverToUse);
            RemoteWebDriver driver = new RemoteWebDriver(url, new ChromeOptions());
            driver.setFileDetector(new LocalFileDetector());

            return driver;
        } catch (MalformedURLException e) {
            driverToUse = "chromelocal";
            // Fall through, so we use the local ChromeDriver
        }

        if (driverToUse == null || driverToUse.toLowerCase().equals("chromelocal")) {

            String myOS = System.getProperty("os.name");
            myOS = myOS.toLowerCase();

            if (myOS.contains("mac")) {
                System.setProperty("webdriver.chrome.driver", Constants.chromeDriverMac);
            } else {
                System.setProperty("webdriver.chrome.driver", Constants.chromeDriverWindows);
            }

            ChromeDriver driver = new ChromeDriver();

            return driver;
        }

        return null;
    }




    /// WEBMOBILE: START
    public void initBrowser() {
        try {

            By btnAdvancedLocator = By.id("details-button");
            By linkProceedLocator = By.id("proceed-link");

            driver = createDriver();

            driver.manage().window();
            driver.get(Constants.WebIDM_URLTEST);
            WebDriverWait wait = new WebDriverWait(driver, 30);
            WebElement btnAdvanced = wait.until(ExpectedConditions.visibilityOfElementLocated(btnAdvancedLocator));
            btnAdvanced.click();
            WebElement linkProceed = wait.until(ExpectedConditions.visibilityOfElementLocated(linkProceedLocator));
            linkProceed.click();
        } catch (Exception e) {
            System.out.println("The cause is: " + e.getCause());
            System.out.println("Message is: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void closeBrowser() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();
        driver.quit();
    }
    /// WEBMOBILE: END

    /// WEB: START
    public void abrir() {

        By btnAdvancedLocator = By.id("details-button");
        By linkProceedLocator = By.id("proceed-link");

        driver = createDriver();

        driver.manage().window().maximize();
        //Login provisorio de IDM
        driver.get(Constants.WebIDM_URLTEST);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        WebElement btnAdvanced = wait.until(ExpectedConditions.visibilityOfElementLocated(btnAdvancedLocator));
        btnAdvanced.click();
        WebElement linkcontinuar = wait.until(ExpectedConditions.visibilityOfElementLocated(linkProceedLocator));
        linkcontinuar.click();
        driver.navigate().refresh();
        //Login clasico
        driver.get(Constants.WebURL_TEST);
    }

    public void CerrarBrowser() {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.close();
        driver.quit();
    }
}

