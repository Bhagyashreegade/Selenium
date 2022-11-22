package listenersandscreenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Base {

    public static WebDriver driver;

    public static void initialization() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public void failed() {
        Screenshot screenshot1 = new AShot().takeScreenshot(driver);
        try {
            ImageIO.write(screenshot1.getImage(), "PNG", new File("C:\\screenshots\\orangehrm.bmp"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
