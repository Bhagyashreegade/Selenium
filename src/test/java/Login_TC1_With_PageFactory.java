import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Login_TC1_With_PageFactory {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        //Creating object of Login page
        LoginPage_With_POM login = new LoginPage_With_POM(driver);

        //Enter username & password
        login.enterUsername("bhagyashreegade91@gmail.com");
        login.enterPassword("test123");

        //Click on login button
        login.clickLogin();
        // Thread.sleep(3000);

        //Close browser instance
        driver.quit();
    }
}
