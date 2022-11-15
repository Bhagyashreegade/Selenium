import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage_With_POM {

    WebDriver driver;
    //Locator for username field
    By uName = By.id("email");
    //Locator for password field
    By pswd = By.id("pass");
    //Locator for login button
    By loginBtn = By.name("login");

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage_With_POM(WebDriver driver) {
        this.driver = driver;
    }

    //Method to enter username
    public void enterUsername(String user) {
        driver.findElement(uName).sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        driver.findElement(pswd).sendKeys(pass);
    }

    //Method to click on Login button
    public void clickLogin() {
        driver.findElement(loginBtn).click();
    }


}
