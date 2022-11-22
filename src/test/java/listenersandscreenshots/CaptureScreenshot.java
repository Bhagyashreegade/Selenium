package listenersandscreenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class CaptureScreenshot {

//    @Test
//    public void setup() {
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://demo.nopcommerce.com/");
//        driver.manage().window().maximize();
//
//        // 1---->page screenshot
//        //TakesScreenshot is an Interface and to take the screenshot we need to assign the driver to the TakeScreenshot.
//        //typecast is done as WebDriver and TakesScreenshot is two different Interface.
//        //if driver instance is created as Chromedriver driver, then there is no need to tyoecast.
//        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//
//
//        try {
//            FileUtils.copyFile(screenshot, new File("C:\\screenshots\\homepageScreenshots.bmp"));
//        } catch (IOException e) {
//            System.out.println(e.getMessage());
//        }
//    }

    @Test
    public void fullscreenshot() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        // 2----> full page screenshot
        //TakesScreenshot is an Interface and to take the screenshot we need to assign the driver to the TakeScreenshot.
        //typecast is done as WebDriver and TakesScreenshot is two different Interface.
        //if driver instance is created as Chromedriver driver, then there is no need to tyoecast.
       // File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Screenshot screenshot1 = new AShot().takeScreenshot(driver);
        try {
            ImageIO.write(screenshot1.getImage(),"BMP",new File("C:\\screenshots\\fullhomepagescreenshots.bmp"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        driver.quit();
    }
}
