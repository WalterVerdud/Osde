package quadiontech.Pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Capturas {
    WebDriver driver;

    public void ScreenShotReintegros() throws InterruptedException, IOException {
        Thread.sleep(5000);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyMMdd-HHmm");
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotFile = new File("C:\\Users\\Walter\\IdeaProjects\\OSDE\\src\\test\\resources\\CapturasReintegros\\ConsultaMedica.png");
        FileUtils.copyFile(scrFile, screenshotFile);
        Reporter.log("Captura Realizada");
    }
}
