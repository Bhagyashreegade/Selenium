package pomandpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_With_PageFactory {

    WebDriver driver;
    //Locator for username field
    @FindBy(id = "email")
    WebElement uName;

    //Locator for password field
    @FindBy(id = "pass")
    WebElement pswd;

    //Locator for login button
    @FindBy(name = "login")
    WebElement loginBtn;

    //Constructor that will be automatically called as soon as the object of the class is created
    public LoginPage_With_PageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);  //will create all WebElements
    }

    //Method to enter username
    public void enterUsername(String user) {
        uName.sendKeys(user);
    }

    //Method to enter password
    public void enterPassword(String pass) {
        pswd.sendKeys(pass);
    }

    //Method to click on Login button
    public void clickLogin() {
        loginBtn.click();
    }


}
