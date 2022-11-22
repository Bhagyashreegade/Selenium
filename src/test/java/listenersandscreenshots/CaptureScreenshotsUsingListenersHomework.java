package listenersandscreenshots;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners(CustomListenersScreenshot.class)

public class CaptureScreenshotsUsingListenersHomework extends Base {

    @BeforeClass
    void setUp() {
        initialization();
    }
//
    @Test
    void logoTest() {
        WebElement logo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[1]/img"));
        Assert.assertTrue(logo.isDisplayed(), "Logo is not displayed");
        Assert.assertTrue(true);
    }

    @Test
    void homePageTitle() {
        String title = driver.getTitle();
        Assert.assertEquals(title, "Orangehrm", "Title is not matched");
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }

}
