import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_Sendkeys_Input_Textbox {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('email').value='bhagyashreegade91@gmail.com'");
        js.executeScript("document.getElementById('pass').value='Bhagya'");
        

    }
}
