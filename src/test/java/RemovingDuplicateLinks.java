import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicateLinks {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();


        //to capture all the links of webpage
        List<WebElement> lists = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("No of links on webpage is : " + lists.size());
        Set<WebElement> s = new HashSet<WebElement>(lists);
        System.out.println("The number of links after removing duplicates :  " + s.size());

        //for (WebElement list : lists) {
        //System.out.println(list.getText());
        if (s.size() == lists.size()) {
            System.out.println("The Webpage doesn't have duplicate links");
        } else {
            System.out.println("The webpage has a duplicate links");
        }

    }
}
//}
