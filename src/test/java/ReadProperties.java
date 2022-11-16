import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {

    public static void main(String[] args) throws IOException {
        WebDriver driver = null;

        //creating the Object of Properties class. This is the inbuilt class provided by Java
        Properties p = new Properties();
        //this will stream the properties file in java. The entire path of config.properties file need to be mentioned
        FileInputStream ip = new FileInputStream("C:\\Users\\Bhagyashree\\IdeaProjects\\Selenium_October\\src" +
                "\\test\\java\\config.properties");
        //this will load all the properties from file
        p.load(ip);

        System.out.println(p.getProperty("browser"));
        String b = p.getProperty("browser");

        if (b.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else {
            System.out.println("The browser is not given");
        }

        driver.get(p.getProperty("url"));
        driver.findElement(By.id(p.getProperty("email_id"))).sendKeys(p.getProperty("email"));
        driver.findElement(By.id(p.getProperty("pass_id"))).sendKeys(p.getProperty("password"));
        driver.findElement(By.name(p.getProperty("loginBtn_name"))).click();

        driver.quit();
    }
}
