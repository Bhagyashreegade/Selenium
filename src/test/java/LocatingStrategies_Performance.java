import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingStrategies_Performance {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.navigate().to("https://www.javatpoint.com/selenium-webdriver-commands");

        System.out.println(driver.getCurrentUrl());

    }
}
