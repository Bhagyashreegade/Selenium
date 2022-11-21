package datadriventesting;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class DataDriven_Excel {

    WebDriver driver;

    @BeforeClass  //will be executing once before the class
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "LoginData")
    public void loginTest(String user, String pass, String result) {
        driver.get("https://admin-demo.nopcommerce.com/login");

        WebElement txtEmail = driver.findElement(By.id("Email"));
        txtEmail.clear();
        txtEmail.sendKeys(user);

        WebElement txtPass = driver.findElement(By.id("Password"));
        txtPass.clear();
        txtPass.sendKeys(pass);

        WebElement loginBtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
        loginBtn.click();

        String exp_title = "Dashboard / nopCommerce administration";
        String actual_title = driver.getTitle();

        if (result.equals("valid")) {
            if (exp_title.equals(actual_title)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(true);
            } else {
                Assert.assertTrue(false);
            }
        } else if (result.equals("Invalid")) {
            if (exp_title.equals(actual_title)) {
                driver.findElement(By.linkText("Logout")).click();
                Assert.assertTrue(false);
            } else {
                Assert.assertTrue(true);
            }
        }
    }

    /*without any looping statement, test can be executed multiple times
     depending on the data provided in DataProvider method*/
    @DataProvider(name = "LoginData")
    public String[][] getData() throws IOException {

        String path = "C:\\Users\\Bhagyashree\\IdeaProjects\\Selenium_October\\datafiles\\Test Data for login.xlsx";
        ExcelUtility xu = new ExcelUtility(path);
        int totalrows = xu.getRowCount("TestData");
        int totalcols = xu.getCellCount("TestData", 1);

        String loginData[][] = new String[totalrows][totalcols];
        for (int i = 1; i <= totalrows; i++) {
            for (int j = 0; j < totalcols; j++) {
                loginData[i - 1][j] = xu.getCellData("TestData", i, j);

            }
        }
        return loginData;
    }

    @AfterClass
    public void teardown() {
        driver.quit();
    }
}
