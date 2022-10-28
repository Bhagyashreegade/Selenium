import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Links_BrokenLinks {
    public static void main(String[] args) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Bhagyashree\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.deadlinkcity.com/");
        driver.manage().window().maximize();


        //to capture all the links of webpage
        List<WebElement> lists = driver.findElements(By.xpath("//a[@href]"));
        System.out.println("No of links on webpage is  : " + lists.size());


        //removing duplicate links
        Set<String> s = new HashSet<>();
        for (WebElement l : lists) {
            String url = l.getAttribute("href");
            s.add(url);
        }
        System.out.println("The number of links after removing duplicates :  " + s.size());
        if (s.size() == lists.size()) {
            System.out.println("The Webpage doesn't have duplicate links");
        } else {
            System.out.println("The webpage has a duplicate links");
        }

        //Number of Broken links

        int brokenLinks = 0;
        for (String url : s) {
            System.out.println(url);
            if (url == null || url.isEmpty()) {
                System.out.println("URL is empty");
                continue;
            }

            URL link = new URL(url);
            try {
                HttpURLConnection httpconnect = (HttpURLConnection) link.openConnection();
                httpconnect.connect();
                if (httpconnect.getResponseCode() >= 400) {
                    System.out.println(httpconnect.getResponseCode() + url + "is a Broken Link ");
                    brokenLinks++;
                } else {
                    System.out.println(httpconnect.getResponseCode() + url + "is a Valid Link");
                }


            } catch (Exception e) {

            }

        }

        System.out.println("Number of Broken Links: " + brokenLinks);
        driver.quit();

    }
}

